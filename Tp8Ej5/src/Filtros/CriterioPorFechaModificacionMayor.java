package Filtros;

import java.time.LocalDate;

import SistemaArchivo.ArchivoSistema;

public class CriterioPorFechaModificacionMayor extends Criterio{

	private LocalDate filtroFecha;
	
	public CriterioPorFechaModificacionMayor(LocalDate filtroFecha) {
		super();
		this.filtroFecha = filtroFecha;
	}

	@Override
	public boolean cumple(ArchivoSistema a) {
		return a.getFechaModificacion().isAfter(filtroFecha);
	}

	
}
