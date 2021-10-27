package Filtros;

import java.time.LocalDate;

import WorkBreakdownStructure.TareaWBS;
import WorkBreakdownStructure.Util;

public class FiltroTareaAtrazada extends Filtro{

	@Override
	public boolean cumple(TareaWBS tarea) {
		return tarea.getFechaFinalizacionEstimada().isAfter(LocalDate.now()) && tarea.getEstado().equals(Util.EN_ESPERA);
	}

}
