package Empresa;

import java.util.List;

public abstract class ComponenteEmpresa {

	public ComponenteEmpresa() {
		// TODO Auto-generated constructor stub
	}
 
	public abstract int cantTotalEmpleados();

	public abstract double gastoEnSueldoEmpleados();
	
	public abstract List<ComponenteEmpresa> getEmpleadosPorEspecialidad(String especialidad);

}
