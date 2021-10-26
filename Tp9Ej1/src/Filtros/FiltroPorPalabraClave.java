package Filtros;

import NoticiasWeb.Noticia;

public class FiltroPorPalabraClave extends Filtro{

	private String filtro;
	
	public FiltroPorPalabraClave(String filtro) {
		this.filtro = filtro;
	}

	public boolean cumple(Noticia n) {
		return n.tienePalabraClave(filtro);
	}
}
