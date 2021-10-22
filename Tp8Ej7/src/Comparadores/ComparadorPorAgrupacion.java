package Comparadores;

import java.util.Comparator;

import SistemaElectoral.Candidato;

public class ComparadorPorAgrupacion implements Comparator<Candidato>{

	public ComparadorPorAgrupacion() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compare(Candidato c1, Candidato c2) {
		return c1.getAgrupacion().compareTo(c2.getAgrupacion());
	}

}
