package figuras;

public abstract class Figura {
	
	//Atributo
	private String nombre;
	
	//CONSTRUCTOR
	public Figura(String nombre) {
		super();
		this.nombre= nombre;
	}
	
	//METODO ABSTRACTO NO TIENE CUERPO
	public abstract double getArea() ;
	public abstract double getPerimetro();

    //METODOS CONCRETOS
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	//METODO TEMPLATE ES UN METODO QUE ES CONCRETO
	//ESTA IMPLEMENTADO PERO USA EN SU IMPLEMENTACION
	//METODO ABSTRACTOS DE LA CLASE
	public String toString() {
		
		return nombre +"-" + this.getArea() + "-" + this.getPerimetro();
		
	}
	

}
