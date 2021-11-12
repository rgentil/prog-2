package Filtros;

import Entidades.ElementoEquipo;

public class FiltroPositivo extends Filtro {

	public FiltroPositivo() {}

	@Override
	public boolean cumple(ElementoEquipo participante) {
		return true;
	}
}