package empleado;

public class PorHora extends Empleado {

	//Los empleados por horas extras reciben un monto fijo semanal más un monto extra por cada hora trabajada.
	
	public static final double MONTO_EXTRA = 100;
	
	private int horas;

	public PorHora(String nombre, double sueldo, int horas) {
		super(nombre, sueldo);
		this.horas = horas;
	}
	
	public PorHora(String nombre, double sueldo) {
		super(nombre, sueldo);
		this.horas = 0;
	}
	
	public double sueldoPorSemana() {
		return super.getSueldo() + (this.getHoras() * MONTO_EXTRA);
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}
	
	
	
}
