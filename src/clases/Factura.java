package clases;

/**
 * @author Aimar Berrocal
 */
public class Factura {

    private String ruc;
    private String empresa;
    private int cantidad;
    private double precioUnitario;
    private double importe;

    public Factura() {
        this.ruc = "12345678911";
        this.empresa = "Backus";
        this.cantidad = 40;
        this.precioUnitario = 100;
        this.importe = this.cantidad * this.precioUnitario;
    }
    
     public Factura(String ruc, String empresa) {
        this.ruc = ruc;
        this.empresa = empresa;
        this.cantidad = 20;
        this.precioUnitario = 150;
        this.importe = this.cantidad * this.precioUnitario;
    }
    
    public Factura(String ruc, String empresa, int cantidad, double precioUnitario) {
        this.ruc = ruc;
        this.empresa = empresa;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.importe = cantidad * precioUnitario;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public double getImporte() {
        return precioUnitario * cantidad;
    }
    
    
}
