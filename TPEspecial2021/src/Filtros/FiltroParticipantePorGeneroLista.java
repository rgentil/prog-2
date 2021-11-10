package Filtros;

import java.util.ArrayList;
import java.util.List;

import Participantes.ElementoEquipo;

public class FiltroParticipantePorGeneroLista extends Filtro {

	private List<String> generos;
	
	public FiltroParticipantePorGeneroLista(List<String> generos) {
		if (generos == null || generos.isEmpty()) {
			this.generos = new ArrayList<String>();
		}else {
			this.generos = generos;
		}
	}

	@Override
	public boolean cumple(ElementoEquipo participante) {
		for (String genero : generos) {
			if (participante.tieneGenero(genero)) {//Si tiene al menos uno, cumple.
				return true;
			}	
		}
		return false;
	}
}