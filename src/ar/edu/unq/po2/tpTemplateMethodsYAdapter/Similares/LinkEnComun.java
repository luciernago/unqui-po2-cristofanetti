package ar.edu.unq.po2.tpTemplateMethodsYAdapter.Similares;

import java.util.List;

public class LinkEnComun extends Filtro {

	@Override
	public boolean condicion(WikipediaPage w1, WikipediaPage w2) {
		boolean con = false;
		List<WikipediaPage> w1Links = w1.getLinks();
		List<WikipediaPage> w2Links = w2.getLinks();
		for (WikipediaPage p:w1Links) {
			if (!con && w2Links.contains(p)) {
				con = true;
			}
		}
		return con;
	}

}
