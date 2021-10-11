package comparadores;

public class ComparadorEdad extends ComparadorPersona {

    public ComparadorEdad() {
    }

    public ComparadorEdad(ComparadorPersona siguiente) {
        super(siguiente);
    }

    @Override
    public int comparar(Persona per1, Persona per2){
        return per1.getEdad() - per2.getEdad();
    }
}
