package ar.edu.unq.po2.tp3;

import java.time.LocalDate;

public class Persona {
	private String nombre;
	private LocalDate fechaNacimiento;
	
	public Persona(String nombre, LocalDate fechaNacimiento) {
		super();
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	
	public int edad() {
		LocalDate hoy = LocalDate.now();
		int edad = hoy.getYear() - fechaNacimiento.getYear();
		if (hoy.getDayOfYear() < fechaNacimiento.getDayOfYear()) {
			edad--;
		}
		return edad;		
	}
	
	public boolean menorQue(Persona persona) {
		boolean esMenor = false;
		if (this.edad()<persona.edad()) {
			esMenor = true;
		}
		return esMenor;
	}
}
