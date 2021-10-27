package Aseguradora;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import CalculoCostoPoliza.CalculoCostoPoliza;
import CalculoCostoPoliza.ValorFijo;
import Filtros.Filtro;

public class SeguroSimple extends Seguro{

	private int nroPoliza;
	private String descripcion;
	private double montoAsegurado;
	private CalculoCostoPoliza calculoCostoPoliza;
	
	public SeguroSimple(String dni, int nroPoliza, String descripcion, double montoAsegurado) {
		super(dni);
		this.nroPoliza = nroPoliza;
		this.descripcion = descripcion;
		this.montoAsegurado = montoAsegurado;
		this.calculoCostoPoliza = new ValorFijo(100);
	}
	
	public void setCalculoCostoPoliza(CalculoCostoPoliza nuevo) {
		this.calculoCostoPoliza = nuevo;
	}
	
	public double getCostoPoliza() {
		return calculoCostoPoliza.caluclarCosto(this);
	}
	
	@Override
	public double getMontoPoliza() {
		return this.getMontoPoliza();
	}
	
	@Override
	public boolean equals(Object o) {
		try {
			SeguroSimple s = (SeguroSimple) o;
			return this.getDni().equals(s.getDni()) && this.getDescripcion().equalsIgnoreCase(s.getDescripcion());
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public int getNroPoliza() {
		return nroPoliza;
	}
	
	@Override
	public List<SeguroSimple> buscar(Filtro f, Comparator<SeguroSimple> orden) {
		ArrayList<SeguroSimple> resultado = new ArrayList<SeguroSimple>();
		if (f.cumple(this)) {
			resultado.add(this);
		}
		return resultado;
	}
	
	public void setNroPoliza(int nroPoliza) {
		this.nroPoliza = nroPoliza;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public double getMontoAsegurado() {
		return montoAsegurado;
	}
	
	public void setMontoAsegurado(double montoAsegurado) {
		this.montoAsegurado = montoAsegurado;
	}
	
}
