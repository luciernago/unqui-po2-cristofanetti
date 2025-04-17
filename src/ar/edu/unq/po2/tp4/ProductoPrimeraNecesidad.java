package ar.edu.unq.po2.tp4;

public class ProductoPrimeraNecesidad extends Producto {
	
	private Double descuento = 0.9;

	public ProductoPrimeraNecesidad (String s, Double p) {
		super(s,p);
	}
	
	public ProductoPrimeraNecesidad (String s, Double p, boolean c) {
		super(s,p,c);
	}
	
	public ProductoPrimeraNecesidad (String s, Double p, boolean c, Double d) {
		super(s,p,c);
		this.setDescuento(d);
	}
	
	public void setDescuento(Double n) {
		this.descuento = (100d - n) *0.01d; 
	}
	
	public Double getDescuento() {
		return this.descuento;
	}
	
	public Double getPrecio() {
		return super.getPrecio() * this.getDescuento();
	}
	
}
