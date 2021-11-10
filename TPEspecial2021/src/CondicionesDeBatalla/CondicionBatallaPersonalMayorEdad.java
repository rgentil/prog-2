package CondicionesDeBatalla;

import Participantes.ElementoEquipo;

public class CondicionBatallaPersonalMayorEdad extends CondicionBatallaPersonal {

	public CondicionBatallaPersonalMayorEdad(ElementoEquipo equipo1, ElementoEquipo equipo2) {
		super(equipo1, equipo2);
	}

	// ● Si por que que tiene mayor edad
	@Override
	public int resultado() {
		int edad1 = super.getEquipo1().getEdad();
		int edad2 = super.getEquipo2().getEdad();
		return Integer.compare(edad1, edad2);
	}

}
