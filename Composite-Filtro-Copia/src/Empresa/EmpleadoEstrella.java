package Empresa;

import filtros.Filtro;

import java.util.ArrayList;

public class EmpleadoEstrella extends Empleado {

    public EmpleadoEstrella(String nombre, String apellido, String especialidad, double sueldo) {
        super(nombre, apellido, especialidad, sueldo);
    }

    @Override
    public ArrayList<Empleado> empleadosCon(Filtro f1) {
        ArrayList<Empleado> empleados = new ArrayList<>();
        empleados.add(this);
        return empleados;
    }

    @Override
    public ElementoEmpresa copia(){
        return new EmpleadoEstrella(this.getNombre(),
                this.getApellido(),
                this.getEspecialidad(), this.getSueldo());
    }
}
