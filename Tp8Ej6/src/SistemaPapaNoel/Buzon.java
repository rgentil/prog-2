package SistemaPapaNoel;

import java.util.ArrayList;
import java.util.List;

import Criterios.Criterio;

public class Buzon extends EntidadNavidad{
//Cada niño deposita su carta en el buzón correspondiente a su barrio. 

	private List<Carta> cartas;
	private List<String> niniosBuenos;
	
	//Cada buzón tiene asociado un conjunto de “niños buenos” que pueden dejar su carta en el mismo, identificados únicamente por su DNI. 
	public Buzon() {
		cartas = new ArrayList<Carta>();
		niniosBuenos = new ArrayList<String>();
	}
	
	public boolean tieneCarta(Carta c) {
		return cartas.contains(c);
	}
	
	//Si un “niño malo” intenta depositar una carta en el buzón, la lista de regalos correspondiente se vacía y 
	//	se reemplaza el regalo por un “Trozo de carbón”. 
	//Si un niño deposita más de una carta en el buzón, solo se considera la primera.
	public void addCarta(Carta c){
		if(!tieneCarta(c)) {
			if (!esNinioBueno(c)) {
				c.convertir();
			}
			cartas.add(c);
		}
	}
	
	public boolean esNinioBueno(Carta c) {
		return niniosBuenos.contains(c.getRemitente().getDni());
	}
	
	public boolean tieneNinioBueno(String dni) {
		return niniosBuenos.contains(dni);
	}
	
	public void addNinioBueno(Ninio ninio){
		if(!tieneNinioBueno(ninio.getDni())) {
			niniosBuenos.add(ninio.getDni());
		}
	}

	public boolean tieneRegalo(String regalo) {
		for (Carta carta : cartas) {
			if (carta.tieneRegalo(regalo))
				return true;
		}
		return false;
	}

	@Override
	public List<Carta> getCartasRecibidasPorRegalo(Criterio c) {
		List<Carta> resultado = new ArrayList<Carta>();
		for(Carta carta :cartas) {
			if (c.cumple(carta)) {
				resultado.add(carta);
			}
		}
		return resultado;
	}
	
	@Override
	public int getTotalCartasRecibidas() {
		return this.cartas.size();
	}

	@Override
	public int getCantidadNiniosMalosQueEnviaronCarta() {
		int resultado = 0;
		for (Carta carta : cartas) {
			if (carta.esNinioMalo()) {
				resultado ++;
			}
		}
		return resultado;
	}

}
