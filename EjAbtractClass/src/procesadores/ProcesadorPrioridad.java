package procesadores;

public class ProcesadorPrioridad extends Procesador {

	@Override
	public boolean esMayor(Tarea t1, Tarea t2) {
		// TODO Auto-generated method stub
		return t1.getPrioridad() > t2.getPrioridad();
	}



}
