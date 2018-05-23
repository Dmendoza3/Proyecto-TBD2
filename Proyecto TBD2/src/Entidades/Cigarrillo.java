package Entidades;

/**
 *
 * @author Dario
 */
public class Cigarrillo {
    private int idCigarrillo;
    private String marca;
    private int contaminante;
    private boolean filtro;
    private boolean mentolado;
    private boolean hoja;

    public Cigarrillo(String marca, int contaminante, boolean filtro, boolean mentolado, boolean hoja) {
        this.idCigarrillo = -1;
        this.marca = marca;
        this.contaminante = contaminante;
        this.filtro = filtro;
        this.mentolado = mentolado;
        this.hoja = hoja;
    }
    
    public Cigarrillo(int idCigarrillo, String marca, int contaminante, boolean filtro, boolean mentolado, boolean hoja) {
        this.idCigarrillo = idCigarrillo;
        this.marca = marca;
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

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
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
        if(idCigarrillo != -1)
            return "Cigarrillo/contaminante,filtro,hoja,marca,mentolado/" + idCigarrillo + "/" +
                contaminante + "/" + ((filtro)?1:0) + "/" + ((hoja)?1:0) + "/" + marca + "/" + ((mentolado)?1:0);
        
        return "Cigarrillo/contaminante,filtro,hoja,marca,mentolado/" + 
                contaminante + "/" + ((filtro)?1:0) + "/" + ((hoja)?1:0) + "/" + marca + "/" + ((mentolado)?1:0);
    }
}
