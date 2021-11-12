package Comparadores;

import java.util.Comparator;

import Entidades.ElementoEquipo;

public class ComparadorPorCantidadIdiomas implements Comparator<ElementoEquipo>{

	@Override
	public int compare(ElementoEquipo equipo1, ElementoEquipo equipo2) {
		return equipo1.getIdiomas().size() - equipo2.getIdiomas().size();
	}

}
