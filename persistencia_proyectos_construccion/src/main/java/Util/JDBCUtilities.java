package Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUtilities {

    private static final String DATABASE_LOCATION = "D:\\INFO DIEGO\\Desktop\\persistencia_proyectos_construccion\\ProyectosConstruccion.db";

    // dejar solo el archivo .db para imaster
    public static Connection getConnection() throws SQLException {
        String url = "jdbc:sqlite:" + DATABASE_LOCATION;

        return DriverManager.getConnection(url);
    }
}
