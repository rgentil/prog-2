package main;

import java.time.LocalDate;

import agricola.Agua;
import agricola.Frio;
import agricola.Nitrogeno;
import agricola.Producto;

public class MainAgricola {

	public static void main(String[] args) {
		
		Producto p = new Agua("Pescado",LocalDate.now().plusDays(30),1,"El amanecer", LocalDate.now(), "22222",1);
		
		System.out.println(p.getEtiqueta());
		
		Frio f = new Nitrogeno("T-1000",LocalDate.now().plusDays(30),2,"Futuro",LocalDate.now(),"T1000-1", -10);
		
		System.out.println(f.getEtiqueta());
		
		p = f;
		
		System.out.println(p.getEtiqueta());
		
	}
}
