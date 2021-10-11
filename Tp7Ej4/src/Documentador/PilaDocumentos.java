package Documentador;

import java.util.ArrayList;
import java.util.List;

import Criterios.Criterio;

public class PilaDocumentos {
	
	private List<Documento> documentos;
	
	public PilaDocumentos() {
		this.documentos = new ArrayList<Documento>();
	}

	public List<Documento> getDocumentos() {
		return new ArrayList<Documento>(documentos);
	}

	public void addDocumento(Documento documento) {
		this.documentos.add(documento);
	}

	public List<Documento> buscar(Criterio criterio) {
		List<Documento> resultado = new ArrayList<Documento>();
		for (Documento d : documentos) {
			if (criterio.cumple(d)) {
				resultado.add(d);
			}
		}
		return resultado;
	}
	
}
