import java.util.List;

public class CentroComputos{
	
	/*
	2. Centro de Cómputos
	
	Un centro de cómputos se encarga de ejecutar procesos utilizando algunas de las computadoras que dispone. 
	Si no hay computadoras disponibles los procesos a ejecutar deben
	esperar en una cola de espera que los ordena teniendo en cuenta sus requerimientos de
	memoria (los procesos con mayor requerimiento de memoria serán atendidos en primer
	lugar). 
	Las computadoras disponibles para ejecutar procesos se ordenan en una cola que
	prioriza la selección de las computadoras más rápidas.
	*/
	
	private ColaElementos computadoras;
	private ColaElementos procesos;
	
	private String nombre;
	
	public CentroComputos(String nombre) {
		this.setNombre(nombre);
		this.computadoras = new ColaElementos();
		this.procesos = new ColaElementos();
	}
	
	public List<Elemento> getComutadoras() {
		return computadoras.getElementos();
	}
	
	public void agregarComputadora(Computadora c) {
		if (procesos.tieneElementos()) {
			Proceso p = (Proceso)procesos.getPrimero();
			c.procesar(p);
		}else {
			computadoras.agregar(c);	
		}
		
	}
	
	public void agregarProceso(Proceso c) {
		procesos.agregar(c);
	}
	
	public void procesar() {
		while (computadoras.tieneElementos()) {
			while (procesos.tieneElementos()) {
				Computadora c = (Computadora)computadoras.getPrimero();
				Proceso p = (Proceso)procesos.getPrimero();
				c.procesar(p);
			}
		}	
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	
	
}