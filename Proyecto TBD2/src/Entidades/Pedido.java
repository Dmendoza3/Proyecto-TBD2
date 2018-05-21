package Entidades;

/**
 *
 * @author Dario
 */
public class Pedido {
    private int idPedido;
    private int idAlmacen;
    private int numExp;
    private int cantidad;

    public Pedido(int idPedido, int idAlmacen, int numExp, int cantidad) {
        this.idPedido = idPedido;
        this.idAlmacen = idAlmacen;
        this.numExp = numExp;
        this.cantidad = cantidad;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public int getIdAlmacen() {
        return idAlmacen;
    }

    public void setIdAlmacen(int idAlmacen) {
        this.idAlmacen = idAlmacen;
    }

    public int getNumExp() {
        return numExp;
    }

    public void setNumExp(int numExp) {
        this.numExp = numExp;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return idPedido + "/" + idAlmacen + "/" + numExp + "/" + cantidad;
    }
}
