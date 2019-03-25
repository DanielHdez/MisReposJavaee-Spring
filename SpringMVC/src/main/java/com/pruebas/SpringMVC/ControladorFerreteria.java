package com.pruebas.SpringMVC;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller  //Implementa un controlador de MVC
public class ControladorFerreteria {
	@RequestMapping("ferreteria")
	public ModelAndView redireccion()  {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("ferrete");
		return mv;
	}	

}

