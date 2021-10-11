package procesadores3;

import java.util.ArrayList;

public abstract class Procesador {
                      //EL tipo de elementos que guarda el arrasylist
	
    ColaTareas tareas;
    
	
	public Procesador() {
	
		tareas = new ColaTareasCPU();
	
		
	}
	
	
	public void ejecutarPrimera() {
		Tarea t1 = tareas.obtenerPrimera();
		if (t1!=null) {
			t1.ejecutarTarea();
		}	
	}
	
	
	
	//METODO TEMPLATE
	public void addTarea(Tarea t1) {

       tareas.agregarTarea(t1);
	}
	
	
	
	public String toString() {
		return "Proc"+tareas.toString();
	}
	
	public void setComportamiento(ColaTareas nuevaForma) {
		
		nuevaForma.vaciar();
		
		while (tareas.getSize()>0) {
			 nuevaForma.agregarTarea(tareas.obtenerPrimera());
		}
		
		tareas = nuevaForma;
		//RE ORDENAR LA LISTA
	}
	

	
	
}
