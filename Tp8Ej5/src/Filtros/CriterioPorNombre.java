package Filtros;

import SistemaArchivo.ArchivoSistema;

public class CriterioPorNombre extends Criterio{

	private String filtroNombre;
	
	public CriterioPorNombre(String filtro) {
		this.filtroNombre = filtro; 
	}
	
	public boolean cumple(ArchivoSistema a) {
		return a.getNombre().contains(filtroNombre);
	}

}
