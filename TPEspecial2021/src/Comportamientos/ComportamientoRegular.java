package Comportamientos;

import Entidades.Participante;

public class ComportamientoRegular extends ComportamientoCoach {

	public ComportamientoRegular() {}

	@Override
	public boolean cumple(Participante p) {
		return true;
	}

}
