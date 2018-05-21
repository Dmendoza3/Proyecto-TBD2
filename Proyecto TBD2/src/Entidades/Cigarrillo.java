package Entidades;

/**
 *
 * @author Dario
 */
public class Cigarrillo {
    private int idCigarrillo;
    private int idMarca;
    private int contaminante;
    private boolean filtro;
    private boolean mentolado;
    private boolean hoja;

    public Cigarrillo(int idCigarrillo, int idMarca, int contaminante, boolean filtro, boolean mentolado, boolean hoja) {
        this.idCigarrillo = idCigarrillo;
        this.idMarca = idMarca;
        this.contaminante = contaminante;
        this.filtro = filtro;
        this.mentolado = mentolado;
        this.hoja = hoja;
    }

    public int getIdCigarrillo() {
        return idCigarrillo;
    }

    public void setIdCigarrillo(int idCigarrillo) {
        this.idCigarrillo = idCigarrillo;
    }

    public int getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(int idMarca) {
        this.idMarca = idMarca;
    }

    public int getContaminante() {
        return contaminante;
    }

    public void setContaminante(int contaminante) {
        this.contaminante = contaminante;
    }

    public boolean isFiltro() {
        return filtro;
    }

    public void setFiltro(boolean filtro) {
        this.filtro = filtro;
    }

    public boolean isMentolado() {
        return mentolado;
    }

    public void setMentolado(boolean mentolado) {
        this.mentolado = mentolado;
    }

    public boolean isHoja() {
        return hoja;
    }

    public void setHoja(boolean hoja) {
        this.hoja = hoja;
    }

    @Override
    public String toString() {
        return idCigarrillo + "/" + idMarca + "/" + contaminante + "/" + filtro + "/" + mentolado + "/" + hoja;
    }
}
