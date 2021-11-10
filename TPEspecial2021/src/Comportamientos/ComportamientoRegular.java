package Comportamientos;

import Participantes.ElementoEquipo;

public class ComportamientoRegular extends ComportamientoCoach {

	public ComportamientoRegular() {}

	@Override
	public boolean cumple(ElementoEquipo p) {
		return true;
	}

}
