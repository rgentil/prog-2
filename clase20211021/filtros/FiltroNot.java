package filtros;

import Empleado;

public class FiltroNot extends Filtro{
    private Filtro f1;

    public FiltroNot(Filtro positivo) {
        this.f1 = positivo;
    }

    @Override
    public boolean cumple(Empleado e) {
        return !f1.cumple(e);
    }
}
