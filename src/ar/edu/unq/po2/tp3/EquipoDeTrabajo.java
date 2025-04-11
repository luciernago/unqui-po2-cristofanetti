package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class EquipoDeTrabajo {
	private String nombre;
	private ArrayList<Persona2> integrantes;
	
	public EquipoDeTrabajo (String nombre) {
		this.nombre = nombre;
		this.integrantes = new ArrayList<Persona2>(); 
	}
	
	public String nombre() {
		return nombre;
	}
	
	public void agregarIntegrante(Persona2 p) {
		integrantes.add(p);
	}
	
	public int promedioEdad() {
		int edad = 0;
		int cantIntegrantes = integrantes.size();
		for(Persona2 elemento:integrantes) {
			edad = edad + elemento.getEdad();
		}
		return edad / cantIntegrantes;
	}
	
	
}
