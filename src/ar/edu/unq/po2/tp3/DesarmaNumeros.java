package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class DesarmaNumeros {
	
	private ArrayList<Integer> numeros = new ArrayList<Integer>();
	
	public DesarmaNumeros() {
		super();
	}
	
	public void addNumber(int x) {
		this.numeros.add(x);
	}
	
	public int numeroConMasDigitosPares() {
		int num = 0;
		int cant = 0;
		for(int elemento: numeros) {
			int cantPares = cantidadDeParesEnNumero(elemento); 
			if (cantPares > cant) {
				num = elemento;
				cant = cantPares;
			}
		}
		return num;
	}
	
	private int cantidadDeParesEnNumero(int x) {
		int num = x;
		int cant = 0;
		while (num!=0) {
			if (esPar(num)) {
				cant++;
			}
			num = num/10;
		}
		return cant;
	}
	
	private boolean esPar(int x) {
		return x % 2 == 0;
	}
}

