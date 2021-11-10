package Participantes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Filtros.Filtro;

public class Grupo extends ElementoEquipo {

	private List<ElementoEquipo> participantes;

	public Grupo(String nombre) {
		super(nombre);
		this.participantes = new ArrayList<ElementoEquipo>();
	}
	
	//Promedio de las edades de cada uno de sus miembros para saber la edad
	@Override
	public int getEdad() {
		int aux = 0; 
		for (ElementoEquipo participante : participantes) {
			aux += participante.getEdad();
		}
		if (aux == 0) {
			return aux;
		}else {
			return aux / this.getTotalIntegrantesParticipantes();
		}
	}
	
	@Override
	public int getTotalIntegrantesParticipantes() {
		int aux = 0;
		for (ElementoEquipo participante : participantes) {
			aux += participante.getTotalIntegrantesParticipantes();
		}
		return aux;
	}
	
	@Override
	public boolean tieneGenero(String genero) {
		boolean resultado = true;
		for (ElementoEquipo participante : participantes) {
			if (!participante.tieneGenero(genero)) {
				//Si al menos uno no tiene el genero retorna false
				return false;
			}
		}
		return resultado;
	}
	
	//Intersección de los géneros de preferencia de todos sus miembros
	@Override
	public List<String> getGeneros() {
		List<String> resultado = new ArrayList<String>();
		for (ElementoEquipo participante : participantes) {
			List<String> generos = participante.getGeneros();
			for (String genero : generos) {
				if (this.tieneGenero(genero)) {
					if (!resultado.contains(genero)) {//Sin repetir
						resultado.add(genero);
					}	
				}
			}			
		}
		
		if (!resultado.isEmpty()) {//Ordenado
			Collections.sort(resultado);
		}
		
		return resultado;
	}
	
	//En el caso de los idiomas que pueden interpretar una banda o grupo se considera la unión
	//de los idiomas de todos sus miembros (no pueden existir repetidos), 
	//lo mismo ocurre para los instrumentos que puede tocar una banda
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
			grupo.addParticipante(participante.getCopiaEstructura());
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

	public boolean tieneParticipante(ElementoEquipo p) {
		return participantes.contains(p);
	}
	
	public void addParticipante(ElementoEquipo p) {
		if (p != null) {
			if(!tieneParticipante(p)) {
				participantes.add(p);
			}
		}
	}	
	
	@Override
	public boolean tocaInstrumento(String instrumento) {
		boolean resultado = true;
		for (ElementoEquipo participante : participantes) {
			if (!participante.tocaInstrumento(instrumento)) {
				return false;
			}
		}
		return resultado;
	}

	@Override
	public boolean sabeIdioma(String idioma) {
		boolean resultado = true;
		for (ElementoEquipo participante : participantes) {
			if (!participante.sabeIdioma(idioma)) {
				return false;
			}
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
	public int getTotalGeneros() {
		int resultado = 0;
		for (ElementoEquipo participante : participantes) {
			resultado += participante.getTotalGeneros();
		}
		return resultado;
	}

	@Override
	public int getTotalIdiomas() {
		int resultado = 0;
		for (ElementoEquipo participante : participantes) {
			resultado += participante.getTotalIdiomas();
		}
		return resultado;
	}

	@Override
	public int getTotalInstrumentos() {
		int resultado = 0;
		for (ElementoEquipo participante : participantes) {
			resultado += participante.getTotalInstrumentos();
		}
		return resultado;
	}

}
