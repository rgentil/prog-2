package Comparador;

import Estadisticas.Palabra;

public class ComparadorPorCantOcurrenciasAsc extends ComparadorCompuesto {

	public ComparadorPorCantOcurrenciasAsc() {
		super();
	}

	public ComparadorPorCantOcurrenciasAsc(ComparadorCompuesto siguiente) {
		super(siguiente);
	}

	@Override
	public int comparar(Palabra p1, Palabra p2) {
		return p1.getCantOcurrencia() - p2.getCantOcurrencia();
	}

}
