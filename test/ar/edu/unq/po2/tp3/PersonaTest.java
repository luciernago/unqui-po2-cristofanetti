package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PersonaTest {
	private Persona persona;
	
	@BeforeEach
	public void setUp() throws Exception{
		persona = new Persona("Lucio",LocalDate.of(1994,8,16));
	}
	
	@Test
	public void testGetNombre() {
		String nombre = persona.getNombre();
		assertEquals (nombre, "Lucio");
	}
	
	@Test
	public void testGetFechaNacimiento() {
		LocalDate fechaNacimiento = persona.getFechaNacimiento();
		assertEquals (fechaNacimiento, LocalDate.of(1994,8,16));
	}
	
	@Test
	public void edad() {
		int edad = persona.edad();
		assertEquals (edad, 30);
	}
	
	@Test
	public void menorQue() {
		Persona persona2 = new Persona("Federico", LocalDate.of(1995,4,20));
		boolean esMenor = persona.menorQue(persona2);
		assertEquals (esMenor,false);	
	}
}
	
