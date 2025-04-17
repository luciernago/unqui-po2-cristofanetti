package ar.edu.unq.po2.tp4;

import java.util.List;

public class Trabajador {
	private List<Ingreso> ingresos;
	
	public Trabajador(List<Ingreso> is) {
		this.ingresos = is;
	}
	
	public Double getTotalPercibido() {
		Double total = 0d;
		for(Ingreso i:ingresos) {
			total = total + i.getMontoPercibido();
		}
		return total;
	}
	
	public Double getMontoImponible() {
		Double total = 0d;
		for(Ingreso i:ingresos) {
			total = total + i.getMontoImponible();
		}
		return total;
	}
	
	public Double getImpuestoAPagar() {
		return this.getMontoImponible() * 0.02d;
	}
	
}
