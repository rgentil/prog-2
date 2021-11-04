package Comparadores;

import java.util.Comparator;

import Agencia.Paquete;

public class ComparadorInverso implements Comparator<Paquete>{
	
	private Comparator<Paquete> comparador;
	
	public ComparadorInverso(Comparator<Paquete> comparador) {
		this.comparador = comparador;
	}

	@Override
	public int compare(Paquete paquete1, Paquete paquete2) {
		return - comparador.compare(paquete1, paquete2);
	}
	

}
