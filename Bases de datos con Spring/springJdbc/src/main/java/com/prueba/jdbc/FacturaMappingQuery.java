package com.prueba.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.jdbc.object.MappingSqlQuery;

public class FacturaMappingQuery extends MappingSqlQuery<Object> {

	public FacturaMappingQuery(DataSource ds) {
		super();
		super.setDataSource(ds);
		String sql = "SELECT FACTURA.NUMERO, FECHA, PAGADO, NIF, CODIGO, UNIDADES, PRECIO FROM FACTURA "+
				"INNER JOIN DETALLE ON FACTURA.NUMERO = DETALLE.NUMERO ORDER BY NUMERO";
		super.setSql(sql);
		compile();
	}
	
	@Override
	protected Object mapRow(ResultSet rs, int numFila) throws SQLException {
		Object[] f = new Object[7];
		f[0] = rs.getInt("NUMERO");
		f[1] = rs.getDate("FECHA");
		f[2] = rs.getBoolean("PAGADO");
		f[3] = rs.getString("NIF");
		f[4] = rs.getString("CODIGO");
		f[5] = rs.getFloat("UNIDADES");
		f[6] = rs.getFloat("PRECIO");
		return f;
	}
}
