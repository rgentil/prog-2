package Comparadores;

import java.util.Comparator;

import SistemaArchivo.ArchivoSistema;

public class ComparadorPorNombre implements Comparator<ArchivoSistema> {

	@Override
	public int compare(ArchivoSistema a1, ArchivoSistema a2) {
		return a1.getNombre().compareTo(a2.getNombre());
	}

}
