package com.anotaciones;

import org.springframework.stereotype.Component;

@Component
public class InformeFinanciero implements CreacionInformeFinanciero {

	@Override
	public String getInformeFinanciero() {
		// TODO Auto-generated method stub
		return "Presentacion de informe financiero del trimestre 1";
	}

}
