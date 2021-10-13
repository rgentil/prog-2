package Criterios;

public abstract class CriterioString extends Criterio{

	private String filtro;

	public CriterioString(String filtro) {
		super();
		this.filtro = filtro.toUpperCase();
	}

	public String getFiltro() {
		return filtro;
	}
	
}
