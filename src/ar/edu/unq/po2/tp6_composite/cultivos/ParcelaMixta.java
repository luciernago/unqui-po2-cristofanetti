package ar.edu.unq.po2.tp6_composite.cultivos;

public class ParcelaMixta extends Parcela {
	
	Parcela p1;
	Parcela p2;
	Parcela p3;
	Parcela p4;
	
	public ParcelaMixta() {
		super();
	}
	
	public ParcelaMixta(Parcela pa1, Parcela pa2, Parcela pa3, Parcela pa4) {
		super();
		this.p1 = pa1;
		this.p2 = pa2;
		this.p3 = pa3;
		this.p4 = pa4;
	}

	@Override
	public int gananciaTotalSoja() {
		int total = ( p1.gananciaTotalSoja() +
				      p2.gananciaTotalSoja() +
				      p3.gananciaTotalSoja() +
				      p4.gananciaTotalSoja()) / 4;
		return total;
	}

	@Override
	public int gananciaTotalTrigo() {
		int total = ( p1.gananciaTotalTrigo() +
			          p2.gananciaTotalTrigo() +
			          p3.gananciaTotalTrigo() +
			          p4.gananciaTotalTrigo()) / 4;
		return total;
	}

}
