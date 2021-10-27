package WorkBreakdownStructure;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import Filtros.Filtro;

public class TareaSimple extends TareaWBS{

	private List<Recurso> recursos;
	private LocalDate fechaInicioEstimada;
	private LocalDate fechaFinEstimada;
	private LocalDate fechaInicioReal;
	private LocalDate fechaFinReal;
	
	public TareaSimple(LocalDate fechaInicioEstimada, LocalDate fechaFinEstimada) {
		super();
		this.recursos = new ArrayList<Recurso>();
		this.fechaInicioEstimada = fechaInicioEstimada;
		this.fechaFinEstimada = fechaFinEstimada;
		this.fechaInicioReal = null;
		this.fechaFinReal = null;

	}
	
	@Override
	public boolean tieneRecurso(Recurso r) {
		return recursos.contains(r);
	}
	
	@Override
	public boolean addRecurso(Recurso r) {
		if (r.noEstaOcupado()) {
			r.setEstado(Util.OCUPADO);
			recursos.add(r);
			return true;
		}
		return false;
	}
	
	@Override
	public LocalDate getFechaInicioEstimada() {
		return this.fechaInicioEstimada;
	}
	
	@Override
	public LocalDate getFechaFinalizacionEstimada() {
		return this.fechaFinEstimada;
	}

	@Override
	public List<TareaWBS> getTareas(Filtro filtro) {
		List<TareaWBS> aux = new ArrayList<TareaWBS>();
		if (filtro.cumple(this)) {
			aux.add(this);
		}
		return aux;
	}	
	
	@Override
	public List<Recurso> getRecursos() {
		List<Recurso> resultado = new ArrayList<Recurso>();
		for (Recurso recurso : recursos) {
			resultado.add(recurso);
		}
		return resultado;
	}
	
	public LocalDate getFechaInicioReal() {
		return fechaInicioReal;
	}

	public void setFechaInicioReal(LocalDate fechaInicioReal) {
		this.fechaInicioReal = fechaInicioReal;
	}

	public LocalDate getFechaFinReal() {
		return fechaFinReal;
	}

	public void setFechaFinReal(LocalDate fechaFinReal) {
		this.fechaFinReal = fechaFinReal;
	}

}
