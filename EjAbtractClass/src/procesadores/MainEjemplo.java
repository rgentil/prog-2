package procesadores;

public class MainEjemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Procesador p1 = new ProcesadorLLegada();
		
		Tarea t1 = new Tarea(0, 10, 90, "T1");
		Tarea t2 = new Tarea(4, 1, 8, "T2");
		Tarea t3 = new Tarea(1, 4, 120, "T3");
		Tarea t4 = new Tarea(10, 0, 30, "T4");
		
		p1.addTarea(t1);
		p1.addTarea(t2);
		p1.addTarea(t3);
		p1.addTarea(t4);
		
		System.out.println(p1);
		
		
		Procesador p2 = new ProcesadorCPU();
		
		((ProcesadorCPU)p2).soloParaverCasting();
		
		
		
		
		
	}

}
