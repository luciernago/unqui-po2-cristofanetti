package ar.edu.unq.po2.tp5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CajaTest {
	private Caja cajaSuper;
	private Producto arroz;
	private Producto leche;
	
	@BeforeEach
	public void setUp() {
		cajaSuper = new Caja();
		arroz = new ProductoEmpresa(2500d, 30);
		leche = new ProductoCooperativa(1500d, 20);
	}
	
	@Test
	public void testGetMontoAPagar() {
		cajaSuper.registrarItem(arroz);
		cajaSuper.registrarItem(leche);
		assertEquals(3850d, cajaSuper.getMontoAPagar());
	}
	
	@Test
	public void testRegistrarProducto() {
		cajaSuper.registrarItem(arroz);
		assertEquals(29,arroz.getStock());
	}
}
