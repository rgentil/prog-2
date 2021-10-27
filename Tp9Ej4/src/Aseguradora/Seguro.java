package Aseguradora;

import java.util.Comparator;
import java.util.List;

import Filtros.Filtro;

public abstract class Seguro {

	private String dni;

	public Seguro(String dni) {
		super();
		this.dni = dni;
	}

	public abstract double getMontoPoliza();
	
	public abstract int getNroPoliza();
	
	public abstract List<SeguroSimple> buscar(Filtro f, Comparator<SeguroSimple> orden);
	
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
	
}
