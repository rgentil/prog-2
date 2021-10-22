package Filtros;

import SistemaElectoral.Voto;

public abstract class Criterio {

	public abstract boolean cumple(Voto v);

}
