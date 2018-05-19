package Entidades;

/**
 *
 * @author Dario
 */
public class Venta {
    private int numVenta;
    private int numExp;
    private int idAlmacen;

    public Venta(int numVenta, int numExp, int idAlmacen) {
        this.numVenta = numVenta;
        this.numExp = numExp;
        this.idAlmacen = idAlmacen;
    }

    public int getNumVenta() {
        return numVenta;
    }

    public void setNumVenta(int numVenta) {
        this.numVenta = numVenta;
    }

    public int getNumExp() {
        return numExp;
    }

    public void setNumExp(int numExp) {
        this.numExp = numExp;
    }

    public int getIdAlmacen() {
        return idAlmacen;
    }

    public void setIdAlmacen(int idAlmacen) {
        this.idAlmacen = idAlmacen;
    }

    @Override
    public String toString() {
        return numVenta + "/" + numExp + "/" + idAlmacen;
    }
}
