package ar.edu.unq.po2.tpTemplateMethodsYAdapter;

public class Temporario extends Empleado {

	@Override
	public int basico() {
		return 1000;
	}

	@Override
	public int familiares() {
		return (casado || hijos>0) ? 100 : 0 ;
	}

	@Override
	public int montoPorHoras() {
		return 5 * horas;
	}

}
