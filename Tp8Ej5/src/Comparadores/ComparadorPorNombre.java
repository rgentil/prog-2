package Comparadores;

import SistemaArchivo.ArchivoSistema;

public class ComparadorPorNombre extends Comparador {

	@Override
	public int compare(ArchivoSistema a1, ArchivoSistema a2) {
		return a1.getNombre().compareTo(a2.getNombre());
	}

}
