package ar.edu.unq.po2.tpTestDoubles;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PokerStatusTest {

	PokerStatus miStatus;
	
	String c0;
	String c1;
	String c2;
	String c3;
	String c4;
	String c5;
	
	@BeforeEach
	public void setUp() {
		miStatus = new PokerStatus();
		
		c0="5P";
		c1="5C";
		c2="10D";
		c3="5T";
		c4="5D";
	}
	
	@Test
	public void verificarQueSiEsPoquer() {
		assertTrue(miStatus.verificar(c0,c1,c2,c3,c4));
		
	}
	
	@Test
	public void verificarQueNoHay4Iguales() {
		assertFalse(miStatus.verificar(c0,c1,c2,c3,c2));
	}
	
	@Test
	public void hay5IgualesYNoEsPoker() {
		assertTrue(miStatus.verificar(c0,c1,c2,c3,c0));
	}
	
	// public boolean verificar(String c0, String c1, String c2, String c3, String c4)
}
