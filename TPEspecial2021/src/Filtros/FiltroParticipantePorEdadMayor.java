package Filtros;

import Entidades.Participante;

public class FiltroParticipantePorEdadMayor extends Filtro {

	private int edad;
	
	public FiltroParticipantePorEdadMayor(int edad) {
		this.edad = edad;
	}

	@Override
	public boolean cumple(Participante participante) {
		return participante.getEdad() > edad;
	}
}