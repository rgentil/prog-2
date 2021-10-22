package SistemaElectoral;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SistemaElectoral {

	private List<Candidato> candidatos;
	private List<EntidadVoto> entidades;
	
	public SistemaElectoral() {
		this.candidatos = new ArrayList<Candidato>();
		this.entidades = new ArrayList<EntidadVoto>();
	}

	public void addCandidato(Candidato c) {
		this.candidatos.add(c);
	}
	
	public void addEntidad(EntidadVoto e) {
		this.entidades.add(e);
	}
	
	public List<Candidato> getTotalCandidatosPresentes(){
		List<Candidato> resultado = new ArrayList<Candidato>(candidatos);
		//Si siempre se va a ordenar igual compareTo de Comparable:
		Collections.sort(resultado);
		
		//Si puede que cambie el orden, que no es el caso, se usa, compare de Comparable:
		//Collections.sort(resultado, Comparator<Candidato>);
		
		return resultado;
		
		
	}
	
}
