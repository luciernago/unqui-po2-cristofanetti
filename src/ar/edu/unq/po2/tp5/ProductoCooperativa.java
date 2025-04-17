package ar.edu.unq.po2.tp5;

public class ProductoCooperativa extends Producto {

	public ProductoCooperativa() {
		super();
	}

	public ProductoCooperativa(Double precio, int stock) {
		super(precio, stock);
	}
	
	public Double getPrecio() {
		return super.getPrecio() * 0.9d;
	}
}
