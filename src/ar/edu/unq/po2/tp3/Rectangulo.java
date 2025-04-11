package ar.edu.unq.po2.tp3;

public class Rectangulo extends Cuadrado {
	
	private int ancho;
	
	public Rectangulo(Point infIzq, int alto, int ancho) {
		super(infIzq, alto);
		this.ancho = ancho;
	}

	@Override
	public int area() {
		return super.getAlto() * ancho;
	}
	@Override
	public int perimetro() {
		return 2*(super.getAlto() + ancho);
	}
	
	public String orientacion() {
		String orientacion = "Horizontal";
		if (super.getAlto() > ancho) { 
			orientacion = "Vertical"; 
		}
		return orientacion;
	}
	
}
