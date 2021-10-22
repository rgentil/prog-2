package Comparadores;

import java.util.Comparator;

import SistemaElectoral.Candidato;

public class ComparadorCompuesto implements Comparator<Candidato>{

	private Comparator<Candidato> c1;
	private Comparator<Candidato> c2;
	
	public ComparadorCompuesto(Comparator<Candidato> c1, Comparator<Candidato> c2) {
		this.c1 = c1;
		this.c2 = c2;
	}

	@Override
	public int compare(Candidato o1, Candidato o2) {
		int aux = c1.compare(o1, o2);
		if (aux == 0) {
			aux = c2.compare(o1, o2);
		}
		return aux;
	}
	
}
