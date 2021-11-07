package Comportamientos;

import Entidades.Participante;
import Filtros.Filtro;

public class ComportamientoExigente extends ComportamientoCoach {
	
	private Filtro filtro;
	
	public ComportamientoExigente(Filtro filtro) {
		this.filtro = filtro;
	}
	
	@Override
	public boolean cumple(Participante p) {
		return filtro.cumple(p);
	}

}
