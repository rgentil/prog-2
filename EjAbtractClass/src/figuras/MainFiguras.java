package figuras;

public class MainFiguras {

	
	public static void imprimir(Figura  ff) {
		
		System.out.println(ff.getNombre() + " " +
				           ff.getArea() + " " +
				           ff.getPerimetro() );
	}
	
	
	
	public static void main(String[] args) {
		
		
		//Figura f1 = new Figura();
		
		Circulo cc = new Circulo(10);
		
		Figura f1 = new Triangulo(10,20);
		
		imprimir(new Circulo(10));
		
		imprimir(new Rectangulo(10,10));
		
		imprimir(cc);
		imprimir(f1);
		
		Figura f3 = new FiguraFija(10,20);
		
		imprimir(f3);
		
		
		
		Figura ff = new Rectangulo(10,10);
		
		ff.getArea();
		
		
	}

}
