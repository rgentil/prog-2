package Filtros;

import Entidades.ElementoEquipo;
import Entidades.TemaMusical;

public class FiltroParticipantePorTemaAInterpretar extends Filtro {

	private TemaMusical temaMusical;
	
	public FiltroParticipantePorTemaAInterpretar(TemaMusical temaMusical) {
		this.temaMusical = temaMusical;
	}

	@Override
	public boolean cumple(ElementoEquipo participante) {
		return temaMusical.puedeInterpretarsePor(participante);
	}
}