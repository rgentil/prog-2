package Criterios;

public abstract class CriterioInteger extends Criterio{

	private int filtro;

	public CriterioInteger(int filtro) {
		super();
		this.filtro = filtro;
	}

	public int getFiltro() {
		return filtro;
	}
	

}
