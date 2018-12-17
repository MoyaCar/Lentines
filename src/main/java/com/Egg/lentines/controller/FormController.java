package com.Egg.lentines.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.Egg.lentines.model.AlumnoL;

@Controller
@RequestMapping("/formulario")
public class FormController {

	private static final String Vista_Template = "form";

	@GetMapping("/nuevoformulario")
	public ModelAndView Vista_Formulario() {
		ModelAndView Mav = new ModelAndView(Vista_Template);

		Mav.addObject("nuevo_lentin", new AlumnoL());

		return Mav;

	}
@GetMapping("/")
public String Redirect() {
	
	return "redirect:/formulario/nuevoformulario";
}
	
	private static final String Resultado_Template = "resultado";
	
	@PostMapping("/agregar_lentin")
	public ModelAndView Vista_Resultante(@ModelAttribute("nuevo_lentin")AlumnoL nuevo_lentin) {
		
		ModelAndView Mav = new ModelAndView(Resultado_Template);
		
		Mav.addObject("nuevo_lentin", nuevo_lentin);
		
		return Mav;
		
	}
	

}
