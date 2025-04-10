package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class MultiplosTest {
	
	private Multiplos parDeNum = new Multiplos(4,7); 
	
	@Test
	public void test1MultiploMayorDe() {
		//prubbo con los numeros 4 y 7
		int multiploMayor = parDeNum.multiploMayorDe();
		assertEquals(multiploMayor, 980);
	}
	
	@Test
	public void test2MultiploMayorDe() {
		//prubbo con los numeros 3 y 8
		parDeNum.setNum1(3);
		parDeNum.setNum2(8);
		int multiploMayor = parDeNum.multiploMayorDe();
		assertEquals(multiploMayor, 984);
	}
	
}


/**
 * DUDA: De esta forma los numeros estan dentro de los atributos de Multiplos, 
 * por lo tanto para ver si son multiplos debo setearlos en la instancia del objeto. esto esta bien?
 */
