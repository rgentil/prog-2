package Comparadores;

import java.util.Comparator;

import Participantes.ElementoEquipo;

public class ComparadorPorCantidadGeneros implements Comparator<ElementoEquipo>{

	@Override
	public int compare(ElementoEquipo equipo1, ElementoEquipo equipo2) {
		return Integer.compare(equipo1.getTotalGeneros(),equipo2.getTotalGeneros());
	}

}
