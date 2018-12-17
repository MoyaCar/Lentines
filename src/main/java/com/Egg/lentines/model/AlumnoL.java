package com.Egg.lentines.model;

public class AlumnoL {

	private String nombre;
	private int Dni;
	private int CI;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDni() {
		return Dni;
	}

	public void setDni(int dni) {
		Dni = dni;
	}

	public int getCI() {
		return CI;
	}

	public void setCI(int cI) {
		CI = cI;
	}

	public AlumnoL(String nombre, int dni, int cI) {
		super();
		this.nombre = nombre;
		Dni = dni;
		CI = cI;
	}

	public AlumnoL() {
	}

}
