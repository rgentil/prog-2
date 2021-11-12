package Filtros;

import Entidades.ElementoEquipo;

public class FiltroParticipantePorGenero extends Filtro {

	private String genero;
	
	public FiltroParticipantePorGenero(String genero) {
		this.genero = genero;
	}

	@Override
	public boolean cumple(ElementoEquipo participante) {
		return participante.getGeneros().contains(genero);
	}
}