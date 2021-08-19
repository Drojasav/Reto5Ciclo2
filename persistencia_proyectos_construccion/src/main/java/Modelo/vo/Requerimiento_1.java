package Modelo.vo;

public class Requerimiento_1 {

    private Integer ID_Proyecto;
    private String Ciudad;
    private String Banco_Vinculado;
    private String Constructora;
    public static final String[] headers = { "ID PROYECTO", "CIUDAD", "BANCO VINCULADO", "CONSTRUCTORA" };
    public static final String consulta = "<html>Basados en el desarrollo urbano de las ciudades capitales la gerencia requiere un análisis sobre los<br>proyectos realizados en la ciudad de Bogotá, donde se pueda visualizar el Id del proyecto, la ciudad, <br>banco vinculado y la constructora creadora del proyecto. </html>";

    // Constructores
    public Requerimiento_1() {
    }

    public Requerimiento_1(Integer ID_Proyecto, String Ciudad) {
        this.ID_Proyecto = ID_Proyecto;
        this.Ciudad = Ciudad;
    }

    // get-set
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
