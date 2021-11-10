package Comparadores;

import java.util.Comparator;

import Participantes.ElementoEquipo;

public class ComparadorPorCantidadInstrumentos implements Comparator<ElementoEquipo>{

	@Override
	public int compare(ElementoEquipo equipo1, ElementoEquipo equipo2) {
		return Integer.compare(equipo1.getTotalInstrumentos(),equipo2.getTotalInstrumentos());
	}

}
