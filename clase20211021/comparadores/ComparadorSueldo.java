package comparadores;

import Empleado;

import java.util.Comparator;

public class ComparadorSueldo implements Comparator<Empleado> {

    @Override
    public int compare(Empleado o1, Empleado o2) {
        return (int) (o1.gastoSueldos() - o2.gastoSueldos());
    }
}
