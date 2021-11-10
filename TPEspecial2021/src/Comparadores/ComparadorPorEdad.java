package Comparadores;

import java.util.Comparator;

import Participantes.ElementoEquipo;

public class ComparadorPorEdad implements Comparator<ElementoEquipo>{

	@Override
	public int compare(ElementoEquipo equipo1, ElementoEquipo equipo2) {
		return Integer.compare(equipo1.getEdad(),equipo2.getEdad());
	}

}
