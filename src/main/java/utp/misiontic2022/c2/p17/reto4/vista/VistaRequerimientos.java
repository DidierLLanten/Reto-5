package utp.misiontic2022.c2.p17.reto4.vista;

import java.util.ArrayList;

import utp.misiontic2022.c2.p17.reto4.controlador.ControladorRequerimientos;

import utp.misiontic2022.c2.p17.reto4.modelo.vo.Requerimiento_1;
import utp.misiontic2022.c2.p17.reto4.modelo.vo.Requerimiento_2;
import utp.misiontic2022.c2.p17.reto4.modelo.vo.Requerimiento_3;

public class VistaRequerimientos {

    public static final ControladorRequerimientos controlador = new ControladorRequerimientos();

    public static void requerimiento1() {
        try {
            // var lideres = controlador.consultarRequerimiento1();
            ArrayList<Requerimiento_1> lideres = controlador.consultarRequerimiento1();
            lideres.forEach(System.out::println);
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public static void requerimiento2() {
        try {
            // var materiales = controlador.consultarRequerimiento2();
            ArrayList<Requerimiento_2> materiales = controlador.consultarRequerimiento2();
            materiales.forEach(System.out::println);
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public static void requerimiento3() {
        try {
            // var proyectos = controlador.consultarRequerimiento3();
            ArrayList<Requerimiento_3> proyectos = controlador.consultarRequerimiento3();
            proyectos.forEach(System.out::println);
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}