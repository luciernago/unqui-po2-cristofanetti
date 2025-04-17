package ar.edu.unq.po2.tp4;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TrabajadorTest {
	private Trabajador juan;
	private List<Ingreso> ingresos;
	private Ingreso haberesMensual;
	private Ingreso aguinaldo;
	private IngresoHorasExtra horasExtra;
	
	@BeforeEach
	public void setUp() {
		haberesMensual = new Ingreso("haberes", 10000d);
		aguinaldo = new Ingreso("haberes", 5000d);
		horasExtra = new IngresoHorasExtra("haberes", 1000d, 4);
		
		ingresos = new ArrayList<Ingreso>();
		ingresos.add(haberesMensual);
		ingresos.add(aguinaldo);
		ingresos.add(horasExtra);
		
		juan = new Trabajador(ingresos);
	}
	
	@Test
	public void testGetTotalPercibido() {
		Double totalPercibido = juan.getTotalPercibido();
		assertEquals(16000d,totalPercibido);
	}
	
	@Test
	public void testGetMontoImponible() {
		Double montoImponible = juan.getMontoImponible();
		assertEquals(15000d,montoImponible);
	}
	
	@Test
	public void testImpuestoAPagar() {
		Double impuestoAPagar = juan.getImpuestoAPagar();
		assertEquals(300d,impuestoAPagar);
	}

}
