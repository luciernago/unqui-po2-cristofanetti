package ar.edu.unq.po2.tp6_composite.cultivos;

public final class Soja extends ParcelaPura {
	
	public Soja() {
		super();
		this.gananciaAnual = 2000;
	}

	@Override
	public int gananciaTotalSoja() {
		return this.gananciaAnual;

	}

	@Override
	public int gananciaTotalTrigo() {
		return 0;

	}

}
