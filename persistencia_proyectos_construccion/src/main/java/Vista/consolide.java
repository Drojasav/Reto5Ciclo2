
/*
 * Pueda usar esta plantilla para la carga del reto a iMaster
 * Copie las clases de los paquetes Modelo, Vista, Controlador y Util
 * No incluya los import de los archivos .java solo las clases
 */
// Importaciones necesarias en iMaster
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.ArrayList;

// Util (No modificar)
class JDBCUtilities {
    private static final String DATABASE_LOCATION = "ProyectosConstruccion.db";

    public static Connection getConnection() throws SQLException {
        String url = "jdbc:sqlite:" + DATABASE_LOCATION;

        return DriverManager.getConnection(url);
    }
}

// Remplace en adelante por las clases de sus archivos .java

// Vista
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

// Controlador
public class ElControladorDeRequerimientos {

    private final Requerimiento_1Dao requerimiento_1Dao; // PUEDE IR MAYUS SOSTENIDA
    private final Requerimiento_2Dao requerimiento_2Dao;
    private final Requerimiento_3Dao requerimiento_3Dao;

    public ElControladorDeRequerimientos() {
        this.requerimiento_1Dao = new Requerimiento_1Dao();
        this.requerimiento_2Dao = new Requerimiento_2Dao();
        this.requerimiento_3Dao = new Requerimiento_3Dao();
    }

    // METODOS
    public ArrayList<Requerimiento_1> consultarRequerimiento1() throws SQLException {
        return this.requerimiento_1Dao.requerimiento1();
    }

    public ArrayList<Requerimiento_2> consultarRequerimiento2() throws SQLException {
        return this.requerimiento_2Dao.requerimiento2();
    }

    public ArrayList<Requerimiento_3> consultarRequerimiento3() throws SQLException {
        return this.requerimiento_3Dao.requerimiento3();
    }

}

// Modelo
// VO
public class Requerimiento_1 {

    private Integer ID_Proyecto;
    private String Ciudad;
    private String Banco_Vinculado;
    private String Constructora;

    public Requerimiento_1() {
    }

    public Requerimiento_1(Integer ID_Proyecto, String Ciudad) {
        this.ID_Proyecto = ID_Proyecto;
        this.Ciudad = Ciudad;
    }

    public Integer getID_Proyecto() {
        return ID_Proyecto;
    }

    public void setID_Proyecto(Integer iD_Proyecto) {
        ID_Proyecto = iD_Proyecto;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String ciudad) {
        Ciudad = ciudad;
    }

    public String getBanco_Vinculado() {
        return Banco_Vinculado;
    }

    public void setBanco_Vinculado(String banco_Vinculado) {
        Banco_Vinculado = banco_Vinculado;
    }

    public String getConstructora() {
        return Constructora;
    }

    public void setConstructora(String constructora) {
        Constructora = constructora;
    }

}

public class Requerimiento_2 {

    private Integer ID_Proyecto;
    private String Nombre;
    private String Primer_Apellido;
    private String Ciudad_Residencia;
    private String Cargo;
    private Integer Salario;

    public Requerimiento_2() {
    }

    public Requerimiento_2(Integer iD_Proyecto, String nombre, String primer_Apellido, String ciudad_Residencia,
            String cargo, Integer salario) {
        ID_Proyecto = iD_Proyecto;
        Nombre = nombre;
        Primer_Apellido = primer_Apellido;
        Ciudad_Residencia = ciudad_Residencia;
        Cargo = cargo;
        Salario = salario;
    }

    public Integer getID_Proyecto() {
        return ID_Proyecto;
    }

    public void setID_Proyecto(Integer iD_Proyecto) {
        ID_Proyecto = iD_Proyecto;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getPrimer_Apellido() {
        return Primer_Apellido;
    }

    public void setPrimer_Apellido(String primer_Apellido) {
        Primer_Apellido = primer_Apellido;
    }

    public String getCiudad_Residencia() {
        return Ciudad_Residencia;
    }

    public void setCiudad_Residencia(String ciudad_Residencia) {
        Ciudad_Residencia = ciudad_Residencia;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String cargo) {
        Cargo = cargo;
    }

    public String getSalario() {
        return Salario;
    }

    public void setSalario(Integer salario) {
        Salario = salario;
    }

}

public class Requerimiento_3 {

    private String Proveedor;
    private String Pagado;
    private String Constructora;

    public Requerimiento_3() {
    }

    public Requerimiento_3(String proveedor, String pagado, String constructora) {
        Proveedor = proveedor;
        Pagado = pagado;
        Constructora = constructora;
    }

    public String getProveedor() {
        return Proveedor;
    }

    public void setProveedor(String proveedor) {
        Proveedor = proveedor;
    }

    public String getPagado() {
        return Pagado;
    }

    public void setPagado(String pagado) {
        Pagado = pagado;
    }

    public String getConstructora() {
        return Constructora;
    }

    public void setConstructora(String constructora) {
        Constructora = constructora;
    }

}

// DAO
public class Requerimiento_1Dao {

    // Obtener los 10 proyectos rankeados según las compras
    public ArrayList<Requerimiento_1> requerimiento1() throws SQLException {

        ArrayList<Requerimiento_1> respuesta = new ArrayList<Requerimiento_1>();
        Connection conexion = JDBCUtilities.getConnection();

        try {

            String consulta = "select ID_Proyecto, Ciudad, Banco_Vinculado , Constructora " + "from Proyecto "
                    + "where Ciudad = 'Bogota'; ";

            PreparedStatement statement = conexion.prepareStatement(consulta);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                Requerimiento_1 requerimiento_1 = new Requerimiento_1();
                requerimiento_1.setID_Proyecto(resultSet.getInt("ID_Proyecto"));
                requerimiento_1.setCiudad(resultSet.getString("Ciudad"));
                requerimiento_1.setBanco_Vinculado(resultSet.getString("Banco_Vinculado"));
                requerimiento_1.setConstructora(resultSet.getString("Constructora"));

                respuesta.add(requerimiento_1);
            }
            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            System.err.println("Error consultando: " + e);
        } finally {
            if (conexion != null) {
                conexion.close();
            }
        }
        return respuesta;
    }
}

public class Requerimiento_2Dao {
    // Obtener los 10 proyectos rankeados según las compras
    public ArrayList<Requerimiento_2> requerimiento2() throws SQLException {

        ArrayList<Requerimiento_2> respuesta = new ArrayList<Requerimiento_2>();
        Connection conexion = JDBCUtilities.getConnection();

        try {

            String consulta = "select Nombre, Primer_Apellido , Ciudad_Residencia,Cargo, Salario " + "from Lider "
                    + "where (Cargo ='Asesor' OR Cargo ='Coordinador') " + "AND Salario <=310000; ";

            PreparedStatement statement = conexion.prepareStatement(consulta);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                Requerimiento_2 requerimiento_2 = new Requerimiento_2();
                requerimiento_2.setNombre(resultSet.getString("Nombre"));
                requerimiento_2.setPrimer_Apellido(resultSet.getString("Primer_Apellido"));
                requerimiento_2.setCiudad_Residencia(resultSet.getString("Ciudad_Residencia"));
                requerimiento_2.setCargo(resultSet.getString("Cargo"));
                requerimiento_2.setSalario(resultSet.getInt("salario"));

                respuesta.add(requerimiento_2);
            }
            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            System.err.println("Error consultando: " + e);
        } finally {
            if (conexion != null) {
                conexion.close();
            }
        }
        return respuesta;
    }
}

public class Requerimiento_3Dao {
    // Obtener los 10 proyectos rankeados según las compras
    public ArrayList<Requerimiento_3> requerimiento3() throws SQLException {

        ArrayList<Requerimiento_3> respuesta = new ArrayList<Requerimiento_3>();
        Connection conexion = JDBCUtilities.getConnection();

        try {

            String consulta = "select c.Proveedor, c.Pagado , p.Constructora " + "from compra c "
                    + "inner join Proyecto p " + "on c.ID_Proyecto = p.ID_Proyecto " + "where c.Pagado = 'No'"
                    + "and c.Proveedor = 'JUMBO'; ";

            PreparedStatement statement = conexion.prepareStatement(consulta);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                Requerimiento_3 requerimiento_3 = new Requerimiento_3();
                requerimiento_3.setProveedor(resultSet.getString("Proveedor"));
                requerimiento_3.setPagado(resultSet.getString("Pagado"));
                requerimiento_3.setConstructora(resultSet.getString("Constructora"));

                respuesta.add(requerimiento_3);
            }
            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            System.err.println("Error consultando: " + e);
        } finally {
            if (conexion != null) {
                conexion.close();
            }
        }
        return respuesta;
    }
}