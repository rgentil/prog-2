package farmacia.criterios;

import farmacia.Medicamento;

public class CriterioNombre extends Criterio{
    private String nombre;

    public CriterioNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean cumple(Medicamento m) {
        return m.getNombre().equals(nombre);
    }
}
