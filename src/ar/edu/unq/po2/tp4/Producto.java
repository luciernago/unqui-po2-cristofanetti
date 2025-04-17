package ar.edu.unq.po2.tp4;

public class Producto {
	private String nombre;
	private Double precio;
	private boolean precioCuidado = false;
	
	public Producto (String n, Double p) {
		this.nombre = n;
		this.precio = p;
	}
	
	public Producto (String n, Double p, boolean c) {
		this.nombre = n;
		this.precio = p;
		this.precioCuidado = c;
	}

	public String getNombre() {
		return nombre;
	}

	public Double getPrecio() {
		return precio;
	}

	public boolean esPrecioCuidado() {
		return precioCuidado;
	}
	
	public void aumentarPrecio(Double n) {
		this.precio = precio + n;
	}
	
}
