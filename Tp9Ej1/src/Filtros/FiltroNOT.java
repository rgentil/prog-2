package Filtros;

import NoticiasWeb.Noticia;

public class FiltroNOT extends Filtro{

	private Filtro f;
	
	public FiltroNOT(Filtro f) {
		this.f = f;
	}

	public boolean cumple(Noticia n) {
		return !f.cumple(n);
	}
}
