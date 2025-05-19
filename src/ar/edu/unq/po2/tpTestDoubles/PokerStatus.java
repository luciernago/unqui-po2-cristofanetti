package ar.edu.unq.po2.tpTestDoubles;

import java.util.Arrays;

public class PokerStatus {

	public boolean verificar(String c0, String c1, String c2, String c3, String c4) {
		String[] mano = this.convertirEnLista(c0,c1,c2,c3,c4);		
		mano = this.soloLosNumeros(mano);
		Arrays.sort(mano);
		
		//return (mano[0]!=mano[4]) &&
			//   ((mano[0]==mano[3]) || (mano[1]==mano[4]));
		
		return !(mano[0].equals(mano[4])) &&
			   (mano[0].equals(mano[3]) || mano[1].equals(mano[4]));
	}
	
	public String[] convertirEnLista(String c0, String c1, String c2, String c3, String c4){
		String[] lista = new String[5];
		lista[0]=c0;
		lista[1]=c1;
		lista[2]=c2;
		lista[3]=c3;
		lista[4]=c4;
		return lista;
	}
	
	public String[] soloLosNumeros(String[] lista) {
		String[] nuevaLista = new String[5];
		for(int i=0; i<5; i++) {
			if (lista[i].length()==2) {
				nuevaLista[i]=Character.toString(lista[i].charAt(0));
			} else {
				nuevaLista[i]=Character.toString(lista[i].charAt(1));
			}
		}
		return nuevaLista;
	}
}
