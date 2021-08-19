package Modelo.vo;

public class Requerimiento_2 {

    private Integer ID_Proyecto;
    private String Nombre;
    private String Primer_Apellido;
    private String Ciudad_Residencia;
    private String Cargo;
    private Integer Salario;
    public static final String[] headers = { "NOMBRE", "PRIMER APELLIDO", "CIUDAD RESIDENCIA", "CARGO", "SALARIO" };
    public static final String consulta = "<html>La gerencia necesita conocer el cargo y el salario de los líderes, para así poder realizar propuestas que <br>"
            + "les permita ampliar el pool de empleados para esta nueva proyección, para esto se requiere listar los <br>"
            + "lideres con nombre y primer apellido con cargo de asesor o coordinador, ciudad de residencia y con <br>"
            + "un salario menor e igual a 310000. </html>";

    // constructores
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

    // get-set
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

    public Integer getSalario() {
        return Salario;
    }

    public void setSalario(Integer salario) {
        Salario = salario;
    }

    public Object[] Data() {
        Object Data[] = { Nombre, Primer_Apellido, Ciudad_Residencia, Cargo, Salario };
        return Data;
    }
}
