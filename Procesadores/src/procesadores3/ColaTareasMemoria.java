package procesadores3;

public class ColaTareasMemoria extends ColaTareas {


	public boolean esMayor(Tarea t1, Tarea t2) {
		return t1.getMemoria() > t2.getMemoria();
	}

}
