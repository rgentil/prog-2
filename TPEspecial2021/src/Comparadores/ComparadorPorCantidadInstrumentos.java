package Comparadores;

import java.util.Comparator;

import Entidades.ElementoEquipo;

public class ComparadorPorCantidadInstrumentos implements Comparator<ElementoEquipo>{

	@Override
	public int compare(ElementoEquipo equipo1, ElementoEquipo equipo2) {
		return equipo1.getInstrumentos().size() - equipo2.getInstrumentos().size();
	}

}
