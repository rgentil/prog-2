package SistemaElectoral;
import java.util.ArrayList;
import java.util.List;

import Filtros.Criterio;

public class GrupoMesas extends EntidadVoto{

	private List<EntidadVoto> entidades;

	@Override
	public List<Voto> getListaVotosPorCriterio(Criterio c) {
		List<Voto> resultado = new ArrayList<Voto>();
		for (EntidadVoto entidad : entidades) {
			resultado.addAll(entidad.getListaVotosPorCriterio(c));
		}
		return resultado;
	}

	@Override
	public int getCantidadTotalVotosEmitidos() {
		int cantidad = 0;
		for (EntidadVoto entidad : entidades) {
			cantidad += entidad.getCantidadTotalVotosEmitidos();
		}
		return cantidad;
	}
	

}
