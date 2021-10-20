package Comparadores;

import SistemaArchivo.ArchivoSistema;

public class ComparadorPorFechaCreacion extends Comparador {

	@Override
	public int compare(ArchivoSistema a1, ArchivoSistema a2) {
		return a1.getFechaCreacion().compareTo(a2.getFechaCreacion());
	}

}
