package ar.edu.unq.po2.tpTemplateMethodsYAdapter;

public abstract class Empleado {
	
	boolean casado;
	int hijos;
	int horas;
	
	public Empleado() {
		
	}
	
	public int sueldo() {
		int totalBruto;
		totalBruto = this.basico() + this.familiares() + this.montoPorHoras();
		totalBruto = calcularSinAportes(totalBruto,13);
		return totalBruto;
	}
	
	public int calcularSinAportes(int bruto, int porcentajeDescuento) {
		int porcentaje = 100 - porcentajeDescuento;
		int neto = (bruto * porcentaje)/100;
		return neto;
	}
	
	public abstract int basico();
	public abstract int familiares();
	public abstract int montoPorHoras();
	
}
