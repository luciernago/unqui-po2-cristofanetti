package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PointTest {
	
	private Point punto1;
	private Point punto2;
	
	@BeforeEach
	public void setUp() throws Exception {
		punto1 = new Point();
		punto2 = new Point(3,5);
		
	}
	
	@Test
	public void testCrearPuntoDefautl() {
		int coordenadaX = punto1.getX();
		int coordenadaY = punto1.getY();
		assertEquals (coordenadaX,0);
		assertEquals (coordenadaY,0);
	}
	@Test
	public void testCrearPuntoConParametros() {
		int coordenadaX = punto2.getX();
		int coordenadaY = punto2.getY();
		assertEquals (coordenadaX,3);
		assertEquals (coordenadaY,5);
	}
	@Test
	public void testMoverA() {
		punto1.moverA(6, 4);
		int coordenadaX = punto1.getX();
		int coordenadaY = punto1.getY();
		assertEquals (coordenadaX,6);
		assertEquals (coordenadaY,4);
	}
	@Test
	public void testSumarA() {
		punto1.moverA(6, 4);
		Point punto3 = punto1.sumarseA(punto2);
		int coordenadaX = punto3.getX();
		int coordenadaY = punto3.getY();
		assertEquals (coordenadaX,9);
		assertEquals (coordenadaY,9);
	}

}
