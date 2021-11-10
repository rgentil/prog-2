package CondicionesDeBatalla;

import Participantes.ElementoEquipo;

public class CondicionBatallaPersonalCantidadGeneros extends CondicionBatallaPersonal {

	public CondicionBatallaPersonalCantidadGeneros(ElementoEquipo equipo1, ElementoEquipo equipo2) {
		super(equipo1, equipo2);
	}

	// ● Si la cantidad de géneros preferidos es menor que la de su oponente.
	@Override
	public int resultado() {
		int cantGeneros1 = super.getEquipo1().getTotalGeneros();
		int cantGeneros2 = super.getEquipo2().getTotalGeneros();
		return Integer.compare(cantGeneros2, cantGeneros1); //Por ser menor al condición de victoria
	}

}
