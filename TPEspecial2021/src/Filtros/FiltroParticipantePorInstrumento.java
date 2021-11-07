package Filtros;

import Entidades.Participante;

public class FiltroParticipantePorInstrumento extends Filtro {

	private String instrumento;
	
	public FiltroParticipantePorInstrumento(String instrumento) {
		this.instrumento = instrumento;
	}

	@Override
	public boolean cumple(Participante participante) {
		return participante.tocaInstrumento(instrumento);
	}
}