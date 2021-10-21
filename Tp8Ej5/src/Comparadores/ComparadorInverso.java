package Comparadores;

import java.util.Comparator;

import SistemaArchivo.ArchivoSistema;

public class ComparadorInverso implements Comparator<ArchivoSistema>{

	private Comparator<ArchivoSistema> c;

	public ComparadorInverso(Comparator<ArchivoSistema> c) {
		super();
		this.c = c;
	}

	@Override
	public int compare(ArchivoSistema a1, ArchivoSistema a2) {
		return - c.compare(a1, a2);
	}
	
	
}
