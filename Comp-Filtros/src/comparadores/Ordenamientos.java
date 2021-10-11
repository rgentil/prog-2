package comparadores;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Collections;

public class Ordenamientos {

    public static void main(String[] args) {
        Persona ariel = new Persona("Ariel", "Monteserin", LocalDate.of(1981, Month.MAY, 22), 2);
        Persona yago = new Persona("Yago", "Lacoste", LocalDate.of(1995, Month.AUGUST, 30), 0);
        Persona seba = new Persona("Sebastian", "Vallejos", LocalDate.of(1992, 1, 1), 0);
        Persona franco = new Persona("Franco", "Beyugar", LocalDate.of(1997, 5, 23), 7);
        Persona sole = new Persona("Soledad","Merino", LocalDate.of(1997, 5, 24), 1);
        Persona juan = new Persona("Juan","Merino", LocalDate.of(1987, 5, 24), 3);
        Persona juan2 = new Persona("Juan","Merino", LocalDate.of(2000, 5, 24), 3);

        ArrayList<Persona> personas = new ArrayList<>();
        personas.add(ariel);
        personas.add(juan);
        personas.add(juan2);
        personas.add(yago);
        personas.add(seba);
        personas.add(franco);
        personas.add(sole);

        System.out.println("Ordenados por Apellido y nombre");
        Collections.sort(personas, new ComparadorApellidoNombreV2());
        System.out.println(personas);

        ComparadorPersona comp1 = new ComparadorEdad();
        ComparadorPersona comp2 = new ComparadorNombre(comp1);
        ComparadorPersona comp3 = new ComparadorApellido(comp2);
        Collections.sort(personas, comp3);

        ComparadorPersona comp4 = new ComparadorEdad(
                                    new ComparadorApellido(
                                            new ComparadorNombre()
                                    )
                                );

        Collections.sort(personas, comp4);


        /*System.out.println("Ordenados por cant hijos");
        Collections.sort(personas);
        System.out.println(personas);

        System.out.println("Ordenados por apellido");
        ComparadorApellido comp1 = new ComparadorApellido();
        Collections.sort(personas, comp1);
        System.out.println(personas);

        System.out.println("Ordenados por edad");
        Collections.sort(personas, new ComparadorEdad());
        System.out.println(personas);

        /*System.out.println(comp1.compare(yago, seba));
        System.out.println(comp1.compare(ariel, sole));
        System.out.println(comp1.compare(franco, yago));

        ComparadorEdad comp2 = new ComparadorEdad();
        /*System.out.println(comp2.compare(franco, yago));*/
    }
}
