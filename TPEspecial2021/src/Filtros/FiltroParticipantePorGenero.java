package Filtros;

import Entidades.Participante;

public class FiltroParticipantePorGenero extends Filtro {

	private String genero;
	
	public FiltroParticipantePorGenero(String genero) {
		this.genero = genero;
	}

	@Override
	public boolean cumple(Participante participante) {
		return participante.tieneGenero(genero);
	}
}