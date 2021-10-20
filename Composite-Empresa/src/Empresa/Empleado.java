package Empresa;

import java.util.ArrayList;
import java.util.List;

public class Empleado extends ComponenteEmpresa	{
	private String apellido;
	private String nombre;
	private String especialidad;
	private double sueldo;
	
	public Empleado(String apellido, String nombre, String especialidad, double sueldo) {
		super();
		this.apellido = apellido;
		this.nombre = nombre;
		this.especialidad = especialidad;
		this.sueldo = sueldo;
	}
	
	@Override
	public boolean equals(Object obj) {
		try {
			Empleado e = (Empleado) obj;
			return this.getApellido().equals(e.getApellido()) && this.getNombre().equals(e.getNombre());
		}catch(Exception e) {
			return false;
		}
	}

	@Override
	public int cantTotalEmpleados() {
		return 1;
	}
	
	@Override
	public double gastoEnSueldoEmpleados() {
		return this.getSueldo();
	}
	
	@Override
	public List<ComponenteEmpresa> getEmpleadosPorEspecialidad(String especialidad) {
		List<ComponenteEmpresa> resultado = new ArrayList<ComponenteEmpresa>();
		if (this.especialidad.equals(especialidad)) {
			resultado.add(this);
		}
		return resultado;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

}
