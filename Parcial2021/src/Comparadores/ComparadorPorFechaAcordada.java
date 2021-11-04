package Comparadores;

import java.util.Comparator;

import Agencia.Paquete;

public class ComparadorPorFechaAcordada implements Comparator<Paquete>{

	@Override
	public int compare(Paquete paquete1, Paquete paquete2) {
		if (paquete1.getFechaPagoAcordada() == null)
			return -1;
		if (paquete2.getFechaPagoAcordada() == null)
			return 1;
		return paquete1.getFechaPagoAcordada().compareTo(paquete2.getFechaPagoAcordada());
	}

}
