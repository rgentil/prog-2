package Empresa;

import java.util.ArrayList;
import java.util.List;

public class Grupo extends ComponenteEmpresa{

	private String nombre;
	private List<ComponenteEmpresa> componentes;
	
	public Grupo(String nombre) {
		this.nombre = nombre;
		componentes = new ArrayList<ComponenteEmpresa>();
	}
	
	public void add(ComponenteEmpresa c) {
		if (!tieneComponente(c)) {
			componentes.add(c);
		}
	}
	
	public boolean tieneComponente(ComponenteEmpresa c) {
		return componentes.contains(c);
	}
	
	//• Determinar la cantidad total de empleados dependientes de la empresa, sucursal, o grupo.
	@Override
	public int cantTotalEmpleados() {
		int resultado = 0;
		for(ComponenteEmpresa c : componentes) {
			resultado += c.cantTotalEmpleados();
		}
		return resultado;
	}
	
	//• Obtener el gasto en sueldos de un empleado, grupo, sucursal o empresa. En el caso de grupos, sucursales
	//o empresas, el gasto en sueldos es la suma de los sueldos de todos los empleados que posee (directa o indirectamente)
	@Override
	public double gastoEnSueldoEmpleados() {
		double resultado = 0;
		for(ComponenteEmpresa c : componentes) {
			resultado += c.gastoEnSueldoEmpleados();
		}
		return resultado;
	}
	
	//• Obtener todos los empleados de una empresa, sucursal o grupo que tienen una determinada especialidad.
	@Override
	public List<ComponenteEmpresa> getEmpleadosPorEspecialidad(String especialidad){
		List<ComponenteEmpresa> resultado = new ArrayList<ComponenteEmpresa>();
		for(ComponenteEmpresa c : componentes) {
			resultado.addAll(c.getEmpleadosPorEspecialidad(especialidad));
		}
		return resultado;
		
	}
	
	@Override
	public boolean equals(Object obj) {
		try {
			Grupo grupo = (Grupo) obj;
			return this.getNombre().equals(grupo.getNombre());
		}catch(Exception e) {
			return false;
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
