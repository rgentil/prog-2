package Agencia;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import Filtros.Filtro;

public class PaqueteCompuesto extends Paquete{

	private List<Paquete> paquetes;

	public PaqueteCompuesto(int idPaquete, int cantPasajeros) {
		super(idPaquete, cantPasajeros);
		this.paquetes = new ArrayList<Paquete>();
	}
	
	private boolean esVacio() {
		return this.paquetes.isEmpty();
	}
	
	private boolean nroValidoDePasajeros(Paquete paquete) {
		return this.getCantPasajeros() == paquete.getCantPasajeros();
	}
	
	private int cantElementos() {
		return paquetes.size();
	}
	
	public void addPaquete(Paquete paquete) {
		if (nroValidoDePasajeros(paquete)){
			if (esVacio()) {
				paquetes.add(paquete);
			}else {
				Paquete p1 = paquetes.get(this.cantElementos());
				if (p1.getCiudadDestino().equals(paquete.getCiudadOrigen())){
					paquetes.add(paquete);
				}
			}	
		}
	}
	
	@Override
	public LocalDate getFechaPagoAcordada() {
		LocalDate fecAux = LocalDate.of(1900, 1, 1);
		for (Paquete paquete : paquetes) {
			LocalDate fecPago = paquete.getFechaPagoAcordada();
			if (fecPago == null) {
				return null;
			}else {
				if (fecAux.isBefore(fecPago)){
					fecAux = fecPago;
				}
			}
		}
		return fecAux;
	}

	@Override
	public double getCosto() {
		double total = 0.0;
		for (Paquete paquete : paquetes) {
			total += paquete.getCosto();
		}
		return total;
	}

	@Override
	public String getCiudadOrigen() {
		String ciudadOrigen = "";
		if (!this.esVacio()) {
			ciudadOrigen = (paquetes.get(0)).getCiudadOrigen();
		}
		return ciudadOrigen;
	}

	@Override
	public String getCiudadDestino() {
		String ciudadDestino = "";
		if (!this.esVacio()) {
			ciudadDestino = (paquetes.get(this.cantElementos())).getCiudadDestino();
		}
		return ciudadDestino;
	}
	
	@Override
	public List<Paquete> buscar(Filtro filtro, Comparator<Paquete> orden) {
		List<Paquete> resultado = new ArrayList<Paquete>();
		
		if (filtro.cumple(this)) {
			resultado.add(this);
		}else {
			for (Paquete paquete : paquetes) {
				resultado.addAll(paquete.buscar(filtro, orden));
			}
		}
		Collections.sort(resultado,orden);
		return resultado;
	}
		
}
