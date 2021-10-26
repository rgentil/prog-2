package Filtros;

import NoticiasWeb.Noticia;

public class FiltroPorAutor extends Filtro{

	private String filtro;
	
	public FiltroPorAutor(String filtro) {
		this.filtro = filtro;
	}

	public boolean cumple(Noticia n) {
		return n.getAutor().equalsIgnoreCase(filtro);
	}
}
