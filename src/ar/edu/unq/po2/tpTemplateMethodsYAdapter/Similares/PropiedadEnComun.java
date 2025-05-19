package ar.edu.unq.po2.tpTemplateMethodsYAdapter.Similares;

//import java.util.Map;
import java.util.Set;

public class PropiedadEnComun extends Filtro {

	@Override
	public boolean condicion(WikipediaPage w1, WikipediaPage w2) {
		boolean con = false;
		Set<String> w1Propiedades = w1.getInfobox().keySet();
		Set<String> w2Propiedades = w2.getInfobox().keySet();
		for (String p:w1Propiedades) {
			while (!con){
				if (w2Propiedades.contains(p)) {
					con = true;
				}
			}
		}
		return con;
	}

}
