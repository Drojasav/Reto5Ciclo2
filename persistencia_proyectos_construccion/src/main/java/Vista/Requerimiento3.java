package Vista;

import java.sql.SQLDataException;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
//import javax.swing.*;
import javax.swing.JTable;
import java.awt.BorderLayout;
import java.awt.Dimension;

import Controlador.ElControladorDeRequerimientos;
import Modelo.dao.Requerimiento_3Dao;
import Modelo.vo.Requerimiento_3;

public class Requerimiento3 extends JFrame {

    public Requerimiento3() throws SQLException {
        initUI();
    }

    private void initUI() throws SQLException {
        setExtendedState(MAXIMIZED_BOTH);
        setMinimumSize(new Dimension(700, 700));
        setLayout(new BorderLayout());
        String[] nombres = { "Proveedor", "Pagado", "Constructora" };
        JTable tabla = new JTable(mostrar(), nombres);
        JScrollPane panel = new JScrollPane(tabla);
        add(panel, BorderLayout.CENTER);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public String[][] mostrar() throws SQLException {
        ArrayList<Requerimiento_3> lista = new ArrayList<Requerimiento_3>();
        // Requerimiento_3Dao requerimiento_3 = new Requerimiento_3Dao();
        ElControladorDeRequerimientos controlador = new ElControladorDeRequerimientos();
        lista = controlador.consultarRequerimiento3();
        String matris[][] = new String[lista.size()][3];
        for (int i = 0; i < lista.size(); i++) {
            matris[i][0] = String.valueOf(lista.get(i).getProveedor());
            matris[i][1] = lista.get(i).getPagado();
            matris[i][2] = lista.get(i).getConstructora();

        }
        return matris;
    }

}
