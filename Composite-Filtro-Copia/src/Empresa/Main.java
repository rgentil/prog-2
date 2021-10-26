package Empresa;

import java.util.ArrayList;

import filtros.Filtro;
import filtros.FiltroAnd;
import filtros.FiltroEspecialidad;
import filtros.FiltroNot;
import filtros.FiltroSueldoMayor;
public class Main {
    public static void main(String[] args) {
        Empleado juan = new Empleado("Juan", "Perez", "Java", 150000.50);
        Empleado maria = new Empleado("Maria", "Perez", "PHP", 15000.50);
        Empleado leo = new Empleado("Leonardo", "Perez", "Java", 100000.50);
        Empleado pedro = new Empleado("Pedro", "Perez", "Python", 200000.50);
        Empleado luis = new Empleado("Luis", "Perez", "Java", 2000000.50);

        Grupo g1 = new Grupo("backend");
        g1.add(juan);
        g1.add(leo);

        Grupo g2 = new Grupo("Investigacion");
        g2.add(pedro);

        Grupo g3 = new Grupo("frontend");
        g3.add(maria);

        Grupo sucTandil = new Grupo("Sucursal Tandil");
        sucTandil.add(g1);
        sucTandil.add(g2);
        sucTandil.add(luis);

        Grupo sucQuequen = new Grupo("Sucursal Quequen");
        sucQuequen.add(g3);

        Grupo empresa = new Grupo("SofTan");
        empresa.add(sucTandil);
        empresa.add(sucQuequen);
        empresa.add(new Empleado("Ariel", "Monteserin", "Management", 500000));

        System.out.println("La empresa tiene "+empresa.cantEmpleados()+" empleados totales");

        EmpleadoEstrella estrella = new EmpleadoEstrella("Estrella", "Fernandez", "de todo", 9000000);
        sucQuequen.add(estrella);


        //ComparadorSueldo cSueldo = new ComparadorSueldo();
        //ComparadorInverso cSueldoInv = new ComparadorInverso(cSueldo);
        Filtro sabenJava = new FiltroEspecialidad("Java");
        ArrayList<Empleado> empJava = empresa.empleadosCon(sabenJava);
        System.out.println(empJava);

        //ComparadorNombre cNombre = new ComparadorNombre();
        //ComparadorApellido cApellido = new ComparadorApellido();
        //Comparator<Empleado> nomSueldo = new ComparadorCompuesto(cNombre, cSueldoInv);
        //Comparator<Empleado> apellidoNombreSueldo = new ComparadorCompuesto(cApellido,nomSueldo);

        ArrayList<Empleado> empJava2 = empresa.empleadosCon(sabenJava);
        System.out.println(empJava2);

        Filtro sueldoMayor = new FiltroSueldoMayor(200000);
        ArrayList<Empleado> empJava3 = empresa.empleadosCon(sueldoMayor);
        System.out.println(empJava3);

        Filtro sueldoMenor = new FiltroNot(sueldoMayor);
        System.out.println(empresa.empleadosCon(sueldoMenor));

        Filtro fComp = new FiltroAnd(sueldoMayor, sabenJava);
        System.out.println(empresa.empleadosCon(fComp));
    }
}
