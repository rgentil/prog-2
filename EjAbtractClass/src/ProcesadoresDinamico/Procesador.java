package ProcesadoresDinamico;

public class Procesador {

	private ColaTarea tareas;
	
	public Procesador() {
		tareas = new ColaTareaLLegada();		
	}
	
	public void ejecutarPrimera() {
		tareas.ejecutarTarea();
	}

	public void addTarea(Tarea t1) {
		tareas.addTarea(t1);
	}
	
	public ColaTarea getTareas() {
		return tareas;
	}

	public void setTareas(ColaTarea tareas) {
		this.tareas = tareas;
	}
	
	public String toString() {
		return "Proc " + tareas.toString();
	}
	
	//Se vuelve a ordenar.
	public void setComportamiento(ColaTarea colaTareaNueva) {
		colaTareaNueva.vaciar();
		while (tareas.getTamanio() > 0) {
			colaTareaNueva.addTarea(tareas.getPrimera());
		}
		tareas = colaTareaNueva;
	}
	
}
