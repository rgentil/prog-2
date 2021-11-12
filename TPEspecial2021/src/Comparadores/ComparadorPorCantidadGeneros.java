package Comparadores;

import java.util.Comparator;

import Entidades.ElementoEquipo;

public class ComparadorPorCantidadGeneros implements Comparator<ElementoEquipo>{

	@Override
	public int compare(ElementoEquipo equipo1, ElementoEquipo equipo2) {
		return equipo1.getGeneros().size() - equipo2.getGeneros().size();
	}

}
