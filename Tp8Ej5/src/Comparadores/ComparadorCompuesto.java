package Comparadores;

import java.util.Comparator;

import SistemaArchivo.ArchivoSistema;

public class ComparadorCompuesto implements Comparator<ArchivoSistema>{

	private Comparator<ArchivoSistema> c1;
	private Comparator<ArchivoSistema> c2;
	
	public ComparadorCompuesto(Comparator<ArchivoSistema> c1, Comparator<ArchivoSistema> c2) {
		super();
		this.c1 = c1;
		this.c2 = c2;
	}

	@Override
	public int compare(ArchivoSistema a1, ArchivoSistema a2) {
		int aux = c1.compare(a1, a2);
		if(aux == 0) {
			aux = c2.compare(a1, a2);
		}
		return aux;
	}

}
