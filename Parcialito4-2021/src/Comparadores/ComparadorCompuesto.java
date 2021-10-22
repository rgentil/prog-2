package Comparadores;

import java.util.Comparator;

import Principal.Vendedor;

public class ComparadorCompuesto implements Comparator<Vendedor>{

	private Comparador c1;
	private Comparador c2;
	
	public ComparadorCompuesto(Comparador c1, Comparador c2) {
		super();
		this.c1 = c1;
		this.c2 = c2;
	}

	public int compare(Vendedor vendedor1, Vendedor vendedor2) {
		int aux = c1.compare(vendedor1, vendedor2);
		if (aux == 0) {
			aux = c2.compare(vendedor1, vendedor2);
		}
		return aux;
	}
	

}
