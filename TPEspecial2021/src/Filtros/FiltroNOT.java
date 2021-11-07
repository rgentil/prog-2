package Filtros;

import Entidades.Participante;

public class FiltroNOT extends Filtro {

	private Filtro filtro;
	
	public FiltroNOT(Filtro filtro) {
		this.filtro = filtro;
	}

	@Override
	public boolean cumple(Participante participante) {
		return !filtro.cumple(participante);
	}

}
