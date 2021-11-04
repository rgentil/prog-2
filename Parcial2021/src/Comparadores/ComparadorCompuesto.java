package Comparadores;

import java.util.Comparator;

import Agencia.Paquete;

public class ComparadorCompuesto implements Comparator<Paquete>{
	
	private Comparator<Paquete> c1;
	private Comparator<Paquete> c2;
	
	public ComparadorCompuesto(Comparator<Paquete> c1, Comparator<Paquete> c2) {
		this.c1 = c1;
		this.c2 = c2;
	}

	@Override
	public int compare(Paquete paquete1, Paquete paquete2) {
		int aux = c1.compare(paquete1, paquete2);
		if (aux == 0 && c2 != null) {
			aux = c2.compare(paquete1, paquete2);
		}
		return aux;
	}
	

}
