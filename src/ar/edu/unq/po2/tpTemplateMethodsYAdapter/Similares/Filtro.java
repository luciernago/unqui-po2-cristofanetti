package ar.edu.unq.po2.tpTemplateMethodsYAdapter.Similares;

import java.util.ArrayList;
import java.util.List;

public abstract class Filtro {

	public List<WikipediaPage> getSimilarPages(WikipediaPage page, List<WikipediaPage> wikipedia){
		List<WikipediaPage> filtradas = new ArrayList<WikipediaPage>();
		for(WikipediaPage p:wikipedia) {
			if (this.condicion(p,page)) {
				filtradas.add(p);
			} 
		}
		return filtradas;
	}
	
	public abstract boolean condicion(WikipediaPage w1, WikipediaPage w2);

}
