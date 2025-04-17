package ar.edu.unq.po2.tp4;

public class ProductoPrimeraNecesidad extends Producto {

	public ProductoPrimeraNecesidad (String s, Double p) {
		super(s,p);
	}
	
	public ProductoPrimeraNecesidad (String s, Double p, boolean c) {
		super(s,p,c);
	}
	
	public Double getPrecio() {
		return super.getPrecio() * 0.9;
	}
	
}
