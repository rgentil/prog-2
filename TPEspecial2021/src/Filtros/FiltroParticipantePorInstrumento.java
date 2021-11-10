package Filtros;

import Participantes.ElementoEquipo;

public class FiltroParticipantePorInstrumento extends Filtro {

	private String instrumento;
	
	public FiltroParticipantePorInstrumento(String instrumento) {
		this.instrumento = instrumento;
	}

	@Override
	public boolean cumple(ElementoEquipo participante) {
		return participante.tocaInstrumento(instrumento);
	}
}