package Filtros;

import Entidades.Participante;

public class FiltroParticipantePorIdioma extends Filtro {

	private String idioma;
	
	public FiltroParticipantePorIdioma(String idioma) {
		this.idioma = idioma;
	}

	@Override
	public boolean cumple(Participante participante) {
		return participante.sabeIdioma(idioma);
	}
}