package Agencia;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;

import Filtros.Filtro;

public abstract class Paquete {
	
	private int idPaquete;
	private int cantPasajeros;
	
	public Paquete(int idPaquete, int cantPasajeros) {
		this.idPaquete = idPaquete;
		this.cantPasajeros = cantPasajeros;
	}

	public abstract LocalDate getFechaPagoAcordada();
	
	public abstract double getCosto();
	
	public abstract String getCiudadOrigen();

	public abstract String getCiudadDestino();

	public abstract List<Paquete> buscar(Filtro filtro, Comparator<Paquete> orden);
	
	public int getIdPaquete() {
		return idPaquete;
	}

	public int getCantPasajeros() {
		return cantPasajeros;
	}
	
	

}
