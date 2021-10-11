package comparadores;

import java.util.Comparator;

public class ComparadorApellidoNombreV2 implements Comparator<Persona> {
    private ComparadorApellido compAp;
    private ComparadorNombre compNom;

    public ComparadorApellidoNombreV2() {
        this.compAp = new ComparadorApellido();
        this.compNom = new ComparadorNombre();
    }

    @Override
    public int compare(Persona o1, Persona o2) {
        int aux = compAp.compare(o1,o2);
        if (aux == 0)
            return compNom.compare(o1,o2);
        else return aux;
    }
}
