package Comparador;

import Diccionario.Palabra;

public class ComparadorPorNombre extends ComparadorCompuesto {

	@Override
	public int comparar(Palabra p1, Palabra p2) {
		return p1.getNombre().compareTo(p2.getNombre());
	}

}
