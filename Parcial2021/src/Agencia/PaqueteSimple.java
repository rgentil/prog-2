package Agencia;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import Filtros.Filtro;

public class PaqueteSimple extends Paquete{
	private String datoAlojamiento;
	private String ciudadOrigen;
	private String ciudadDestino;
	private LocalDate fechaPagoAcordada;
	private double costo;

	public PaqueteSimple(int idPaquete, int cantPasajeros, String datoAlojamiento, String ciudadOrigen,String ciudadDestino, double costo) {
		super(idPaquete, cantPasajeros);
		this.datoAlojamiento = datoAlojamiento;
		this.ciudadOrigen = ciudadOrigen;
		this.ciudadDestino = ciudadDestino;
		this.fechaPagoAcordada = null;
		this.costo = costo;
	}
	
	//Constructor para el Paquete viaje con amigos. Sin alojamiento ya que este se asigna despues.
	public PaqueteSimple(int idPaquete, int cantPasajeros, String ciudadOrigen,String ciudadDestino, double costo) {
		super(idPaquete, cantPasajeros);
		this.datoAlojamiento = null;
		this.ciudadOrigen = ciudadOrigen;
		this.ciudadDestino = ciudadDestino;
		this.fechaPagoAcordada = null;
		this.costo = costo;
	}
	
	@Override
	public LocalDate getFechaPagoAcordada() {
		return fechaPagoAcordada;
	}
	
	@Override
	public double getCosto() {
		return costo;
	}
	
	@Override
	public String getCiudadOrigen() {
		return ciudadOrigen;
	}

	@Override
	public String getCiudadDestino() {
		return ciudadDestino;
	}
	
	@Override
	public List<Paquete> buscar(Filtro filtro, Comparator<Paquete> orden) {
		List<Paquete> resultado = new ArrayList<Paquete>();
		if (filtro.cumple(this)) {
			resultado.add(this);
		}
		return resultado;
	}
	
	public void setFechaPagoAcordada(LocalDate fechaPago) {
		this.fechaPagoAcordada = fechaPago;
	}
	
	public String getDatoAlojamiento() {
		return datoAlojamiento;
	}
	
	public void setDatoAlojamiento(String datoAlojamiento) {
		this.datoAlojamiento = datoAlojamiento;
	}
	
}
