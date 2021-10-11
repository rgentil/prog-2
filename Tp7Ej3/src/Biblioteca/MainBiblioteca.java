package Biblioteca;

/*
Una biblioteca posee un sistema para la administración de libros disponibles para sus socios.
El sistema debe permitir ordenar el conjunto de todos los libros disponibles por diferentes
criterios, acorde a lo que desee buscar en un determinado momento. 

Por defecto, los libros se ordenan por ISBN, un código identificatorio único de cada libro. 

Sin embargo, es posible que el administrador de la biblioteca desee ordenarlos
 por autor, 
 año de edición 
 o género principal, 
 
 tanto ascendente como descendentemente. 

Resolver el problema utilizando el método sort(.), de la clase Collections.  
*/
public class MainBiblioteca {
	
	public static void main(String[] arg) {
		
		Biblioteca b1 = new Biblioteca("Manuel Belgrano");
		
		Libro l1 = new Libro("10","Dios",1982,"Policial");
		Libro l2 = new Libro("233","Angelito Di Maria",2001,"Policial");
		Libro l3 = new Libro("34","Messi",2020,"Romance");
		Libro l4 = new Libro("455","Papá",1999,"Drama");
		Libro l5 = new Libro("56666","Hijo",1810,"Social");
		
		b1.addLibro(l1);
		b1.addLibro(l2);
		b1.addLibro(l3);
		b1.addLibro(l4);
		b1.addLibro(l5);
		
		System.out.println("\n Lista de libros = " + b1.getListaLibros());
		System.out.println("\n Lista de ordenada por ISBN Asc = " + b1.getLibrosOrdenadosPorISBN("asc"));
		System.out.println("\n Lista de ordenada por ISBN Desc = " + b1.getLibrosOrdenadosPorISBN("desc"));
		
		System.out.println("\n Lista de ordenada por Autor Asc = " + b1.getLibrosOrdenadosPorAutor("asc"));
		System.out.println("\n Lista de ordenada por Autor Desc = " + b1.getLibrosOrdenadosPorAutor("desc"));
		
		System.out.println("\n Lista de ordenada por Año edición Asc = " + b1.getLibrosOrdenadosPorAnioEdicion("asc"));
		System.out.println("\n Lista de ordenada por Año edición Desc = " + b1.getLibrosOrdenadosPorAnioEdicion("desc"));
		
		System.out.println("\n Lista de ordenada por Genero Principal Asc = " + b1.getLibrosOrdenadosPorGeneroPrincipal("asc"));
		System.out.println("\n Lista de ordenada por Genero Principal Desc = " + b1.getLibrosOrdenadosPorGeneroPrincipal("desc"));
		
		
	} 
	

}
