package Documentador;

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
public class MainDocumentador {

	public static void main(String[] args) {
		Historiador h1 = new Historiador("Juan el Historiador");
		
		Documento d1 = new Documento("d1","Las cosas que van haciendo");
		d1.addAutor("Pepe");
		d1.addAutor("Juan Gomez");
		d1.addPalabrasClave("las");
		d1.addPalabrasClave("van");
		
		Documento d2 = new Documento("Al cerro 1","Caminata al cerro");
		d2.addAutor("Caminante");
		
		Documento d3 = new Documento("d3","Al paso Glosario");
		d3.addAutor("Gloton");
		d3.addAutor("Juan Gomez");
		d3.addPalabrasClave("Glosario");
		
		Documento d4 = new Documento("d4","Prefasio");
		d4.addAutor("Prefasiador");
		d4.addAutor("Pres");
		d4.addAutor("Ramiro");
		d4.addAutor("Pepe");
		d4.addPalabrasClave("pepe");
		d4.addPalabrasClave("pre");	
		
		Documento d5 = new Documento("Al cerro 2","Al cerro segunda parte");
		d5.addAutor("Prefasiador");
		d5.addAutor("Pres");
		d5.addAutor("Caminante");
		d5.addAutor("Ramiro");
		d5.addAutor("Pepe");
		d5.addPalabrasClave("d5");
		d5.addPalabrasClave("pepe");	
		
		Documento d6 = new Documento("Al cerro 3","Caminata al cerro tercer parte edita");
		d6.addAutor("Caminante");
		
		h1.addDocumento(d1);
		h1.addDocumento(d2);
		h1.addDocumento(d3);
		h1.addDocumento(d4);
		h1.addDocumento(d5);
		h1.addDocumento(d6);
		
		System.out.println("\nTodos los documentos. \n" + h1.getDocumentos());
		
		System.out.println("\nTodos los documentos cuyo título sea exactamente igual a un título dado. \n" + h1.getDocumentosPorTitulo("d3"));
		System.out.println("\nTodos los documentos cuyo título contenga una palabra o frase dada. \n" + h1.getDocumentosPorTituloContiene("al cerro"));
		System.out.println("\nTodos los documentos que contengan una palabra clave dada. \n" + h1.getDocumentosPorPalabraClave("pepe"));
		System.out.println("\nTodos los documentos que no contengan ninguna palabra clave. \n" + h1.getDocumentosSinPalabraClave());
		System.out.println("\nTodos los documentos de un autor determinado. \n" + h1.getDocumentosPorAutor("Caminante"));
		System.out.println("\nTodos los documentos cuyo contenido tenga una palabra o frase dada. \n" + h1.getDocumentosPorContenido("Al cerro"));
		System.out.println("\nTodos los documentos cuyo contenido tenga al menos 20 palabras. \n" + h1.getDocumentosPorContenidoCantPalabras(3));
		
		System.out.println("\nCualquier combinación lógica de las formas anteriores. \n" + 
		h1.getDocumentosPorAutorPorContenidoCantPalabras("Caminante", 4));
		
	}

}
