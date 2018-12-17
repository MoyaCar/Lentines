package com.Egg.lentines.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cursolentines")
public class CursoLentines {
	
	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;
	
	@Column(name = "nombre")
	private String nombre;       // Nombre del curso
	
	@Column(name = "descripcion")
	private String descripcion; // tipo de curso
	
	@Column(name = "lentines")
	private int lentines;   // cantidad de lentines inscriptos al curso
	
	@Column(name = "horas")
	private int horas;     // cantidad de horas de curso

	
	public CursoLentines(int id, String nombre, String descripcion, int lentines, int horas) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.lentines = lentines;
		this.horas = horas;
	}

	public CursoLentines() {

	}
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getLentines() {
		return lentines;
	}

	public void setLentines(int lentines) {
		this.lentines = lentines;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}



}
