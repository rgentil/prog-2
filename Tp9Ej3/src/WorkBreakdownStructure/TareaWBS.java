package WorkBreakdownStructure;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;

import Filtros.Filtro;

public abstract class TareaWBS {

	public abstract LocalDate getFechaInicioEstimada();
	public abstract LocalDate getFechaFinalizacionEstimada();
	private String estado;
	
	public TareaWBS() {
		super();
		this.estado = Util.EN_ESPERA;
	}
	
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	//1. Devolver la lista de tareas que están atrasadas 
	//(fecha de finalización estimada es posterior a la fecha actual y su estado es “en espera”) .
	public abstract List<TareaWBS> getTareas(Filtro filtro);
	
	public abstract boolean tieneRecurso(Recurso filtro); 
	
	public abstract List<Recurso> getRecursos();
	
	public int getDuracionEstimada(){
		Period period = Period.between(this.getFechaInicioEstimada(), this.getFechaFinalizacionEstimada());
		return period.getDays();		
	}

	//5. Consultar si es posible asignar el recurso X a la tarea YY 
	//(tener en cuenta las fechas de utilización de los recursos y si los mismos son o no exclusivos).
	
	public abstract boolean addRecurso(Recurso r);
	
}
