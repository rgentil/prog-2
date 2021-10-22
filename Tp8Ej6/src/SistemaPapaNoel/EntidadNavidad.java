package SistemaPapaNoel;

import java.util.List;

import Criterios.Criterio;
import Criterios.CriterioPorRegalo;

public abstract class EntidadNavidad {

	//Aclaración, los porcentajes se calculan como la cantidad de cartas que cumple la condición
	//dividido el total de cartas recibidas en el buzón, provincia o país, multiplicado por 100.
	
	//	Implementar los siguientes servicios:
	//		1. Dado un buzón, provincia o país, conocer el porcentaje de cartas recibidas que piden un determinado regalo.
	public double getPorcentajeCartasPorRegalo(String regalo) {
		int totalCartas = this.getTotalCartasRecibidas();
		List<Carta> cartas = this.getCartasRecibidasPorRegalo(new CriterioPorRegalo(regalo));
		return calcularPorcentaje(totalCartas, cartas.size());
	}
	
	private double calcularPorcentaje(int cantCartasCondicion, int totalCartas) {
		if (totalCartas != 0) {
			return (cantCartasCondicion / totalCartas) * 100;
		}
		return 0;
	}
	
	//		2. Dado un buzón, provincia o país, conocer la cantidad de cartas recibidas que piden undeterminado regalo.
	public abstract List<Carta> getCartasRecibidasPorRegalo(Criterio c);
	
	//		3. Dado un buzón, provincia o país, conocer la cantidad de niños malos que enviaron una carta.
	public abstract int getCantidadNiniosMalosQueEnviaronCarta();
	
	//		4. Dado un buzón, provincia o país, conocer la cantidad de total de cartas recibidas.
	public abstract int getTotalCartasRecibidas();

}
