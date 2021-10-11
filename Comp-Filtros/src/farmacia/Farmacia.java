package farmacia;

import farmacia.criterios.Criterio;

import java.util.ArrayList;

public class Farmacia {
    private ArrayList<Medicamento> medicamentos;

    public Farmacia(){
        this.medicamentos = new ArrayList<>();
    }

    public void addMedicamento (Medicamento m){
        if (!medicamentos.contains(m))
            this.medicamentos.add(m);
    }

    public ArrayList<Medicamento> buscar(Criterio criterio){
        ArrayList<Medicamento> losQueCumplen = new ArrayList<Medicamento>();
        for (Medicamento m: medicamentos) //foreach
            if (criterio.cumple(m))
                losQueCumplen.add(m);
        return losQueCumplen;
    }

    /*public ArrayList<Medicamento> buscarPorLaboratorio(String laboratorio){
        ArrayList<Medicamento> losQueCumplen = new ArrayList();
        for (Medicamento m: medicamentos) //foreach
            if (m.getLaboratorio().equals(laboratorio))
                losQueCumplen.add(m);
        return losQueCumplen;
    }

    public ArrayList<Medicamento> buscarPorNombre(String nombre){
        ArrayList<Medicamento> losQueCumplen = new ArrayList();
        for (Medicamento m: medicamentos) //foreach
            if (m.getNombre().equals(nombre))
                losQueCumplen.add(m);
        return losQueCumplen;
    }*/

}
