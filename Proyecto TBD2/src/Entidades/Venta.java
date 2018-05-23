package Entidades;

/**
 *
 * @author Dario
 */
public class Venta {
    private int numVenta;
    private int numFiscal;
    private int idCigarrillo;
    private double precioVenta;
    private int cantidad;
    private String fecha;

    public Venta(int numFiscal, int idCigarrillo, double precioVenta, int cantidad, String fecha) {
        this.numVenta = -1;
        this.numFiscal = numFiscal;
        this.idCigarrillo = idCigarrillo;
        this.precioVenta = precioVenta;
        this.cantidad = cantidad;
        this.fecha = fecha;
    }
    
    public Venta(int numVenta, int numFiscal, int idCigarrillo, double precioVenta, int cantidad, String fecha) {
        this.numVenta = numVenta;
        this.numFiscal = numFiscal;
        this.idCigarrillo = idCigarrillo;
        this.precioVenta = precioVenta;
        this.cantidad = cantidad;
        this.fecha = fecha;
    }

    public int getNumVenta() {
        return numVenta;
    }

    public void setNumVenta(int numVenta) {
        this.numVenta = numVenta;
    }

    public int getNumFiscal() {
        return numFiscal;
    }

    public void setNumFiscal(int numFiscal) {
        this.numFiscal = numFiscal;
    }

    public int getIdCigarrillo() {
        return idCigarrillo;
    }

    public void setIdCigarrillo(int idCigarrillo) {
        this.idCigarrillo = idCigarrillo;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
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
        if(numVenta != -1)
            return "Ventas/numVenta,numFiscal,idCigarrillo,precioVenta,cantidad,fecha/" + numVenta + "/"
                + numFiscal + "/" + idCigarrillo + "/" + precioVenta + "/" + cantidad + "/" + fecha;
            
        return "Ventas/numVenta,numFiscal,idCigarrillo,precioVenta,cantidad,fecha/" + 
                numFiscal + "/" + idCigarrillo + "/" + precioVenta + "/" + cantidad + "/" + fecha;
    }
}
