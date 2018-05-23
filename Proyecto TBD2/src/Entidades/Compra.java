package Entidades;

/**
 *
 * @author Dario
 */
public class Compra {
    private int numCompra;
    private int idCigarrillo;
    private int numFiscal;
    private double precioCompra;
    private int cantidad;
    private String fecha;

    public Compra(int idCigarrillo, int numFiscal, double precioCompra, int cantidad, String fecha) {
        this.numCompra = -1;
        this.idCigarrillo = idCigarrillo;
        this.numFiscal = numFiscal;
        this.precioCompra = precioCompra;
        this.cantidad = cantidad;
        this.fecha = fecha;
    }
    
    public Compra(int numCompra, int idCigarrillo, int numFiscal, double precioCompra, int cantidad, String fecha) {
        this.numCompra = numCompra;
        this.idCigarrillo = idCigarrillo;
        this.numFiscal = numFiscal;
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

    public int getIdCigarrillo() {
        return idCigarrillo;
    }

    public void setIdCigarrillo(int idCigarrillo) {
        this.idCigarrillo = idCigarrillo;
    }

    public int getNumFiscal() {
        return numFiscal;
    }

    public void setNumFiscal(int numFiscal) {
        this.numFiscal = numFiscal;
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
        if(numCompra != -1)
            return "Compra/fecha,precioCompra,cantidad,numFiscal,idAlmacen/" + numCompra + "/" +
                    fecha + "/" + precioCompra + "/" + cantidad + "/" + numFiscal + "/" + idCigarrillo;
        
        return "Compra/fecha,precioCompra,cantidad,numFiscal,idAlmacen/" + 
                    fecha + "/" + precioCompra + "/" + cantidad + "/" + numFiscal + "/" + idCigarrillo;
    }
}
