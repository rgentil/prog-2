package comparadores;

import java.util.Comparator;

public class ComparadorApellidoNombreV1 implements Comparator<Persona> {
    @Override
    public int compare(Persona per1, Persona per2) {
        int aux = per1.getApellido().compareTo(per2.getApellido());
        if (aux == 0)
            return per1.getNombre().compareTo(per2.getNombre());
        return aux;
    }
}
