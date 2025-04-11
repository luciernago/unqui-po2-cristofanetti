package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class Multioperador {
	
	private ArrayList<Integer> array;
	
	public Multioperador() {
		super();
	}
	
	public void setArray(ArrayList<Integer> a) {
		this.array = a;
	}
	
	public int suma() {
		int resultado = 0;
		for(int elemento:array) {
			resultado = resultado + elemento;
		}
		return resultado;
	}
	
	public int resta() {
		int valorInicial = array.getFirst();
		return valorInicial*2 - this.suma();
	}
	
	public int multiplicacion() {
		int resultado = 1;
		for(int elemento:array) {
			resultado = resultado * elemento;
		}
		return resultado;
	}
	
	
}
