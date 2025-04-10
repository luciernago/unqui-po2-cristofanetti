package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DesarmaNumerosTest {

	private DesarmaNumeros desarmador;
	
	@BeforeEach
	public void setUp() throws Exception {
		// se crea el contador
		desarmador = new DesarmaNumeros();
		
		//se agregan los números. un solo par y nueve pares
		desarmador.addNumber(269);
		desarmador.addNumber(22422425);
		desarmador.addNumber(25643);
		desarmador.addNumber(1);
		desarmador.addNumber(4);
			
	}
	
	@Test
	public void testNumeroConMasDigitosPares() {
		// Obteniendo el numero con mas digitos pares
			int num = desarmador.numeroConMasDigitosPares();
		// Chequeo que el numero es 
			assertEquals(num, 22422425);
			
	}
}

/**
* DUDA: No estoy reutilizando Counter, esto esta bien?
* -Deberia crear una superclase?
* -Deberia importar Counter?
*/