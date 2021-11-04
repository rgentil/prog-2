package Comparadores;

import java.util.Comparator;

import Agencia.Paquete;

public class ComparadorPorIdentificador implements Comparator<Paquete>{

	@Override
	public int compare(Paquete paquete1, Paquete paquete2) {
		return paquete1.getIdPaquete() - paquete2.getIdPaquete();
	}

}
