package Estadisticas;

public class MainVocabulario {

	public static void main(String[] args) {
		Vocabulario voc = new Vocabulario("Se desean llevar las estadísticas y desean llevar y se desean llevar las erre");
		 
		System.out.println("\nLista de Palabras  = " + voc.getPalabras());
		
		System.out.println("\nCantidad de Palabras Diferentes  = " + voc.getCantPalabrasDiferentes());		 

		// 2. Retornar las N palabras más frecuentes.
		System.out.println("\nRetornar las 2 palabras más frecuentes  = " + voc.getMasFrecuentes(2));
		 
		// 3. Retornar las N palabras menos frecuentes.
		System.out.println("\nRetornar las 2 palabras menos frecuentes  = " + voc.getMenosFrecuentes(2));
		 
		// 4. Obtener la frecuencia de ocurrencia de una palabra.
		System.out.println("\nRetornar las cant de ocurrencia de 'SE' = " + voc.getFrecuenciaOcurrencia(new Palabra("se")));
		
		// 5. Obtener un listado de palabras ordenadas ascendentemente.
		System.out.println("\nPalabras ordenadas Asc = " + voc.getPalabrasOrdenadasAsc());
		
		//6. Obtener un listado de palabras ordenadas por frecuencia.
		System.out.println("\nPalabras ordenadas por frecuencia = " + voc.getPalabrasOrdenadasPorFrecuencia());
		
		 
	}

}
