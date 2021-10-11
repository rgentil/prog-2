package farmacia.criterios;

import farmacia.Medicamento;

public class CriterioLaboratorio extends Criterio{
    private String labQueBusco;

    public CriterioLaboratorio(String labQueBusco) {
        this.labQueBusco = labQueBusco;
    }

    @Override
    public boolean cumple(Medicamento m) {
        return m.getLaboratorio().equals(labQueBusco);
    }
}
