package ar.edu.unq.po2.tpTemplateMethodsYAdapter;

public class Planta extends Empleado {

	@Override
	public int basico() {
		return 3000;
	}

	@Override
	public int familiares() {
		return 150 * hijos;
	}

	@Override
	public int montoPorHoras() {
		return 0;
	}

}
