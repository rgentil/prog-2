package Princial;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Comparador.ComparadorPersona;
import Comparador.ComparadorPorCantHijos;
import Comparador.ComparadorPorFechaDeNacimiento;
import Comparador.CompararPorNombre;
import Filtros.CriterioCantHijosMayorA;
import Filtros.CriterioPorNombre;
import Persona.Comercio;
import Persona.Persona;

public class MainComparadorComun {

	public static void main(String[] args) {
		List<Persona> personas = new ArrayList<Persona>();
		
		Persona p1 = new Persona("Juan", 4, LocalDate.of(1982, 6, 6));
		Persona p2 = new Persona("Pepe", 0, LocalDate.of(1979, 6, 1));
		Persona p3 = new Persona("Antonio", 1, LocalDate.of(1996, 7, 2));
		Persona p4 = new Persona("Ramiro", 9, LocalDate.of(1982, 6, 6));
		
		personas.add(p1);
		personas.add(p2);
		personas.add(p3);
		personas.add(p4);
		
		Comercio comercio = new Comercio();
		comercio.addPersona(p1);
		comercio.addPersona(p2);
		comercio.addPersona(p3);
		comercio.addPersona(p4);
		
		/*System.out.println(" \n Sin ordenar \n " + personas);
		
		Collections.sort(personas);
		
		System.out.println(" \n Ordenado por defecto, por nombre \n " + personas);
		
		Collections.sort(personas, new ComparadorPorCantHijos());
		
		System.out.println(" \n Ordenado por cantidad de hijos \n " + personas);
		*/
		ComparadorPersona comparador = new CompararPorNombre(
											new ComparadorPorCantHijos(
													new ComparadorPorFechaDeNacimiento()
													)
											);
		
		Collections.sort(personas,comparador);	
		
		System.out.println(" \n Ordenado por nombre, cantidad de hijos y fecha de nacimiento \n " + personas);
		
		comparador = new ComparadorPorFechaDeNacimiento(
				new ComparadorPorCantHijos(
						new CompararPorNombre()
						)
				);

		Collections.sort(personas,comparador);	

		System.out.println(" \n Ordenado por fecha de nacimiento , cantidad de hijos y nombre \n " + personas);
		
		comparador = new ComparadorPorCantHijos(
				new ComparadorPorFechaDeNacimiento(
						new CompararPorNombre()
						)
				);

		Collections.sort(personas,comparador);	

		System.out.println(" \n Ordenado por cantidad de hijos, fecha de nacimiento y nombre \n " + personas);
		
		System.out.println(" \n Filtrar por nombre Juan \n " + comercio.buscar(new CriterioPorNombre("Juan")) );
		
		System.out.println(" \n Filtrar por cantidad de hijos + 1 \n" + comercio.buscar(new CriterioCantHijosMayorA(1)));
		
	}
}
