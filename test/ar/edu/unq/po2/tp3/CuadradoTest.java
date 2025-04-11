package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CuadradoTest {
	public Cuadrado cuadrado;
	
	@BeforeEach
	public void setUp() throws Exception{
		Point punto = new Point();
		cuadrado = new Cuadrado(punto,4);
	}
	
	@Test
	public void testArea() {
		int area = cuadrado.area();
		assertEquals (area,16);
	}
	
	@Test
	public void testPerimetro() {
		int perimetro = cuadrado.perimetro();
		assertEquals (perimetro,16);
	}
}
