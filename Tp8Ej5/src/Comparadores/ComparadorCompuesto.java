package Comparadores;

import SistemaArchivo.ArchivoSistema;

public class ComparadorCompuesto extends Comparador{

	private Comparador c1;
	private Comparador c2;
	
	public ComparadorCompuesto(Comparador c1, Comparador c2) {
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
