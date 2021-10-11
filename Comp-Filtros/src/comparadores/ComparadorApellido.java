package comparadores;

public class ComparadorApellido extends ComparadorPersona {

    public ComparadorApellido() {
    }

    public ComparadorApellido(ComparadorPersona siguiente) {
        super(siguiente);
    }

    @Override
    public int comparar(Persona per1, Persona per2){
        return per1.getApellido().compareTo(per2.getApellido());
    }

}
