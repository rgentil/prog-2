package comparadores;

import java.util.Comparator;

import Empresa.Empleado;

public class ComparadorNombre implements Comparator<Empleado> {
    @Override
    public int compare(Empleado o1, Empleado o2) {
        return o1.getNombre().compareTo(o2.getNombre());
    }
}
