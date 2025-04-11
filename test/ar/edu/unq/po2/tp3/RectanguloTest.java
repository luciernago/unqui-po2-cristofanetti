package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RectanguloTest {
	public Rectangulo rectangulo;
	
	@BeforeEach
	public void setUp() throws Exception{
		Point punto = new Point();
		rectangulo = new Rectangulo(punto,4,2);
	}
	
	@Test
	public void testArea() {
		int area = rectangulo.area();
		assertEquals (area,8);
	}
	
	@Test
	public void testPerimetro() {
		int perimetro = rectangulo.perimetro();
		assertEquals (perimetro,12);
	}
	
	@Test
	public void testOrientacion() {
		String orientacion = rectangulo.orientacion();
		assertEquals (orientacion,"Vertical");
	}
}