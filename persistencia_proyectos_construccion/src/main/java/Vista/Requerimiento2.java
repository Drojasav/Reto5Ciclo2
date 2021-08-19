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
import Modelo.dao.Requerimiento_2Dao;
import Modelo.vo.Requerimiento_2;

public class Requerimiento2 extends JFrame {

    public Requerimiento2() throws SQLException {
        initUI();
    }

    private void initUI() throws SQLException {
        setExtendedState(MAXIMIZED_BOTH);
        setMinimumSize(new Dimension(700, 700));
        setLayout(new BorderLayout());
        String[] nombres = { "Nombre", "Primer_Apellido", "Ciudad_Residencia", "Cargo", "Salario" };
        JTable tabla = new JTable(mostrar(), nombres);
        JScrollPane panel = new JScrollPane(tabla);
        add(panel, BorderLayout.CENTER);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public Object[][] mostrar() throws SQLException {
        ArrayList<Requerimiento_2> lista = new ArrayList<Requerimiento_2>();
        // Requerimiento_2Dao requerimiento_2 = new Requerimiento_2Dao();
        ElControladorDeRequerimientos controlador = new ElControladorDeRequerimientos();
        lista = controlador.consultarRequerimiento2();
        Object matris[][] = new Object[lista.size()][6];
        for (int i = 0; i < lista.size(); i++) {
            matris[i] = lista.get(i).Data();

        }
        return matris;
    }

}
