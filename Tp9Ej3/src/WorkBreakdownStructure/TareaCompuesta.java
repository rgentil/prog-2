package WorkBreakdownStructure;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import Filtros.Filtro;

public class TareaCompuesta extends TareaWBS{
	
	private List<TareaWBS> tareas;

	@Override
	public LocalDate getFechaInicioEstimada() {
		LocalDate fecha = LocalDate.of(9999, 1, 1);
		for (TareaWBS tarea : tareas) {
			if (fecha.compareTo(tarea.getFechaInicioEstimada()) > 0) {
				fecha = tarea.getFechaInicioEstimada();
			}
		}
		return fecha;
	}

	@Override
	public LocalDate getFechaFinalizacionEstimada() {
		LocalDate fecha = LocalDate.of(1900, 1, 1);
		for (TareaWBS tarea : tareas) {
			if (fecha.compareTo(tarea.getFechaFinalizacionEstimada()) < 0) {
				fecha = tarea.getFechaFinalizacionEstimada();
			}
		}
		return fecha;
	}

	@Override
	public List<TareaWBS> getTareas(Filtro filtro) {
		List<TareaWBS> aux = new ArrayList<TareaWBS>();
		for (TareaWBS tareaWBS : tareas) {
			aux.addAll(tareaWBS.getTareas(filtro));
		}
		return aux;
	}

	@Override
	public boolean tieneRecurso(Recurso filtro) {
		for (TareaWBS tareaWBS : tareas) {
			if (tareaWBS.tieneRecurso(filtro)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public List<Recurso> getRecursos() {
		List<Recurso> resultado = new ArrayList<Recurso>();
		for (TareaWBS tareaWBS : tareas) {
			List<Recurso> ListaRecursosPorTarea = tareaWBS.getRecursos();
			for (Recurso recurso : ListaRecursosPorTarea) {
				if (!resultado.contains(recurso)) {
					resultado.add(recurso);
				}
			}
		}
		return resultado;
	}
	
	@Override
	public boolean addRecurso(Recurso r) {
		for (TareaWBS tareaWBS : tareas) {
			if (tareaWBS.addRecurso(r)) {
				return true;
			}
		}
		return false;
	}

	
}
