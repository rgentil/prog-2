package Entidades;

import java.util.ArrayList;
import java.util.List;

import Filtros.Filtro;

public class Grupo extends ElementoEquipo {

	private List<ElementoEquipo> participantes;

	public Grupo(String nombre) {
		super(nombre);
		this.participantes = new ArrayList<ElementoEquipo>();
	}
		
//	Promedio de las edades de cada uno de sus miembros para saber la edad
	@Override
	public int getEdad() {
		int aux = 0; 
		for (ElementoEquipo participante : participantes) {
			aux += participante.getEdad();
		}
		if (aux == 0) {
			return aux;
		}else {
			return aux / this.getTotalIntegrantes();
		}
	}
	
	@Override
	public int getTotalIntegrantes() {
		int aux = 0;
		for (ElementoEquipo participante : participantes) {
			aux += participante.getTotalIntegrantes();
		}
		return aux;
	}
	
	public void addIntegrante(ElementoEquipo nuevoIntegrante) {
		this.participantes.add(nuevoIntegrante);
	}
	
//	Intersección de los géneros de preferencia de todos sus miembros
	@Override
	public List<String> getGeneros() {
		List<String> resultado = new ArrayList<String>();
		if (!this.participantes.isEmpty()) {
			resultado = participantes.get(0).getGeneros();
			for (ElementoEquipo participante : participantes) {
				resultado.retainAll(participante.getGeneros()); 
			}
		}
		return resultado;
	}
	
//	En el caso de los idiomas que pueden interpretar una banda o grupo se considera la unión
//	de los idiomas de todos sus miembros (no pueden existir repetidos), 
//	lo mismo ocurre para los instrumentos que puede tocar una banda
	@Override
	public List<String> getIdiomas() {
		List<String> resultado = new ArrayList<String>();
		for (ElementoEquipo participante : participantes) {
			List<String> idiomas = participante.getIdiomas();
			for (String idioma : idiomas) {
				if (!resultado.contains(idioma)) {
					resultado.add(idioma);
				}	
			}			
		}
		return resultado;
	}
	
	@Override
	public List<String> getInstrumentos() {
		List<String> resultado = new ArrayList<String>();
		for (ElementoEquipo participante : participantes) {
			List<String> instrumentos = participante.getInstrumentos();
			for (String instrumento : instrumentos) {
				if (!resultado.contains(instrumento)) {
					resultado.add(instrumento);
				}	
			}			
		}
		return resultado;
	}
	
	@Override
	public List<ElementoEquipo> buscar(Filtro filtro) {
		List<ElementoEquipo> resultado = new ArrayList<ElementoEquipo>();
		if (filtro.cumple(this)) {
			resultado.add(getCopiaEstructura());//Copio la estructura entera.
		}else {
			for (ElementoEquipo participante : participantes) {
				resultado.addAll(participante.buscar(filtro));
			}	
		}
		return resultado;
	}
	
	@Override
	public ElementoEquipo getCopiaEstructura() {
		Grupo grupo = new Grupo(this.getNombre());
		for (ElementoEquipo participante : participantes) {
			grupo.participantes.add(participante.getCopiaEstructura());
		}	
		return grupo;
	}
	
	@Override
	public int getTotalDeInstrumentosRequeridosConocen(List<String> instrumentosNecesarios) {
		int resultado = 0;
		for (ElementoEquipo participante : participantes) {
			resultado += participante.getTotalDeInstrumentosRequeridosConocen(instrumentosNecesarios);
		}	
		return resultado;
	}

	@Override
	public boolean equals(Object grupo) {
		try {
			Grupo g = (Grupo) grupo;
			return g.getNombre().equals(g.getNombre());	
		} catch (Exception e) {
			return false; 
		}		
	}

	@Override
	public String toString() {
		return "---- "+ super.getNombre() + "\n" + participantes+ "\n";
	}

}
