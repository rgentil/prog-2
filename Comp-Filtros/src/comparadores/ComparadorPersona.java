package comparadores;

import java.util.Comparator;

public abstract class ComparadorPersona implements Comparator<Persona> {
    private ComparadorPersona siguiente;

    public ComparadorPersona() {
        siguiente = null;
    }

    public ComparadorPersona(ComparadorPersona siguiente) {
        this.siguiente = siguiente;
    }

    public abstract int comparar(Persona per1, Persona per2);

    @Override
    public int compare(Persona per1, Persona per2) {
        int res = this.comparar(per1,per2);
        if (res==0){ //&& siguiente != null
            if (siguiente!=null)
                return siguiente.compare(per1, per2);
            else
                return 0;
        }
        return res;
    }
}
