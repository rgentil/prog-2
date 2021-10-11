package farmacia;

import farmacia.criterios.CriterioLaboratorio;
import farmacia.criterios.CriterioNombre;
import farmacia.criterios.CriterioPrecioMenor;

import java.util.ArrayList;

public class Prueba {
    public static void main(String[] args) {
        Medicamento ibu1 = new Medicamento("Ibuprofeno", "Bayer", 100.5);
        Medicamento ibu2 = new Medicamento("Ibuprofeno", "Bagho", 200.0);
        Medicamento tafi = new Medicamento("Tafirol", "Bayer", 150.5);

        Farmacia mutual = new Farmacia();
        mutual.addMedicamento(ibu1);
        mutual.addMedicamento(ibu2);
        mutual.addMedicamento(tafi);

        ArrayList<Medicamento> resultado = new ArrayList<>();
        System.out.println("----------Laboratorio Bayer");
        resultado = mutual.buscar(new CriterioLaboratorio("Bayer"));
        System.out.println(resultado);
        System.out.println("----------Precio menor a 160");
        resultado = mutual.buscar(new CriterioPrecioMenor(160.0));
        System.out.println(resultado);
        System.out.println("----------Nombre Tafirol");
        resultado = mutual.buscar(new CriterioNombre("Tafirol"));
        System.out.println(resultado);
    }
}
