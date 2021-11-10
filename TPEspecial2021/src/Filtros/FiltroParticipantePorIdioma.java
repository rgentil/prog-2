package Filtros;

import Participantes.ElementoEquipo;

public class FiltroParticipantePorIdioma extends Filtro {

	private String idioma;
	
	public FiltroParticipantePorIdioma(String idioma) {
		this.idioma = idioma;
	}

	@Override
	public boolean cumple(ElementoEquipo participante) {
		return participante.sabeIdioma(idioma);
	}
}