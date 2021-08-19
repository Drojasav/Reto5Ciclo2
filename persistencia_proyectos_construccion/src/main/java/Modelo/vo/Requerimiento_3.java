package Modelo.vo;

public class Requerimiento_3 {

    private String Proveedor;
    private String Pagado;
    private String Constructora;
    public static final String[] headers = { "PROVEEDOR", "PAGADO", "CONSTRUCTORA" };
    public static final String consulta = "<html>La gerencia desea conocer las compras No pagadas al proveedor jumbo especificando que constructora <br>"
            + "está  relacionada,  para  un  posterior  análisis  del  capital disponible  para  invertir  en  las  nuevas <br>"
            + "expansiones, usando Inner Join cruzar las tablas de compra y proyecto pata entregar el informe a la <br>"
            + "gerencia </html>";

    // constructor
    public Requerimiento_3() {
    }

    public Requerimiento_3(String proveedor, String pagado, String constructora) {
        Proveedor = proveedor;
        Pagado = pagado;
        Constructora = constructora;
    }

    // get-set
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
