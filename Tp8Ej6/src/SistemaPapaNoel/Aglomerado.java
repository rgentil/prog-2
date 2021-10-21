package SistemaPapaNoel;

import java.util.ArrayList;
import java.util.List;

public class Aglomerado extends EntidadNavidad {

	private String nombre;
	private List<EntidadNavidad> entidades;
	
	public Aglomerado(String nombre) {
		this.nombre = nombre;
		this.entidades = new ArrayList<EntidadNavidad>();
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public List<Carta> getCartasRecibidasPorRegalo(String regalo) {
		List<Carta> resultado = new ArrayList<Carta>();
		for(EntidadNavidad e : entidades) {
			resultado.addAll(e.getCartasRecibidasPorRegalo(regalo));	
		}
		return resultado;
	}
	
	@Override
	public int getTotalCartasRecibidas() {
		int resultado = 0;
		for(EntidadNavidad e : entidades) {
			resultado += e.getTotalCartasRecibidas();
		}
		return resultado;
	}

	@Override
	public int getCantidadNiniosMalosQueEnviaronCarta() {
		int resultado = 0;
		for(EntidadNavidad e : entidades) {
			resultado += e.getCantidadNiniosMalosQueEnviaronCarta();
		}
		return resultado;
	}


}
