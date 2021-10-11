package figuras;

public class FiguraFija extends FiguraAreaFija {
	
	private double valorPer;
	
	public FiguraFija(double area, double perimetro) {
		super(area);
		valorPer = perimetro;
		this.setNombre("FiguraFija");
	}

	public double getValorPer() {
		return valorPer;
	}

	public void setValorPer(double valorPer) {
		this.valorPer = valorPer;
	}

	
	public double getPerimetro() {
		return valorPer;
	}
	
}
