package Filtros;

import SistemaArchivo.ArchivoSistema;

public class CriterioPorContieneNombre extends Criterio{

	private String filtroNombre;
	
	public CriterioPorContieneNombre(String filtro) {
		this.filtroNombre = filtro; 
	}
	
	public boolean cumple(ArchivoSistema a) {
		return a.getNombre().contains(filtroNombre);
	}

}
