package Comparadores;

import java.util.Comparator;

import Entidades.ElementoEquipo;

public class ComparadorPorEdad implements Comparator<ElementoEquipo>{

	@Override
	public int compare(ElementoEquipo equipo1, ElementoEquipo equipo2) {
		return equipo1.getEdad() - equipo2.getEdad();
	}

}
