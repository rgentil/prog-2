package Entidades;

import java.util.List;

import Filtros.Filtro;

// Los participantes pueden estar organizados en grupos y bandas, un grupo o banda posee una lista de miembros que los componen 
// (pueden ser integrantes o incluso sub bandas). Una banda o grupo posee un nombre, yuna edad.

public abstract class ElementoEquipo {

	private String nombre;
	
	public ElementoEquipo(String nombre) {
		this.nombre = nombre;		
	}
	
//	Edad (la cual se calcula como el promedio de las edades de cada uno de sus miembros).
	public abstract int getEdad();
	
	public abstract int getTotalIntegrantes();
	
//	Los géneros de preferencia se calculan como la intersección de los géneros de preferencia de todos sus miembros
	public abstract List<String> getGeneros();
	
	public abstract List<String> getIdiomas();
	
	public abstract List<String> getInstrumentos();
	
	public abstract List<ElementoEquipo> buscar(Filtro filtro);
	
	public abstract ElementoEquipo getCopiaEstructura();
	
	public abstract int getTotalDeInstrumentosRequeridosConocen(List<String> instrumentosNecesarios);
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
