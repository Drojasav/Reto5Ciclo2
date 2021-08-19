package Vista;

import java.util.ArrayList;

import Controlador.ElControladorDeRequerimientos;

import Modelo.vo.Requerimiento_1;
import Modelo.vo.Requerimiento_2;
import Modelo.vo.Requerimiento_3;

public class VistaRequerimientos {

    public static final ElControladorDeRequerimientos controlador = new ElControladorDeRequerimientos();

    public static void requerimiento1() {

        try {
            ArrayList<Requerimiento_1> lista1 = controlador.consultarRequerimiento1();
            // cada vo cargado, mostrarlo en la vista
            for (Requerimiento_1 requerimiento : lista1) {
                System.out.printf("%d %s %s %s %n", requerimiento.getID_Proyecto(), requerimiento.getCiudad(),
                        requerimiento.getBanco_Vinculado(), requerimiento.getConstructora());
            }
        } catch (Exception e) {
            System.err.println("Ha ocurrido un error!" + e.getMessage());
        }
    }

    public static void requerimiento2() {

        try {
            ArrayList<Requerimiento_2> lista2 = controlador.consultarRequerimiento2();
            // cada vo cargado, mostrarlo en la vista
            for (Requerimiento_2 requerimiento : lista2) {
                System.out.printf("%s %s %s %s %d %n", requerimiento.getNombre(), requerimiento.getPrimer_Apellido(),
                        requerimiento.getCiudad_Residencia(), requerimiento.getCargo(), requerimiento.getSalario());

            }
        } catch (Exception e) {
            System.err.println("Ha ocurrido un error!" + e.getMessage());
        }
    }

    public static void requerimiento3() {

        try {
            ArrayList<Requerimiento_3> lista3 = controlador.consultarRequerimiento3();
            // cada vo cargado, mostrarlo en la vista
            for (Requerimiento_3 requerimiento : lista3) {
                System.out.printf("%s %s %s  %n", requerimiento.getProveedor(), requerimiento.getPagado(),
                        requerimiento.getConstructora());

            }
        } catch (Exception e) {
            System.err.println("Ha ocurrido un error!" + e.getMessage());
        }
    }
}
