package CondicionesDeBatalla;

import Participantes.ElementoEquipo;

public class CondicionBatallaPersonalCantidadInstrumentos extends CondicionBatallaPersonal {

	public CondicionBatallaPersonalCantidadInstrumentos(ElementoEquipo equipo1, ElementoEquipo equipo2) {
		super(equipo1, equipo2);
	}

	// ● Si la cantidad de instrumentos que toca es mayor que la de su oponente.
	@Override
	public int resultado() {
		int cantInstrumentos1 = super.getEquipo1().getTotalInstrumentos();
		int cantInstrumentos2 = super.getEquipo2().getTotalInstrumentos();
		return Integer.compare(cantInstrumentos1, cantInstrumentos2);
	}

}
