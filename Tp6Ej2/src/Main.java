
public class Main {
	
	public static void main(String[] args) {
		/*
		2. Centro de Cómputos
		Un centro de cómputos se encarga de ejecutar procesos utilizando algunas de las
		computadoras que dispone. 
		Si no hay computadoras disponibles los procesos a ejecutar deben
		esperar en una cola de espera que los ordena teniendo en cuenta sus requerimientos de
		memoria (los procesos con mayor requerimiento de memoria serán atendidos en primer
		lugar). 
		Las computadoras disponibles para ejecutar procesos se ordenan en una cola que
		prioriza la selección de las computadoras más rápidas.
		*/
		CentroComputos cc = new CentroComputos("UNICEN");
		
		cc.agregarComputadora(new Computadora("Comp 1", 55));
		cc.agregarComputadora(new Computadora("Comp 2", 26));
		cc.agregarComputadora(new Computadora("Comp 3", 196));
		
		System.out.println(cc.getComutadoras());
		
		
		
	}
}
