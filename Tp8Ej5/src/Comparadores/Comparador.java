package Comparadores;

import java.util.Comparator;

import SistemaArchivo.ArchivoSistema;

public abstract class Comparador implements Comparator<ArchivoSistema> {
	
	public abstract int compare(ArchivoSistema a1, ArchivoSistema a2);

}
