package cl.utem.taller7;

public class LineaDeDetalle {
    private Integer  cantidad;
    private String descripcion;
    private Integer precioUnitario;


    public LineaDeDetalle(Integer cantidad, String descripcion, Integer precioUnitario) {
        this.cantidad = cantidad;
        this.descripcion = descripcion;
        this.precioUnitario = precioUnitario;
    }

    public LineaDeDetalle() {
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(Integer precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public int subtotalLinea() {
        return ((this.cantidad != null) ? this.cantidad : 0) * ((this.precioUnitario != null) ? this.precioUnitario : 0);
    }
}
