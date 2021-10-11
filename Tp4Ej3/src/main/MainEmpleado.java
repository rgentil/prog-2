package main;

import empleado.Contratado;
import empleado.Empleado;
import empleado.PorComision;
import empleado.PorHora;

public class MainEmpleado {

	public static void main(String[] args) {

		Empleado e1 = new Contratado("Juan",500);

		System.out.println(e1.sueldoPorSemana());
		
		PorHora h1 = new PorHora("Pepe",100,8);
		System.out.println(h1.sueldoPorSemana());
		
		PorComision c1 = new PorComision("Pepe",200);
		System.out.println(c1.sueldoPorSemana());
		
	}

}
