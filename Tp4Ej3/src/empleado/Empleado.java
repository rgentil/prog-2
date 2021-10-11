package empleado;

public class Empleado {

	/*
	 * Una empresa de informática posee tres tipos de empleados.
	 */

	private String nombre;
	private double sueldo;

	public Empleado(String nombre, double sueldo) {
		this.nombre = nombre;
		this.sueldo = sueldo;
	}

	public double sueldoPorSemana() {
		return 0;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

}
