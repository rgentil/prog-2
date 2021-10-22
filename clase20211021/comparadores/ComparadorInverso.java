package comparadores;

import Empleado;

import java.util.Comparator;

public class ComparadorInverso implements Comparator<Empleado> {
    private Comparator<Empleado> directo;

    public ComparadorInverso(Comparator<Empleado> directo) {
        this.directo = directo;
    }

    @Override
    public int compare(Empleado o1, Empleado o2) {
        return -directo.compare(o1,o2);
        // Alternativa return directo.compare(o2,o1);

    }
}
