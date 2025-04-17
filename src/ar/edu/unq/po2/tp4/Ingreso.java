package ar.edu.unq.po2.tp4;

import java.time.LocalDate;

public class Ingreso {

	private LocalDate mes;
	private String concepto;
	private Double montoPercibido;
	
	public Ingreso (String c, Double p) {
		this.mes = LocalDate.now();
		this.concepto = c;
		this.montoPercibido = p;
	}
	
	public LocalDate getMes() {
		return mes;
	}
	public void setMes(LocalDate mes) {
		this.mes = mes;
	}
	public String getConcepto() {
		return concepto;
	}
	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}
	public Double getMontoPercibido() {
		return montoPercibido;
	}
	public void setMontoPercibido(Double percibido) {
		this.montoPercibido = percibido;
	}
	
	public Double getMontoImponible() {
		return this.getMontoPercibido();
	}

	
}
