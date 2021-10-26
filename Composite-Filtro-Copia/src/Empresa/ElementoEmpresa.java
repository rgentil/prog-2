package Empresa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import filtros.Filtro;

public abstract class ElementoEmpresa {

    public abstract int cantEmpleados();
    public abstract double gastoSueldos();
    public abstract ArrayList<Empleado> empleadosCon(Filtro condicion);

    public abstract ElementoEmpresa copia();
    public abstract ElementoEmpresa copia(Filtro condicion);

    public ArrayList<Empleado> empleadosCon(Filtro fi, Comparator<Empleado> c) {
        ArrayList<Empleado> temp = this.empleadosCon(fi);
        Collections.sort(temp, c);
        return temp;
    }


}
