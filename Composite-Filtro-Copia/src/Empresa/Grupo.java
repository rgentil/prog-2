package Empresa;

import filtros.Filtro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Grupo extends ElementoEmpresa {
    private String nombre;

    private ArrayList<ElementoEmpresa> elementos;

    public Grupo(String nombre){
        this.nombre = nombre;
        elementos = new ArrayList<>();
    }

    public void add(ElementoEmpresa e){
        if (!elementos.contains(e))
            elementos.add(e);
    }

    public String getNombre() {
        return nombre;
    }

    public int cantEmpleados(){
        int cantTotal = 0;
        for (ElementoEmpresa e:elementos) {
            int cantParcial = e.cantEmpleados();
            cantTotal = cantTotal + cantParcial;
        }
        return cantTotal;
    }

    public double gastoSueldos(){
        double total = 0.0;
        for (ElementoEmpresa e:elementos)
            total += e.gastoSueldos();
        return total;
    }

    @Override
    public ArrayList<Empleado> empleadosCon(Filtro fi) {
        ArrayList<Empleado> empleadosConEspecialidad = new ArrayList<>();
        for (ElementoEmpresa e: elementos) {
            empleadosConEspecialidad.addAll(e.empleadosCon(fi));
            //NO HACER ESTO:
            //if (fi.cumple(e))
            //    empleadosConEspecialidad.add(e);
        }
        return empleadosConEspecialidad;
    }

    @Override
    public ElementoEmpresa copia() {
        Grupo copia = new Grupo(this.getNombre());
        for (ElementoEmpresa e:elementos)
            copia.add(e.copia());
        return copia;
    }

    public boolean tieneElementos(){
        return !elementos.isEmpty();
    }
    @Override
    public ElementoEmpresa copia(Filtro f) {
        Grupo copia = new Grupo(this.getNombre());
        for (ElementoEmpresa e:elementos) {
            ElementoEmpresa copiaHijo = e.copia(f);
            if (copiaHijo!=null)
                copia.add(e.copia(f));
        }
        if (copia.tieneElementos())
            return copia;
        else
            return null;
    }

    @Override
    public boolean equals(Object obj) {
        try {
            Grupo grupo = (Grupo) obj;
            return this.getNombre().equals(grupo.getNombre());
        } catch(Exception e) {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Grupo{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
