package Participantes;

import java.util.List;

import Filtros.Filtro;

public abstract class ElementoEquipo {

	private String nombre;
	
	public ElementoEquipo(String nombre) {
		this.nombre = nombre;		
	}
	
	public abstract int getEdad();
	
	public abstract int getTotalIntegrantesParticipantes();
	
	public abstract List<String> getGeneros();
	
	public abstract int getTotalGeneros();
	
	public abstract List<String> getIdiomas();
	
	public abstract int getTotalIdiomas();
	
	public abstract List<String> getInstrumentos();
	
	public abstract int getTotalInstrumentos();
	
	public abstract void addParticipante(ElementoEquipo nuevo);
	
	public abstract boolean tocaInstrumento(String instrumento);
	
	public abstract boolean sabeIdioma(String idioma);
	
	public abstract boolean tieneGenero(String genero);
	
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
