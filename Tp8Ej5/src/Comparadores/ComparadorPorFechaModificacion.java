package Comparadores;

import SistemaArchivo.ArchivoSistema;

public class ComparadorPorFechaModificacion extends Comparador {

	@Override
	public int compare(ArchivoSistema a1, ArchivoSistema a2) {
		return a1.getFechaModificacion().compareTo(a2.getFechaModificacion());
	}

}
