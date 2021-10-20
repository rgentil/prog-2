package SistemaArchivo;

public class Comprimido extends Carpeta {
	//Los archivos comprimidos son un tipo particular de archivo el cual contiene otros archivos y/o directorios en formato comprimido según una tasa de compresión dada 
	//(El tamaño de un archivo comprimido es el tamaño de todo lo contenido dividido el factor de compresión), tiene un nombre y una fecha de creación.
	
	private double factorCompresion = 0.5;
	
	public Comprimido(String nombre, double factorCompresion) {
		super(nombre);
		this.factorCompresion = factorCompresion;
	}
	
	@Override
	public double getTamanio() {
		return super.getTamanio() * this.getFactorCompresion();
	}

	public double getFactorCompresion() {
		return factorCompresion;
	}

	public void setFactorCompresion(double factorCompresion) {
		this.factorCompresion = factorCompresion;
	}

	
}
