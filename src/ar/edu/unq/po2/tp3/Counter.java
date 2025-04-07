package ar.edu.unq.po2.tp3;

import java.util.List;
import java.util.ArrayList;

public class Counter {

	private List<Integer> contador = new ArrayList<Integer>();

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
	
	//Ejercicio 2
	
	public int numeroConMasDigitosPares() {
		int num = 0;
		int cant = 0;
		for(int elemento: contador) {
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
			if (esMultiplo(num,2)) {
				cant++;
			}
			num = num/10;
		}
		return cant;
	}
	
	//Ejercicio 3
	
	public int multiploMayorDe(int x, int y) {
		int num = 1000;
		while (!(esMultiplo(num,x) && esMultiplo(num, y))) {
			num--;
		}
		return num;
	}
	
}
