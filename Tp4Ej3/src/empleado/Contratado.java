package empleado;

public class Contratado extends Empleado {
	
	/*
	Los empleados contratados  reciben un salario fijo semanal, sin importar la cantidad de horas trabajadas. 
	*/
	
	private String tipoContrato;

	public Contratado(String nombre, double sueldo, String tipoContrato) {
		super(nombre, sueldo);
		this.tipoContrato = tipoContrato;
	}
	
	public Contratado(String nombre, double sueldo) {
		super(nombre, sueldo);
		this.tipoContrato = "Sangre";
	}

	public double sueldoPorSemana() {
		return super.getSueldo();
	}
	
	public String getTipoContrato() {
		return tipoContrato;
	}

	public void setTipoContrato(String tipoContrato) {
		this.tipoContrato = tipoContrato;
	}
	

}
