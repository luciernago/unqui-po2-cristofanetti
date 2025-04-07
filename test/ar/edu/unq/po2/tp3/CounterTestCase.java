package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CounterTestCase {
	
	private Counter counter;
	
	/**
	 * Crea un escenario de test básico,que consiste en un contador
	 * con 10 enteros
	 */
	
	@BeforeEach
	public void setUp() throws Exception {
		// se crea el contador
		counter = new Counter();
		
		//se agregan los números. un solo par y nueve pares
		counter.addNumber(1);
		counter.addNumber(3);
		counter.addNumber(5);
		counter.addNumber(7);
		counter.addNumber(269);
		counter.addNumber(22422425);
		counter.addNumber(25643);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(4);
			
	}
	@Test
	public void testCantidadDeImpares() {
		// Obteniendo la cantidad de pares
			int amount = counter.cantidadDeImpares();
		
		// Chequeo que la cantidad es la esperada
			assertEquals(amount, 9);
	}
	
	@Test
	public void testCantidadDePares() {
		// Obteniendo la cantidad de pares
			int amount = counter.cantidadDePares();
		
		// Chequeo que la cantidad es la esperada
			assertEquals(amount, 1);
	}
	
	@Test
	public void testCantidadDeMultilplosDe3() {
		// Obteniendo la cantidad de pares
			int amount = counter.cantidadMultiplosDe(3);
		
		// Chequeo que la cantidad es la esperada
			assertEquals(amount, 1);
	}
	
	// Ejercicio 2
	
	@Test
	public void testNumeroConMasDigitosPares() {
		// Obteniendo el numero con mas digitos pares
			int num = counter.numeroConMasDigitosPares();
		// Chequeo que el numero es 
			assertEquals(num, 22422425);
			
	}
	
	// Ejercicio 3
	
	@Test
	public void testMultiploMayor() {
		// Obteniendo el multiplo mayor de 3 y 9
			int num = counter.multiploMayorDe(3, 9);
	    // Chequeo que el numero es 999
			assertEquals(num, 999);
		// Obteniendo el multiplo mayor de 3 y 9
			num = counter.multiploMayorDe(3, 8);
	    // Chequeo que el numero es 984
			assertEquals(num, 984);
			
	}

}
