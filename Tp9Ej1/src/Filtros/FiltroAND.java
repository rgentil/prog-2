package Filtros;

import NoticiasWeb.Noticia;

public class FiltroAND extends Filtro{

	private Filtro f1;
	private Filtro f2;
	
	public FiltroAND(Filtro f1, Filtro f2) {
		this.f1 = f1;
		this.f2 = f2;
	}

	public boolean cumple(Noticia n) {
		return f1.cumple(n) && f2.cumple(n);
	}
}
