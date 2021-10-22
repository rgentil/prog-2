package Comparadores;

import java.time.LocalDate;
import java.util.Comparator;

import Principal.Vendedor;

public abstract class Comparador implements Comparator<Vendedor>{

	private LocalDate desde;
	private LocalDate hasta;
	
	public Comparador(LocalDate desde, LocalDate hasta) {
		super();
		this.desde = desde;
		this.hasta = hasta;
	}

	public LocalDate getDesde() {
		return desde;
	}

	public void setDesde(LocalDate desde) {
		this.desde = desde;
	}

	public LocalDate getHasta() {
		return hasta;
	}

	public void setHasta(LocalDate hasta) {
		this.hasta = hasta;
	}

	
	
}
