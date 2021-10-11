package ProcesadoresDinamico;

import java.util.ArrayList;
import java.util.List;

public abstract class ColaTarea{
	
	private List<Tarea> tareas;
	
	public ColaTarea() {
		tareas = new ArrayList<Tarea>();
	}
	
	public Tarea getPrimera() {
		if (tareas.size() > 0) {
			Tarea t = tareas.get(0);
			tareas.remove(0);
			return t;
		}else {
			return null;
		}
	}
	
	public abstract boolean esMayor(Tarea t1, Tarea t2);
	
	public void addTarea(Tarea t) {
		boolean encontro = false;
		int i =0;
		while(!encontro && i<tareas.size()) {
			if (this.esMayor(t,tareas.get(i))) {
				encontro=true;
				tareas.add(i,t);
			}
			i++;
		}
		if(!encontro) {
			tareas.add(t);
		}
	}
	
	public int getTamanio() {
		if (tareas == null)
			return 0;
		return tareas.size();
	}

	public void ejecutarTarea() {
		Tarea t = getPrimera();
		if (t != null) {
			t.ejecutarTarea();
		}
	}

	public void vaciar() {
		this.tareas = new ArrayList<Tarea>();
	}
	
}