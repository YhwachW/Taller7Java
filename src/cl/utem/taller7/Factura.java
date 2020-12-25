package cl.utem.taller7;

import java.util.Stack;

public class Factura {
    private Integer numero;
    private String rut;
    private Integer fecha;
    private String nombreCliente;
    private Stack<LineaDeDetalle> detalles;
    private Integer subtotal;
    private Integer iva;
    private Integer total;

    public Factura(Integer numero, String rut, Integer fecha, String nombreCliente) {
        this.numero = numero;
        this.rut = rut;
        this.fecha = fecha;
        this.nombreCliente = nombreCliente;

        this.detalles = new Stack<LineaDeDetalle>();

        this.subtotal = 0;
        this.total = 0;
        this.iva = 0;
    }


    public Factura() {
        this.detalles = new Stack<LineaDeDetalle>();
        this.subtotal = 0;
        this.total = 0;
        this.iva = 0;
    }


    public Integer getnumero() {
        return numero;
    }

    public void setnumero(Integer numero) {
        this.numero = numero;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public Integer getFecha() {
        return fecha;
    }

    public void setFecha(Integer fecha) {
        this.fecha = fecha;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public Integer getSubtotal() {
        return subtotal;
    }

    public Integer getIva() {
        return iva;
    }

    public Integer getTotal() {
        return total;
    }

    public void agregaLinea(int cantidad, String descripcion, int precioUnitario) {
        LineaDeDetalle linea = new LineaDeDetalle(cantidad,descripcion,precioUnitario);

        this.detalles.push(linea);  

        this.subtotal = this.subtotal + linea.subtotalLinea();
        this.iva = this.iva + (int) Math.round(linea.subtotalLinea() * 0.19d);
        this.total = this.subtotal + this.iva;
    }

    public void ver(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Factura: ");
        stringBuilder.append(getnumero());
        stringBuilder.append(" - Fecha: ");
        stringBuilder.append(getFecha());
        stringBuilder.append("\n");
        stringBuilder.append("RUT: ");
        stringBuilder.append(getRut());
        stringBuilder.append(" - Nombre: ");
        stringBuilder.append(getNombreCliente());
        stringBuilder.append("\n\n");
        Stack<LineaDeDetalle> aux = this.detalles;
        stringBuilder.append ("Cantidad:\tDescripcion:\tPrecio: \tImporte:\n");
        while (!aux.empty()) {
            LineaDeDetalle detalle = aux.pop();
            stringBuilder.append ("");
            stringBuilder.append (detalle.getCantidad());
            stringBuilder.append ("\t\t\t");
            stringBuilder.append (detalle.getDescripcion());
            stringBuilder.append ("\t\t\t");
            stringBuilder.append (detalle.getPrecioUnitario());
            stringBuilder.append ("\t\t\t");
            stringBuilder.append (detalle.subtotalLinea());
            stringBuilder.append ("\n");

        }
        stringBuilder.append("\nIva: \t");
        stringBuilder.append(getIva());
        stringBuilder.append("\n");
        stringBuilder.append("Subtotal: \t");
        stringBuilder.append(getSubtotal());
        stringBuilder.append("\n");
        stringBuilder.append("Total: \t");
        stringBuilder.append(getTotal());
        stringBuilder.append ("\n\n\n");

        System.out.print(stringBuilder.toString());


    }
}
