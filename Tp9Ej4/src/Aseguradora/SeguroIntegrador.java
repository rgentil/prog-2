package Aseguradora;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import Filtros.Filtro;

public class SeguroIntegrador extends Seguro{

	private List<Seguro> seguros;
	
	public SeguroIntegrador(String dni) {
		super(dni);
		this.seguros = new ArrayList<Seguro>();
	}

	@Override
	public boolean equals(Object o) {
		try {
			Seguro s = (Seguro) o;
			return this.equals(s);
		} catch (Exception e) {
			return false;
		}
	}
	
	private boolean tieneSeguro(Seguro s) {
		return this.seguros.contains(s);
	}
	
	public void addSeguro(Seguro s) {
		if(!tieneSeguro(s)) {
			this.seguros.add(s);
		}
	}

	@Override
	public double getMontoPoliza() {
		double montoTotalPoliza = 0.0;
		for (Seguro seguro : seguros) {
			montoTotalPoliza += seguro.getMontoPoliza();
		}
		return montoTotalPoliza;
	}

	@Override
	public int getNroPoliza() {
		int nroPoliza = 0;
		for (Seguro seguro : seguros) {
			if (seguro.getNroPoliza() > nroPoliza) {
				nroPoliza = seguro.getNroPoliza();
			}
		}
		return nroPoliza;
	}
	
	@Override
	public List<SeguroSimple> buscar(Filtro f, Comparator<SeguroSimple> orden) {
		ArrayList<SeguroSimple> resultado = new ArrayList<SeguroSimple>();
		for (Seguro seguro : seguros) {
			resultado.addAll(seguro.buscar(f, orden));
		}
		Collections.sort(resultado, orden);
		return resultado;
	}
	

}
