package filtros;

import Empleado;

public class FiltroAnd extends Filtro{
    private Filtro f1;
    private Filtro f2;

    public FiltroAnd(Filtro f1, Filtro f2) {
        this.f1 = f1;
        this.f2 = f2;
    }

    @Override
    public boolean cumple(Empleado e) {
        return f1.cumple(e) && f2.cumple(e);
    }
}
