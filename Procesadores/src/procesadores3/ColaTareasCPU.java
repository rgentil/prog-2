package procesadores3;


public class ColaTareasCPU extends ColaTareas{
	
	public boolean esMayor(Tarea t1, Tarea t2) {
		
		return t1.getCpu() > t2.getCpu();
	}

	
}
