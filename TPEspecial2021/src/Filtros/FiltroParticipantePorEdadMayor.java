package Filtros;

import Participantes.ElementoEquipo;

public class FiltroParticipantePorEdadMayor extends Filtro {

	private int edad;
	
	public FiltroParticipantePorEdadMayor(int edad) {
		this.edad = edad;
	}

	@Override
	public boolean cumple(ElementoEquipo participante) {
		return participante.getEdad() > edad;
	}
}