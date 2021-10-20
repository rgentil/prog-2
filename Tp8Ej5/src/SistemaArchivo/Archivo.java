package SistemaArchivo;

import java.util.ArrayList;
import java.util.List;

import Filtros.Criterio;

public class Archivo extends ArchivoSistema{

	private double tamanio;
	
	public Archivo(String nombre, double tamanio) {
		super(nombre);
		this.tamanio = tamanio;
	}

	@Override
	public double getTamanio() {
		return this.tamanio;
	}

	@Override
	public int getCantidadDeArchivos() {
		return 1;
	}

	@Override
	public int getCantidadElementos() {
		return this.getCantidadDeArchivos();
	}
	
	@Override
	public List<ArchivoSistema> buscar(Criterio c) {
		List<ArchivoSistema> resultado = new ArrayList<ArchivoSistema>();
		if (c.cumple(this))
			resultado.add(this);
		return resultado;
	}


}
