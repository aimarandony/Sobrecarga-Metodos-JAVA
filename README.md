# Sobrecarga-Metodos-JAVA

## Resultado
![IMG Resultado](http://speedfiles.glitch.me/image/speedfiles-1589470137999-51.png)

## JAR - Ejecutable
<https://github.com/aimarandony/Sobrecarga-Metodos-JAVA/blob/master/dist/SobreCargaMetodos.jar>

***

### Clase Factura | Paquete clases
```
package clases;

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
```

### Clase Librería | Paquete lib
```
package lib;

public class Libreria {
    public static final String TEXTO = "SUNAT";
}

```

### Clase ProcesarFactura | Paquete gui (Botón Procesar Factura)
```
private void btnProcesarActionPerformed(java.awt.event.ActionEvent evt) {                                            
    ArrayList<Factura> facturas = new ArrayList<>();

    Factura factura1 = new Factura();
    Factura factura2 = new Factura("12345678922", "Coca Cola");
    Factura factura3 = new Factura("12345678933", "Gloria", 10 , 120.0);

    facturas.add(factura1);
    facturas.add(factura2);
    facturas.add(factura3);

    double facturaTotal = 0;

    for (Factura factura : facturas) {
        txaResultado.append("Ruc\t: " + factura.getRuc()+ "\n" + 
                            "Empresa\t: " + factura.getEmpresa() + "\n" + 
                            "Cantidad\t: " + factura.getCantidad() + "\n" + 
                            "Precio Unit\t: " + factura.getPrecioUnitario() + "\n" + 
                            "Importe\t: " + factura.getImporte() + "\n\n");
        facturaTotal += factura.getImporte();
    }

    txaResultado.append("===================================");
    txaResultado.append("\n\nCant. Facturas\t: " + facturas.size() +
                        "\nValor de TEXTO\t: " + Libreria.TEXTO + 
                        "\nSuma Factura\t: " + facturaTotal);
}  
```
