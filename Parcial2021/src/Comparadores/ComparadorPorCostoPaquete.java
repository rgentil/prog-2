package Comparadores;

import java.util.Comparator;

import Agencia.Paquete;

public class ComparadorPorCostoPaquete implements Comparator<Paquete>{

	@Override
	public int compare(Paquete paquete1, Paquete paquete2) {
		return (int) (paquete1.getCosto() - paquete2.getCosto());
	}

}
