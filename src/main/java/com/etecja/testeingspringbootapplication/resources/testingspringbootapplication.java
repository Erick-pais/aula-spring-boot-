package com.etecja.testeingspringbootapplication.resources;

import java.text.SimpleDateFormat;


import ch.qos.logback.core.model.Model;

@controller
public class testingspringbootapplication {
	@getMapping("/cursos")
	public String findAll(Model model) throws ParseExeption {
		SimpleDateFormat sf = new SimpleDateFormat ("dd/mm/yyyy");
		Cusos c = new Cursos(1,"Desenvolvimento de Sisatemas", "S", sf.parse("11/03/2024"),null);
		model.addAtribute("cursos",c);
		return "cursos";
		
	}
}
