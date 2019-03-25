package com.prueba.jdbc;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.prueba.jdbc.model.Producto;

public class LogicaBD {
	private DataSource dataSource;
	
	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public List<Object> listadoClientes() {
		ClienteMappingQuery listado = new ClienteMappingQuery(dataSource);
		List<Object> clientes = listado.execute();
		return clientes;
	}
	
	public List<Object> listadoDetalles() {
		FacturaMappingQuery listado = new FacturaMappingQuery(dataSource);
		List<Object> facturas = listado.execute();
		return facturas;
	}
	
	public List<Producto> inventario() {
		String sql = "SELECT * FROM PRODUCTO";
		 
		List<Producto> productos = new ArrayList<Producto>();
		JdbcTemplate jdbcTemplate = new JdbcTemplate(this.dataSource);
		List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
		
		for (Map<String, Object> row : rows) {
			Producto p = new Producto();
			p.setCodigo((String) row.get("CODIGO"));
			p.setDescripcion((String) row.get("DESCRIPCION"));
			p.setPrecio((float) row.get("PRECIO"));
			p.setStock((float) row.get("STOCK"));
			p.setMinimo((float) row.get("MINIMO"));
			productos.add(p);
		}
		return productos;
	}	
	
	public Integer ultimoNumFactura() {
		JdbcTemplate jdbcTemplate = new JdbcTemplate(this.dataSource);
		return jdbcTemplate.queryForObject("SELECT MAX(NUMERO) FROM FACTURA", Integer.class);
	}
}
