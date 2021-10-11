package figuras;

public abstract class FiguraAreaFija extends Figura {

	private double valor;
	
	public FiguraAreaFija(double area) {
		super("FiguraAreaFija");
		this.valor = area;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public double getArea() {
		return valor;
	}
	
	
}
