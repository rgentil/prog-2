package Criterios;

import Plataforma.Pelicula;

public class CriterioPorAnioEstrenoMenor extends Criterio {

	private int filtro;
	
	public CriterioPorAnioEstrenoMenor(int filtro) {
		this.filtro = filtro;
	}

	@Override
	public boolean cumple(Pelicula p) {
		return p.getAnioEstreno() < filtro;
	}
	

	

}
