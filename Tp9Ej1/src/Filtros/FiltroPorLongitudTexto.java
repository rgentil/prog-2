package Filtros;

import NoticiasWeb.Noticia;

public class FiltroPorLongitudTexto extends Filtro{

	private int filtro;
	
	public FiltroPorLongitudTexto(int filtro) {
		this.filtro = filtro;
	}

	public boolean cumple(Noticia n) {
		return n.getTexto().length() > filtro;
	}
}
