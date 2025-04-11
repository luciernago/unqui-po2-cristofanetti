package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class MultioperadorTest {
	
	private Multioperador multioperador;
	
	@BeforeEach
	public void setUp() throws Exception {
		multioperador = new Multioperador();
		
		ArrayList<Integer> array = new ArrayList<Integer>();
		
		array.add(10);
		array.add(5);
		array.add(2);
		
		multioperador.setArray(array);
	}
	
	@Test
	public void testSuma() {
		int suma = multioperador.suma();
		assertEquals (suma,17);
	}
	
	@Test
	public void testResta() {
		int resta = multioperador.resta();
		assertEquals (resta,3);
	}
	
	@Test
	public void testMultiplicacion() {
		int multiplicacion = multioperador.multiplicacion();
		assertEquals (multiplicacion,100);
	}
}
