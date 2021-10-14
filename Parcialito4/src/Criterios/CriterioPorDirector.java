package Criterios;

import Plataforma.Pelicula;

public class CriterioPorDirector extends Criterio {

	private String filtro;
	
	public CriterioPorDirector(String filtro) {
		this.filtro = filtro;
	}

	@Override
	public boolean cumple(Pelicula p) {
		return p.getDirector().contains(filtro);
	}
	

	

}
