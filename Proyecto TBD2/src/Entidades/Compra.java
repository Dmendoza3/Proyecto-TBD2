package Entidades;

/**
 *
 * @author Dario
 */
public class Compra {
    private int numCompra;
    private int idAlmacen;
    private double precioCompra;
    private int cantidad;
    private String fecha;

    public Compra(int numCompra, int idAlmacen, double precioCompra, int cantidad, String fecha) {
        this.numCompra = numCompra;
        this.idAlmacen = idAlmacen;
        this.precioCompra = precioCompra;
        this.cantidad = cantidad;
        this.fecha = fecha;
    }

    public int getNumCompra() {
        return numCompra;
    }

    public void setNumCompra(int numCompra) {
        this.numCompra = numCompra;
    }

    public int getIdAlmacen() {
        return idAlmacen;
    }

    public void setIdAlmacen(int idAlmacen) {
        this.idAlmacen = idAlmacen;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return numCompra + "/" + idAlmacen + "/" + precioCompra + "/" + cantidad + "/" + fecha;
    }
}