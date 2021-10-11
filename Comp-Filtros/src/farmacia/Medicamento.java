package farmacia;

import java.util.ArrayList;

public class Medicamento {
    private String nombre;
    private String laboratorio;
    private double precio;
    private ArrayList<String> sintomas;

    public Medicamento(String nombre, String laboratorio, double precio) {
        this.nombre = nombre;
        this.laboratorio = laboratorio;
        this.precio = precio;
        this.sintomas = new ArrayList<>();
    }

    public void addSintoma(String sintoma){
        this.sintomas.add(sintoma);
    }

    public String getNombre() {
        return nombre;
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public double getPrecio() {
        return precio;
    }

    public boolean trataSintoma(String nombre){
        return this.sintomas.contains(nombre);
    }

    @Override
    public String toString() {
        return "Medicamento{" +
                "nombre='" + nombre + '\'' +
                ", laboratorio='" + laboratorio + '\'' +
                ", precio=" + precio +
                '}'+"\n";
    }

    @Override
    public boolean equals(Object o) {
        try {
            Medicamento that = (Medicamento) o;
            return this.getNombre().equals(that.getNombre()) &&
                    this.getLaboratorio().equals(that.getLaboratorio());
        } catch (Exception e){
            return false;
        }
    }


}
