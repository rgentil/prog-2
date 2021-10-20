package Comparadores;

import SistemaArchivo.ArchivoSistema;

public class ComparadorInverso extends Comparador{

	private Comparador c;

	public ComparadorInverso(Comparador c) {
		super();
		this.c = c;
	}

	@Override
	public int compare(ArchivoSistema a1, ArchivoSistema a2) {
		return - c.compare(a1, a2);
	}
	
	
}
