package Entidades;

/**
 *
 * @author Dario
 */
public class Almacen {
    private int idAlmacen;
    private int idCigarrillo;
    private int existencia;
    private int numExp;

    public Almacen(int idCigarrillo, int existencia, int numExp) {
        this.idAlmacen = -1;
        this.idCigarrillo = idCigarrillo;
        this.existencia = existencia;
        this.numExp = numExp;
    }
    
    public Almacen(int idAlmacen, int idCigarrillo, int existencia, int numExp) {
        this.idAlmacen = idAlmacen;
        this.idCigarrillo = idCigarrillo;
        this.existencia = existencia;
        this.numExp = numExp;
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

    public int getNumExp() {
        return numExp;
    }

    public void setNumExp(int numExp) {
        this.numExp = numExp;
    }
    
    @Override
    public String toString() {
        if(idAlmacen != -1)
            return "Almacen/idAlmacen,existencia,idCigarrillo,numExp/" + idAlmacen + "/" +
                    existencia + "/" + idCigarrillo + "/" + numExp;
        
        return "Almacen/existencia,idCigarrillo,numExp/" +
                    existencia + "/" + idCigarrillo + "/" + numExp;
    }
}
