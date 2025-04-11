package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EquipoDeTrabajoTest {
	private EquipoDeTrabajo equipo;
	private Persona2 integrante1;
	private Persona2 integrante2;
	private Persona2 integrante3;
	private Persona2 integrante4;
	private Persona2 integrante5;
	
	@BeforeEach
	public void setUp() throws Exception{
		equipo = new EquipoDeTrabajo("Beatles");
		integrante1 = new Persona2 ("John", "Lennon", 20);
		integrante2 = new Persona2 ("Paul", "McCartney", 20);
		integrante3 = new Persona2 ("George", "Harrison", 17);
		integrante4 = new Persona2 ("Ringo", "Star", 21);
		integrante5 = new Persona2 ("George", "Martin", 30);
		equipo.agregarIntegrante(integrante1);
		equipo.agregarIntegrante(integrante2);
		equipo.agregarIntegrante(integrante3);
		equipo.agregarIntegrante(integrante4);
		equipo.agregarIntegrante(integrante5);
	}
	@Test
	public void testPromedioEdad() {
		int promedio = equipo.promedioEdad();
		assertEquals (promedio, 21);
	}
}
