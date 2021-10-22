package Principal;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Comparadores.Comparador;
import Criterios.Criterio;
import Criterios.CriterioPorCantVentasPorPeriodo;

public class Empresa {

	private String nombre;
	private List<Vendedor> vendedores;

	private Comparador metodoRankeador;
	
	public Empresa(String nombre, Comparador rankeador) {
		this.nombre = nombre;
		this.vendedores = new ArrayList<Vendedor>();
		this.metodoRankeador = rankeador;
	}
	
	public List<Vendedor> Rankear(){
		List<Vendedor> resultado = new ArrayList<Vendedor>(this.vendedores);
		Collections.sort(resultado, this.metodoRankeador);
		return resultado;
	}
	
	//Para cambiar el metodo que va a tener la empreza para rankear a los vendedor 
	//Por ejemplo ComparadorPorGananciaTotalVentasEnPeriodo(LocalDate desde, LocalDate hasta) como se pide en el enunciado 
	public void setMetodoRankeador(Comparador nuevoMetodo) {
		this.metodoRankeador = nuevoMetodo;
	}
	
	public boolean TieneVendedor(Vendedor vendedor) {
		return this.vendedores.contains(vendedor);
	}
	
	public void addVendedor(Vendedor vendedor) {
		if(!TieneVendedor(vendedor)) {
			this.addVendedor(vendedor);
		}
	}
	
	private List<Vendedor> buscar(Criterio criterio) {
		List<Vendedor> resultado = new ArrayList<Vendedor>();
		for(Vendedor vendedor : this.vendedores) {
			if (criterio.cumple(vendedor)) {
				resultado.add(vendedor);
			}
		}
		Collections.sort(resultado);
		return resultado;
	}
	
	/*
	
	Estos métodos irían en un main. Dejo uno descomentado para que no hay warning
	
	*/
	
	//● que vendieron más de 200 productos en un período dado
	public List<Vendedor> getVendedoresPorCantVentasEnPeriodo(int cantVentas, LocalDate desde, LocalDate hasta){
		return this.buscar(new CriterioPorCantVentasPorPeriodo(cantVentas,desde,hasta));
	}
	/*
	//● que generaron a la empresa ganancias por más de $150.200
	public List<Vendedor> getVendedoresPorGananciaMayor(double ganancia){
		return this.buscar(new CriterioPorGananciaMayor(ganancia));
	}
	
	//● que vendieron el producto con código “TUDA678”
	public List<Vendedor> getVendedoresPorCodigoProducto(String codigo){
		return this.buscar(new CriterioPorCodigoProducto(codigo));
	}

	//● que vendieron el producto con código “NIK2348” y generaron ganancias por más de $260.000 en un período dado (independientemente del producto vendido)
	public List<Vendedor> getVendedoresPorCodigoGananciaMayorPorPeriodo(String codigo, double ganancia, LocalDate desde, LocalDate hasta){
		Criterio c1 = new CriterioPorCodigoProducto(codigo);
		Criterio c2 = new CriterioPorGananciaMayor(ganancia);
		Criterio c3 = new CriterioPorEnPeriodo(desde, hasta);
		Criterio c4 = new CriterioAND(c1,c2);
		Criterio c5 = new CriterioAND(c4, c3);
		return this.buscar(c5);
	}
	
	public List<Vendedor> getVendedoresCriterioAND(Criterio c1, Criterio c2){
		return this.buscar(new CriterioAND(c1, c2));
	}
	
	public List<Vendedor> getVendedoresCriterioOR(Criterio c1, Criterio c2){
		return this.buscar(new CriterioOR(c1, c2));
	}
	
	public List<Vendedor> getVendedoresCriterioNot(Criterio c){
		return this.buscar(new CriterioNOT(c));
	}
	
	*/
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
