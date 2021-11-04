package Filtros;

import java.time.LocalDate;

import Agencia.Paquete;

public class FiltroPorFechaAcordada extends Filtro {

	private LocalDate fecha;
	
	public FiltroPorFechaAcordada(LocalDate fecha) {
		this.fecha = fecha;
	}

	@Override
	public boolean cumple(Paquete paquete) {
		if (paquete.getFechaPagoAcordada() == null)
			return false;
		return paquete.getFechaPagoAcordada().equals(fecha);
	}
}