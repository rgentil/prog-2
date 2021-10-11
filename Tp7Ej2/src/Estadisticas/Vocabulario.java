package Estadisticas;

import java.util.List;

/*
Se desean llevar las estadísticas del vocabulario de un texto. 
El constructor de esta clase recibe como parámetro un String y crea los objetos necesarios para saber qué palabras
aparecen en el mismo y cuántas veces. 

Se debe permitir:

1. Conocer la cantidad de palabras diferentes que contiene el texto.

2. Retornar las N palabras más frecuentes.

3. Retornar las N palabras menos frecuentes.

4. Obtener la frecuencia de ocurrencia de una palabra.

5. Obtener un listado de palabras ordenadas ascendentemente.

6. Obtener un listado de palabras ordenadas por frecuencia.

Nota: para separar las palabras del string recibido como parámetro del constructor, se puede
utilizar el método “split” de la clase String, que recibe como parámetro una expresión regular
por la que dividir el string y retorna un arreglo con las paradas separadas por dicha expresión

String[] arreloDeStrings = texto.split(" ");
*/
public class Vocabulario {

	private ColaPalabra palabras;
	
	public Vocabulario(String texto) {
		System.out.println("\n Cantidad total de palabras = " + (texto.split(" ")).length + "\n");
		palabras = new ColaPalabra(texto);		
	}
	
	public List<Palabra> getPalabras() {
		return palabras.getPalabras();
	}	
	// 1. Conocer la cantidad de palabras diferentes que contiene el texto.
	public int getCantPalabrasDiferentes() {
		return palabras.getSize();
	}
	
	// 2. Retornar las N palabras más frecuentes.
	public List<Palabra> getMasFrecuentes(int n) {
		return palabras.getMasFrecuentes(n);
	}

	// 3. Retornar las N palabras menos frecuentes.
	public List<Palabra> getMenosFrecuentes(int n) {
		return palabras.getMenosFrecuentes(n);
	}

	// 4. Obtener la frecuencia de ocurrencia de una palabra.
	public int getFrecuenciaOcurrencia(Palabra p) {
		return palabras.getFrecuenciaOcurrencia(p);
	}

	// 5. Obtener un listado de palabras ordenadas ascendentemente.
	public List<Palabra> getPalabrasOrdenadasAsc() {
		return palabras.getPalabrasOrdenadasAsc();
	}

	//6. Obtener un listado de palabras ordenadas por frecuencia.
	public List<Palabra> getPalabrasOrdenadasPorFrecuencia() {
		return palabras.getPalabrasOrdenadasPorFrecuencia();
	}

}
