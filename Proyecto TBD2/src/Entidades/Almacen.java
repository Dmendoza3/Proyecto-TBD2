package Entidades;

/**
 *
 * @author Dario
 */
public class Almacen {
    private int idAlmacen;
    private int idCigarrillo;
    private int existencia;

    public Almacen(int idAlmacen, int idCigarrillo, int existencia) {
        this.idAlmacen = idAlmacen;
        this.idCigarrillo = idCigarrillo;
        this.existencia = existencia;
    }

    public int getIdAlmacen() {
        return idAlmacen;
    }

    public void setIdAlmacen(int idAlmacen) {
        this.idAlmacen = idAlmacen;
    }

    public int getIdCigarrillo() {
        return idCigarrillo;
    }

    public void setIdCigarrillo(int idCigarrillo) {
        this.idCigarrillo = idCigarrillo;
    }

    public int getExistencia() {
        return existencia;
    }

    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }

    @Override
    public String toString() {
        return "Almacen/idAlmacen,idCigarrillo,existencia/" + idAlmacen + "/" + idCigarrillo + "/" + existencia;
    }
}
