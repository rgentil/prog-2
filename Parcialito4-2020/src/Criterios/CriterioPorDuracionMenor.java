package Criterios;

import Plataforma.Pelicula;

public class CriterioPorDuracionMenor extends Criterio {

	private int filtro;
	
	public CriterioPorDuracionMenor(int filtro) {
		this.filtro = filtro;
	}

	@Override
	public boolean cumple(Pelicula p) {
		return p.getDuracion() < filtro;
	}
	

	

}
