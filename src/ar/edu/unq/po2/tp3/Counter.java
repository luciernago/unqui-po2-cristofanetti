package ar.edu.unq.po2.tp3;

import java.util.ArrayList;


public class Counter {

	private ArrayList<Integer> contador = new ArrayList<Integer>();

	public Counter() {
		super();
	} 
	
	
	public void addNumber(int x) {
		this.contador.add(x);
	}

	public int cantidadDePares() {	
		return cantidadMultiplosDe(2);
	}
	
	public int cantidadDeImpares() {	
		return contador.size() - cantidadMultiplosDe(2);
	}
	
	public int cantidadMultiplosDe(int x) {
		int suma = 0;
		for(int elemento: contador) {
			if (esMultiplo(elemento, x)) {
				suma++;
			}
		}
		return suma;
	}
	
	private boolean esMultiplo(int x, int y) {
		return x % y == 0;
	}
	
	//Ejercicio 3
	
	public int multiploMayorDe(int x, int y) {
		int num = 1000;
		while (!esMultiplo(num,x) || !esMultiplo(num, y)) {
			num--;
		}
		return num;
	}
	
}
