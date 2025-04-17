package ar.edu.unq.po2.tp5;

public class Caja {

	private Double montoAPagar = 0d;

	public Caja() {
		super();
	}
	
	public void registrarItem(Producto p) {
		this.montoAPagar = montoAPagar + p.getPrecio();
		p.registrarPago();
	}
	
	public Double getMontoAPagar() {
		return this.montoAPagar;
	}
}
