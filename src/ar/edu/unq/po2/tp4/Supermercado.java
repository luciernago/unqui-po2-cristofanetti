package ar.edu.unq.po2.tp4;

import java.util.ArrayList;
import java.util.List;

public class Supermercado {

	private String nombre;
	private String direccion;
	private List<Producto> productos;
	
	public Supermercado(String n, String d) {
		this.nombre = n;
		this.direccion = d;
		this.productos = new ArrayList<Producto>();
	}
	
	public int getCantidadDeProductos() {
		return this.productos.size();
	}
	
	public void agregarProducto(Producto p) {
		this.productos.add(p);
	}
	
	public Double getPrecioTotal() {
		Double total = 0d;
		for (Producto p:productos) {
			total = total + p.getPrecio();
		}
		return total;
	}
}
