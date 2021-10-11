package figuras;

public class MedioCirculo extends Circulo {
	
	
	public MedioCirculo(double radio) {
		super(radio,"MedioCirculo");
		this.setNombre("MedioCirculo");
		
	}

	public MedioCirculo(double radio, String nombre) {
		super(radio,nombre);
	}
	//getArea()
	public double getArea() {
		return super.getArea()/2;
	}
	
	public double getPerimetro() {
		return super.getPerimetro()/2+this.getRadio()*2;
	}
	
}
