package Filtros;

import Entidades.ElementoEquipo;

public class FiltroParticipantePorInstrumento extends Filtro {

	private String instrumento;
	
	public FiltroParticipantePorInstrumento(String instrumento) {
		this.instrumento = instrumento;
	}

	@Override
	public boolean cumple(ElementoEquipo participante) {
		return participante.getInstrumentos().contains(instrumento);
	}
}