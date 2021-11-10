package CondicionesDeBatalla;

import Participantes.ElementoEquipo;

public class CondicionBatallaPersonalCantidadIdiomas extends CondicionBatallaPersonal {

	public CondicionBatallaPersonalCantidadIdiomas(ElementoEquipo equipo1, ElementoEquipo equipo2) {
		super(equipo1, equipo2);
	}

	// ● Si la cantidad de idiomas
	@Override
	public int resultado() {
		int cantIdiomas1 = super.getEquipo1().getTotalIdiomas();
		int cantIdiomas2 = super.getEquipo2().getTotalIdiomas();
		return Integer.compare(cantIdiomas1, cantIdiomas2);
	}

}
