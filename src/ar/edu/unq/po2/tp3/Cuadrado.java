package ar.edu.unq.po2.tp3;

public class Cuadrado {
	
	protected Point inferiorIzquierda;
	protected int alto;
	
	public int getAlto() {
		return alto;
	}

	public void setAlto(int alto) {
		this.alto = alto;
	}

	public Cuadrado(Point infIzq, int alto) {
		this.inferiorIzquierda = infIzq;
		this.alto = alto;
	}
	
	public int area() {
		return alto * alto;
	}
	
	public int perimetro() {
		return 4 * alto;
	}
	
}
