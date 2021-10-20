package Empresa;

import java.util.ArrayList;
import java.util.List;

public class EmpleadoEstrella extends Empleado{

	public EmpleadoEstrella(String apellido, String nombre, String especialidad, double sueldo) {
		super(apellido, nombre, especialidad, sueldo);
	}

	@Override
	public List<ComponenteEmpresa> getEmpleadosPorEspecialidad(String especialidad) {
		List<ComponenteEmpresa> resultado = new ArrayList<ComponenteEmpresa>();
		resultado.add(this);
		return resultado;
	}
	
	
}
