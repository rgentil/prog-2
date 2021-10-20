package SistemaArchivo;
import java.util.ArrayList;
import java.util.List;

import Filtros.Criterio;

public class Carpeta extends ArchivoSistema {

	private List<ArchivoSistema> archivos;
	
	public Carpeta(String nombre) {
		super(nombre);
		this.archivos = new ArrayList<ArchivoSistema>();
	}

	@Override
	public double getTamanio() {
		double tamanioTotal = 0;
		for (ArchivoSistema a : archivos) {
			tamanioTotal += a.getTamanio();
		}
		return tamanioTotal;
	}

	@Override
	public int getCantidadDeArchivos() {
		int total = 0;
		for (ArchivoSistema a : archivos) {
			total += a.getCantidadDeArchivos();
		}
		return total;
	}

	@Override
	public int getCantidadElementos() {
		int total = 1;
		for (ArchivoSistema a : archivos) {
			total += a.getCantidadDeArchivos();
		}
		return total;
	}

	@Override
	public List<ArchivoSistema> buscar(Criterio c) {
		List<ArchivoSistema> resultado = new ArrayList<ArchivoSistema>();
		if (c.cumple(this)) {
			resultado.add(this);
		}
		for(ArchivoSistema a : archivos) {
			if (c.cumple(a)) {
				resultado.add(a);
			}
		}
		return resultado;
	}
	


}
