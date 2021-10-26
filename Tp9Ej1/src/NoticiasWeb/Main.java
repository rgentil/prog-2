package NoticiasWeb;

public class Main {


	public static void main(String[] args) {
		/*
		Generales
		Generales\Espectáculos
		Generales\Espectáculos\Link 1
		Generales\Espectáculos\Divorcios
		Generales\Espectáculos\Divorcios\Link 2
		Generales\Espectáculos\Divorcios\Link 3
		Generales\Deportes
		Generales\Deportes\Fútbol
		Generales\Deportes\Fútbol\Link 4
		Generales\Deportes\Link 5
		Generales\Link 6
		*/
		
		Categoria generales = new Categoria("Generales", "categoria generales", "imagen de categori");
		Categoria espectaculos = new Categoria("Espectaculos", "categoria espectaculos", "imagen de espectaculos");
		Categoria divorcios = new Categoria("Divorcios", "categoria Divorcios", "imagen de Divorcios");
		Categoria deportes = new Categoria("Deportes", "categoria Deportes", "imagen de Deportes");
		Categoria futbol = new Categoria("Fútbol", "categoria Fútbol", "imagen de Fútbol");
		
		Noticia n1 = new Noticia("titulo n1","intro n1","llalala de n1","Juan Perez","link 1");
		Noticia n2 = new Noticia("titulo n2","intro n2","llalala de n2","Solano","link 2");
		Noticia n3 = new Noticia("titulo n3","intro n3","llalala de n3","Seba","link 3");
		Noticia n4 = new Noticia("titulo n4","intro n4","llalala de n4","Laprida","link 4");
		Noticia n5 = new Noticia("titulo n5","intro n5","llalala de n5","Nadie","link 5");
		Noticia n6 = new Noticia("titulo n6","intro n6","llalala de n6","Menos","link 6");
		
		divorcios.addElemento(n2);
		divorcios.addElemento(n3);
		espectaculos.addElemento(n1);
		espectaculos.addElemento(divorcios);
		futbol.addElemento(n4);
		deportes.addElemento(futbol);
		deportes.addElemento(n5);
		generales.addElemento(espectaculos);
		generales.addElemento(deportes);
		generales.addElemento(n6);
		
		System.out.println(generales.listar());
		
		
	}

}
