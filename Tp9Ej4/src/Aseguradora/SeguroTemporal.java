package Aseguradora;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import Filtros.Filtro;

public class SeguroTemporal extends Seguro {

	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private Seguro seguroContenido;
	
	public SeguroTemporal(String dni, LocalDate fechaInicio, LocalDate fechaFin, Seguro seguroContenido) {
		super(dni);
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.seguroContenido = seguroContenido;
	}

	private boolean activo() {
		return this.getFechaInicio().isBefore(LocalDate.now()) && this.getFechaFin().isAfter(LocalDate.now());
	}
	
	@Override
	public double getMontoPoliza() {
		if (this.activo())
			return seguroContenido.getMontoPoliza();
		return 0;
	}
	
	@Override
	public int getNroPoliza() {
		return this.seguroContenido.getNroPoliza();
	}
	
	@Override
	public List<SeguroSimple> buscar(Filtro f, Comparator<SeguroSimple> orden) {
		ArrayList<SeguroSimple> resultado = new ArrayList<SeguroSimple>();
		resultado.addAll(this.seguroContenido.buscar(f, orden));
		return resultado;
	}
	
	public Seguro getSeguroContenido() {
		return seguroContenido;
	}

	public void setSeguroContenido(Seguro seguroContenido) {
		this.seguroContenido = seguroContenido;
	}

	public LocalDate getFechaInicio() {
		return fechaInicio;
	}
	
	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public LocalDate getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(LocalDate fechaFin) {
		this.fechaFin = fechaFin;
	}
	
}
