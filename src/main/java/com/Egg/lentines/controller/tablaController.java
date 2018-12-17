package com.Egg.lentines.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.Egg.lentines.model.AlumnoL;

@Controller
@RequestMapping("/tabla")
public class tablaController {

	
private static final String V_tabla= "tabla";

@GetMapping("/lentines")
public ModelAndView VistaTabla() {
	
	ModelAndView Mav = new ModelAndView(V_tabla);
	
	Mav.addObject("listalentines",getAlumnl());
	
	return Mav;
}
	
private List<AlumnoL> getAlumnl() {

	List<AlumnoL> LentinesList = new ArrayList<>();
	LentinesList.add(new AlumnoL("Valentin", 23000666, 50));
	LentinesList.add(new AlumnoL("Transito", 27888666, 78));
	LentinesList.add(new AlumnoL("Rolento", 3800666, 15));
	
	return LentinesList;
}



}
