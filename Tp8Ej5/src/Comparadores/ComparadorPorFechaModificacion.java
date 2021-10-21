package Comparadores;

import java.util.Comparator;

import SistemaArchivo.ArchivoSistema;

public class ComparadorPorFechaModificacion implements Comparator<ArchivoSistema> {

	@Override
	public int compare(ArchivoSistema a1, ArchivoSistema a2) {
		return a1.getFechaModificacion().compareTo(a2.getFechaModificacion());
	}

}
