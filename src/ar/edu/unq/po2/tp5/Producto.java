package ar.edu.unq.po2.tp5;

public abstract class Producto {
	private Double precio;
	private int stock;
	
	public Producto() {
		super();
	}	
	
	public Producto(Double precio, int stock) {
		super();
		this.precio = precio;
		this.stock = stock;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
	
	public void decrementarStock() {
		this.stock--;
	}
		
}
