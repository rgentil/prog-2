package Comparadores;

import java.util.Comparator;

import SistemaArchivo.ArchivoSistema;

public class ComparadorPorFechaCreacion implements Comparator<ArchivoSistema> {

	@Override
	public int compare(ArchivoSistema a1, ArchivoSistema a2) {
		return a1.getFechaCreacion().compareTo(a2.getFechaCreacion());
	}

}
