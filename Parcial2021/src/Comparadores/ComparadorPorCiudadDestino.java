package Comparadores;

import java.util.Comparator;

import Agencia.Paquete;

public class ComparadorPorCiudadDestino implements Comparator<Paquete>{

	@Override
	public int compare(Paquete paquete1, Paquete paquete2) {
		return paquete1.getCiudadDestino().compareTo(paquete2.getCiudadDestino());
	}

}
