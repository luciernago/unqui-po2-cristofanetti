package ar.edu.unq.po2.tp4;

public class IngresoHorasExtra extends Ingreso{
	private int horasExtra;
	
	public IngresoHorasExtra (String c, Double p, int h) {
		super(c,p);
		this.setHorasExtra(h);
	}
	
	public int getHorasExtra() {
		return horasExtra;
	}

	public void setHorasExtra(int horasExtra) {
		this.horasExtra = horasExtra;
	}

	public Double getMontoImponible() {
		return 0d;
	}

}
