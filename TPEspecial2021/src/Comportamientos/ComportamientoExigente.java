package Comportamientos;

import Filtros.Filtro;
import Participantes.ElementoEquipo;

public class ComportamientoExigente extends ComportamientoCoach {
	
	private Filtro filtro;
	
	//Solo filtro porque este puede ser una instancia del FiltroAND con convinaciones de filtros.
	public ComportamientoExigente(Filtro filtro) {
		this.filtro = filtro;
	}
	
	@Override
	public boolean cumple(ElementoEquipo p) {
		return filtro.cumple(p);
	}

}
