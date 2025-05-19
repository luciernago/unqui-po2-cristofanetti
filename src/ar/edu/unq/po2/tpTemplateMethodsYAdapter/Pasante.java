package ar.edu.unq.po2.tpTemplateMethodsYAdapter;

public class Pasante extends Empleado {

	@Override
	public int basico() {
		return 0;
	}

	@Override
	public int familiares() {
		return 0;
	}

	@Override
	public int montoPorHoras() {
		return 40 * horas;
	}

}
