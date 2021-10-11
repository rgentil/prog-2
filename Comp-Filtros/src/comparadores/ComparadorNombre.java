package comparadores;

public class ComparadorNombre extends ComparadorPersona {

    public ComparadorNombre() {
    }

    public ComparadorNombre(ComparadorPersona siguiente) {
        super(siguiente);
    }

    @Override
    public int comparar(Persona o1, Persona o2) {
        return o1.getNombre().compareTo(o2.getNombre());
    }
}
