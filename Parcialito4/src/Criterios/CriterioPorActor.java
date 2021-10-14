package Criterios;

import Plataforma.Pelicula;

public class CriterioPorActor extends Criterio {

	private String filtro;
	
	public CriterioPorActor(String filtro) {
		this.filtro = filtro;
	}

	@Override
	public boolean cumple(Pelicula p) {
		return p.tieneActor(filtro);
	}

}
