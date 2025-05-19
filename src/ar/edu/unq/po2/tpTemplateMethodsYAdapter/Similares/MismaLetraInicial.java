package ar.edu.unq.po2.tpTemplateMethodsYAdapter.Similares;

public class MismaLetraInicial extends Filtro {

	@Override
	public boolean condicion(WikipediaPage w1, WikipediaPage w2) {
		String w1Title = w1.getTitle();
		String w2Title = w2.getTitle();
		return w1Title.charAt(0)==w2Title.charAt(0);
	}

}
