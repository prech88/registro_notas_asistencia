package ar.edu.unju.fi.model;

public class Alumno {
	private Integer legajo;
	private String nombre;
	private String apellido;
	
	public Alumno() {
		// TODO Auto-generated constructor stub
	}

	public Alumno(Integer legajo, String nombre, String apellido) {
		this.legajo = legajo;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	@Override
	public String toString() {
		return "legajo=" + legajo + ", nombre=" + nombre + ", apellido=" + apellido;
	}

	public Integer getLegajo() {
		return legajo;
	}

	public void setLegajo(Integer legajo) {
		this.legajo = legajo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
}
