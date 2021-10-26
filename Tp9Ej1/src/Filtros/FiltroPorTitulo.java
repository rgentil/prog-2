package Filtros;

import NoticiasWeb.Noticia;

public class FiltroPorTitulo extends Filtro{

	private String filtro;
	
	public FiltroPorTitulo(String filtro) {
		this.filtro = filtro;
	}

	public boolean cumple(Noticia n) {
		return n.getTitulo().equalsIgnoreCase(filtro);
	}
}
