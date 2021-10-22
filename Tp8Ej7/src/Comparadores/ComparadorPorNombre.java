package Comparadores;

import java.util.Comparator;

import SistemaElectoral.Candidato;

public class ComparadorPorNombre implements Comparator<Candidato>{

	public ComparadorPorNombre() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compare(Candidato c1, Candidato c2) {
		return c1.getNombre().compareTo(c2.getNombre());
	}

}
