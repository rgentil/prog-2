package Filtros;

import Entidades.ElementoEquipo;

public class FiltroNOT extends Filtro {

	private Filtro filtro;
	
	public FiltroNOT(Filtro filtro) {
		this.filtro = filtro;
	}

	@Override
	public boolean cumple(ElementoEquipo participante) {
		return !filtro.cumple(participante);
	}

}
