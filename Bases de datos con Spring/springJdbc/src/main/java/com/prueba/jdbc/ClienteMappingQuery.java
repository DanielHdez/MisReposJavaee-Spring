package com.prueba.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
	
import javax.sql.DataSource;

import com.prueba.jdbc.model.Cliente;

import org.springframework.jdbc.object.MappingSqlQuery;

public class ClienteMappingQuery extends MappingSqlQuery<Object> {

	public ClienteMappingQuery(DataSource ds) {
		super();
		super.setDataSource(ds);
		super.setSql("SELECT * FROM Cliente");
		compile();
	}
	
	@Override
	protected Object mapRow(ResultSet rs, int numFila) throws SQLException {
		Cliente c = new Cliente();
		c.setNif(rs.getString("NIF"));
		c.setNombre(rs.getString("NOMBRE"));
		c.setTlf(rs.getString("TLF"));
		c.setDomicilio(rs.getString("DOMICILIO"));
		c.setCiudad(rs.getString("CIUDAD"));
		return c;
	}
}

