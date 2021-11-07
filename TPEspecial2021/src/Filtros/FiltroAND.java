package Filtros;

import Entidades.Participante;

public class FiltroAND extends Filtro {

	private Filtro filtro1;
	private Filtro filtro2;
	
	public FiltroAND(Filtro filtro1, Filtro filtro2) {
		this.filtro1 = filtro1;
		this.filtro2 = filtro2;
	}

	@Override
	public boolean cumple(Participante participante) {
		return filtro1.cumple(participante) && filtro2.cumple(participante);
	}

}
