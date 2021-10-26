package filtros;

import Empresa.Empleado;

public class FiltroSueldoMayor extends Filtro{
    private double valorMinimo;

    public FiltroSueldoMayor(double valorMinimo) {
        this.valorMinimo = valorMinimo;
    }

    @Override
    public boolean cumple(Empleado e) {
        return e.getSueldo() > valorMinimo;
    }
}
