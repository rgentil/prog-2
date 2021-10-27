package Filtros;

import WorkBreakdownStructure.Recurso;
import WorkBreakdownStructure.TareaWBS;

public class FiltroPorRecurso extends Filtro{

	private Recurso filtro;
	
	public FiltroPorRecurso(Recurso filtro) {
		super();
		this.filtro = filtro;
	}

	@Override
	public boolean cumple(TareaWBS tarea) {
		return tarea.tieneRecurso(filtro);
	}

}
