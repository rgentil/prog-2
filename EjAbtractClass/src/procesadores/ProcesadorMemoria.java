package procesadores;

public class ProcesadorMemoria extends Procesador {

	@Override
	public boolean esMayor(Tarea t1, Tarea t2) {
		// TODO Auto-generated method stub
		return t1.getMemoria() > t2.getMemoria();
	}



}
