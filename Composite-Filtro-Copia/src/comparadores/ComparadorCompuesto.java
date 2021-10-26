package comparadores;

import java.util.Comparator;

import Empresa.Empleado;

public class ComparadorCompuesto implements Comparator<Empleado>{
    private Comparator<Empleado> c1;
    private Comparator<Empleado> c2;

    public ComparadorCompuesto(Comparator<Empleado> c1, Comparator<Empleado> c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public int compare(Empleado o1, Empleado o2) {
        int res = c1.compare(o1,o2);
        if (res == 0 && c2!=null)
            return c2.compare(o1,o2);
        return res;
    }
}
