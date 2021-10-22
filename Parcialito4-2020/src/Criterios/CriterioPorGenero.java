package Criterios;

import Plataforma.Pelicula;

public class CriterioPorGenero extends Criterio {

	private String filtro;
	
	public CriterioPorGenero(String filtro) {
		this.filtro = filtro;
	}

	@Override
	public boolean cumple(Pelicula p) {
		return p.tieneGenero(filtro);
	}
	

	

}
