package com.Egg.lentines.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.Egg.lentines.model.AlumnoL;

@Controller
@RequestMapping("/lentines")
public class LentinesController {

	public static final String V_lentin = "lentinesmain";
	
	@GetMapping("/hola")
	public ModelAndView HolaLentines() {
		
		ModelAndView MaV = new ModelAndView(V_lentin);
		
		MaV.addObject("lentin", new AlumnoL("Valentin", 25000666, 50));
	
		return MaV;
		
	}
	
	
}
