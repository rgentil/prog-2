package figuras;

public class Triangulo extends Figura {

	private double base;
	private double altura;
	
	public Triangulo(double b, double alt) {
		super("Triangulo");
		base = b;
		altura = alt;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	
	public double getArea() {
		return base*altura/2;
	}
	
	public double getPerimetro() {
		return base+altura+Math.sqrt(altura*altura+base*base);
	}
	
	
}
