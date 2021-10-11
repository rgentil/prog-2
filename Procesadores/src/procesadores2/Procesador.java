package procesadores2;

import java.util.ArrayList;

public abstract class Procesador {
                      //EL tipo de elementos que guarda el arrasylist
	protected ArrayList<Tarea>  tareas;

	private Comportamiento compor;
	
	public Procesador() {
	
		tareas = new ArrayList<Tarea>();
		compor = new ComportamientoCPU();
		
	}
	
	
	public void ejecutarPrimera() {
		if (tareas.size()>0) {
			Tarea t1 = tareas.get(0);
			t1.ejecutarTarea();
			tareas.remove(0);
		}
	}
	
	
	
	//METODO TEMPLATE
	public void addTarea(Tarea t1) {

		boolean encontro = false;
		int i =0;
		while(!encontro&&i<tareas.size()) {
	
			if (compor.esMayor(t1,tareas.get(i))) {
				encontro=true;
				tareas.add(i,t1);
			}
			i++;
		}
		
		if(!encontro) {
			tareas.add(t1);
		}
		
		
	}
	
	
	
	public String toString() {
		return "Proc"+tareas.toString();
	}
	
	public void setComportamiento(Comportamiento cc) {
		compor =cc;
		//RE ORDENAR LA LISTA
	}
	
	public Comportamiento getComportamiento() {
		return compor;
		
	}
	
	
}
