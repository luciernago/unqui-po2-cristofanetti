package ar.edu.unq.po2.tp6_composite.cultivos;

public final class Trigo extends ParcelaPura {
	
	public Trigo() {
		super();
		this.gananciaAnual=1200;
	}

	@Override
	public int gananciaTotalSoja() {
		return 0;
	}

	@Override
	public int gananciaTotalTrigo() {
		return this.gananciaAnual;
	}

}
