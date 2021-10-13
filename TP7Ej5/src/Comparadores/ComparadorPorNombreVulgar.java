package Comparadores;

import java.util.Collections;
import java.util.List;

import Vivero.Planta;

public class ComparadorPorNombreVulgar extends Comparador{

	public ComparadorPorNombreVulgar() {
		super();
	}
	
	@Override
	public int compare(Planta p1, Planta p2) {
		List<String> lnv1 = p1.getNombreVulgares();
		List<String> lnv2 = p2.getNombreVulgares();
		
		Collections.sort(lnv1);
		Collections.sort(lnv2);
		
		int aux = 0;
		for (String n1 : lnv2) {
			for (String n2 : lnv2) {
				aux = n1.compareTo(n2);
				if (aux != 0) {
					return aux;
				}
			}
		}
		return aux;
	}	
	
}
