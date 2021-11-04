package Filtros;

import Agencia.Paquete;

public class FiltroPorCiuidadOrigen extends Filtro {

	private String ciudad;
	
	public FiltroPorCiuidadOrigen(String ciudad) {
		this.ciudad = ciudad;
	}

	@Override
	public boolean cumple(Paquete paquete) {
		return paquete.getCiudadOrigen().equals(ciudad);
	}
}