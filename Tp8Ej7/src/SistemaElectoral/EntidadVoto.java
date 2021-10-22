package SistemaElectoral;
import java.util.List;

import Filtros.Criterio;

public abstract class EntidadVoto {
	
	public double calcularPorcentaje(int votosCumplen, int totalVotosEmitidos) {
		double resultado = 0;
		if (totalVotosEmitidos > 0)
			resultado = (votosCumplen / totalVotosEmitidos) * 100;
		return resultado;		
	}
	
	public abstract List<Voto> getListaVotosPorCriterio(Criterio c);
	
	public int getTotalVotosPorCriterio(Criterio c) {
		return (this.getListaVotosPorCriterio(c)).size();
	}
	
	public abstract int getCantidadTotalVotosEmitidos();
	
	/*
	Implementar los siguientes servicios:
		1. Dada una mesa, un establecimiento educativo, un barrio o una localidad, conocer el
			porcentaje de votos recibidos por un candidato particular.
		2. Dada una mesa, un establecimiento educativo, un barrio o una localidad, conocer el
			porcentaje de votos en blanco recibidos.
		3. Dada una mesa, un establecimiento educativo, un barrio o una localidad, conocer el
			porcentaje de votos que se emitieron entre las 10:00 y las 11:00. (La clase LocalDate
			implementa la interface Comparable)
		4. Dada una mesa, un establecimiento educativo, un barrio o una localidad, conocer la
			cantidad total de votos que se emitieron.
	
	Aclaración, los porcentajes se calculan como la cantidad de votos que cumplen la condición
		dividido el total de votos emitidos en la mesa, establecimiento, barrio o localidad
		multiplicado por 100.
	 */	
	
	public double getPorcentajePorCritero(Criterio c) {
		int votosDelCandidato = getTotalVotosPorCriterio(c);
		int totalVotosEmitidos = this.getCantidadTotalVotosEmitidos();
		return calcularPorcentaje(votosDelCandidato, totalVotosEmitidos);
	}
	
}
