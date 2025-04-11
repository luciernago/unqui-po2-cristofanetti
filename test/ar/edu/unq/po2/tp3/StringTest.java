package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Ignore;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StringTest {

	String a;
	String s;
	String t;
	
	@BeforeEach
	public void setUp() throws Exception {
		//se asignan las variables
		
		a = "abc";
		s = a;
		
	}
	
	@Test
	public void testLengthS() {
		int lengthS = s.length();
		assertEquals(lengthS,3);
	}
	
	@Ignore
	public void testLengthT() {
		int lengthT = t.length();
		assertEquals(lengthT,0);
	} //Falla por que t no esta asignado y por lo tanto no se puede dara una longitud
	
	
	@Test
	public void testConcatenar() {
		String concatenado = 1 + a;
		assertEquals(concatenado,"1abc");
	}
	
	@Test
	public void testUpperCase() {
		String mayuscula = a.toUpperCase();
		assertEquals(mayuscula,"ABC");
	}
	
	@Test
	public void testIndex() {
		int indice = "Libertad".indexOf("r");
		assertEquals(indice,4);
	}
	
	@Test
	public void testIndex2() {
		int indice = "Universidad".lastIndexOf("i");
		assertEquals(indice,7);
	}
	
	@Test
	public void testSubstring() {
		String sub = "Quilmes".substring(2,4);
		assertEquals(sub, "il");
	}
	
	@Test
	public void testStartsWith() {
		String concatenado = (a.length()+a);
		boolean empiezaConA = concatenado.startsWith("a");
		assertEquals(empiezaConA, false);
	}
	
	@Test
	public void testComparacion() {
		assertEquals(s==a, true);
	}
	
	@Test
	public void testSubstring2() {
		String sub = a.substring(1,3);
		assertEquals(sub, "bc");
	}
}
