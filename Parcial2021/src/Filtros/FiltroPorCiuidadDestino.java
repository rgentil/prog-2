package Filtros;

import Agencia.Paquete;

public class FiltroPorCiuidadDestino extends Filtro {

	private String ciudad;
	
	public FiltroPorCiuidadDestino(String ciudad) {
		this.ciudad = ciudad;
	}

	@Override
	public boolean cumple(Paquete paquete) {
		return paquete.getCiudadDestino().equals(ciudad);
	}
}