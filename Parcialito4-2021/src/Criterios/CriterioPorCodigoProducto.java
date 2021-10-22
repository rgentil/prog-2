package Criterios;

import Principal.Vendedor;

public class CriterioPorCodigoProducto extends Criterio{
	
	private String codigo;
	
	public CriterioPorCodigoProducto(String codigo) {
		super();
		this.codigo = codigo;
	}

	public boolean cumple(Vendedor vendedor) {
		return vendedor.vendioElProducto(codigo) ;
 	}
	
		
}
