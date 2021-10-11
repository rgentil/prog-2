package figuras;

public class Circulo extends Figura{
	
	private double radio;

	public Circulo(double radio) {
		super("Circulo");
		this.radio = radio;
		
		
		
	}

	public Circulo(double radio,String nombre) {
		super(nombre);
		this.radio = radio;
	}
	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	
	public double getArea() {
		
		return Math.PI * radio*radio ;
	}
	
	public double getPerimetro() {
		return Math.PI*radio*2;
	}
	
	@Override 
	public String getNombre() {
		return "nnnnnn";
	}

}
