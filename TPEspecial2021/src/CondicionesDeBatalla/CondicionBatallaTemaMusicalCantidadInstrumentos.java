package CondicionesDeBatalla;

import Entidades.TemaMusical;
import Participantes.ElementoEquipo;

public class CondicionBatallaTemaMusicalCantidadInstrumentos extends CondicionBatallaTemaMusical {

	public CondicionBatallaTemaMusicalCantidadInstrumentos(ElementoEquipo equipo1, ElementoEquipo equipo2, TemaMusical temaMusical) {
		super(equipo1, equipo2, temaMusical);
	}

	// ● Si la cantidad de instrumentos que toca de un tema musical es mayor que la de su oponente.
	@Override
	public int resultado() {
		int cantInstrumentos1 = super.getEquipo1().getTotalDeInstrumentosRequeridosConocen(super.getTemaMusical().getInstrumentosNecesarios());
		int cantInstrumentos2 = super.getEquipo2().getTotalDeInstrumentosRequeridosConocen(super.getTemaMusical().getInstrumentosNecesarios());
		return Integer.compare(cantInstrumentos1, cantInstrumentos2);
	}

}
