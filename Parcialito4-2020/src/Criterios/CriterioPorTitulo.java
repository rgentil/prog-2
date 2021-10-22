package Criterios;

import Plataforma.Pelicula;

public class CriterioPorTitulo extends Criterio {

	private String filtro;
	
	public CriterioPorTitulo(String filtro) {
		this.filtro = filtro;
	}

	@Override
	public boolean cumple(Pelicula p) {
		//return p.getTitulo().equalsIgnoreCase(filtro);
		return p.getTitulo().contains(filtro);
	}
	

	

}
