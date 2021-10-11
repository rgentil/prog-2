package Comparador;

import Estadisticas.Palabra;

public class ComparadorPorCantOcurrenciasDesc extends ComparadorCompuesto {

	public ComparadorPorCantOcurrenciasDesc() {
		super();
	}

	public ComparadorPorCantOcurrenciasDesc(ComparadorCompuesto siguiente) {
		super(siguiente);
	}

	@Override
	public int comparar(Palabra p1, Palabra p2) {
		return p2.getCantOcurrencia() - p1.getCantOcurrencia();
	}

}
