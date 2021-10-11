
public class Electrodomestico {
	
	//Atributos son nombre, precio base, color, consumo energético y peso.
	
	private String nombre;
	private double precioBase;
	private String color;
	private double consumoEnergetico;
	private double peso;
	
	/*
	Valores por defecto:
		● El color por defecto es gris plata.
		● El consumo energético 10 Kw.
		● Precio base 100 pesos.
		● El peso es 2 kg.
	Implementar todos los constructores.
	*/
	
	public Electrodomestico() {
		this.color = "Gris Plata";
		this.consumoEnergetico = 10;
		this.precioBase = 100;
		this.peso = 2;
	}
	
	public Electrodomestico(String nombre, double precioBase) {
		this();
		this.nombre = nombre;
		this.precioBase = precioBase;
	}

	/*
	La funcionalidad de la clase es la siguiente:
		● Todos los métodos get y set.
		● Comprobar si el electrodoméstico es de bajo consumo (menor que 45 Kw)
		● Calcular el balance, el mismo es el resultado de dividir el costo por el peso
		● Indicar si un producto es de alta gama, el balance es mayor que 3  
	*/
	
	public boolean isBajoConsumo () {
		return this.getConsumoEnergetico() < 45;
	}
	
	public double calcularBalance() {
		return this.getPrecioBase() / this.getPeso();		
	}
	
	public boolean isAltaGama() {
		return this.calcularBalance() > 3;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public void setConsumoEnergetico(double consumoEnergetico) {
		this.consumoEnergetico = consumoEnergetico;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

}
