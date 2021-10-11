package Documentador;

import java.util.List;

import Criterios.CriterioPorAutor;
import Criterios.CriterioPorContenido;
import Criterios.CriterioPorContenidoCantPalabras;
import Criterios.CriterioPorPalabraClave;
import Criterios.CriterioPorSinPalabraClave;
import Criterios.CriterioPorTitulo;
import Criterios.CriterioPorTituloContiene;

/*
4. Búsqueda de documentos
	Un historiador desea digitalizar sus documentos y organizarlo de acuerdo a palabras clave.
	
	Un documento tiene un título, una lista de autores, un contenido textual y una lista de
	palabras clave. 
	
	El historiador necesita poder encontrar fácilmente documentos en su
	colección de acuerdo a diferentes criterios, por ejemplo:
a) Todos los documentos cuyo título sea exactamente igual a un título dado.
b) Todos los documentos cuyo título contenga una palabra o frase dada.
c) Todos los documentos que contengan una palabra clave dada.
d) Todos los documentos que no contengan ninguna palabra clave.
e) Todos los documentos de un autor determinado.
f) Todos los documentos cuyo contenido tenga una palabra o frase dada.
g) Todos los documentos cuyo contenido tenga al menos 20 palabras.
h) Cualquier combinación lógica de las formas anteriores.
*/

public class Historiador {

	private String nombre;
	
	private PilaDocumentos documentos;
	
	public Historiador(String nombre) {
		this.documentos = new PilaDocumentos();
		this.nombre = nombre;
	}
	
	public List<Documento> getDocumentosPorTitulo(String titulo) {
		System.out.println("\n Titulo = " + titulo + "\n");
		return documentos.buscar(new CriterioPorTitulo(titulo.toUpperCase()));
	}
	
	public List<Documento> getDocumentosPorTituloContiene(String contenido) {
		System.out.println("\n Titulo Contenido = " + contenido + "\n");
		return documentos.buscar(new CriterioPorTituloContiene(contenido.toUpperCase()));
	}
	
	public List<Documento> getDocumentosPorPalabraClave(String palabraClave) {
		System.out.println("\n Palabra clave = " + palabraClave + "\n");
		return documentos.buscar(new CriterioPorPalabraClave(palabraClave.toUpperCase()));
	}	
	
	public List<Documento> getDocumentosSinPalabraClave() {
		System.out.println("\n Sin Palabra clave \n");
		return documentos.buscar(new CriterioPorSinPalabraClave());
	}
	
	public List<Documento> getDocumentosPorAutor(String autor) {
		System.out.println("\n Autor = " + autor + "\n");
		return documentos.buscar(new CriterioPorAutor(autor.toUpperCase()));
	}
	
	public List<Documento> getDocumentosPorContenido(String contenido) {
		System.out.println("\n Palabra dentro del contenido = " + contenido + "\n");
		return documentos.buscar(new CriterioPorContenido(contenido.toUpperCase()));
	}	
	
	public List<Documento> getDocumentosPorContenidoCantPalabras(int cantPalabras) {
		System.out.println("\n Cantidad de Palabra del contenido = " + cantPalabras + "\n");
		return documentos.buscar(new CriterioPorContenidoCantPalabras(cantPalabras));
	}
	
	public void addDocumento (Documento d) {
		documentos.addDocumento(d);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public List<Documento> getDocumentos(){
		return documentos.getDocumentos();
	}
	
}
