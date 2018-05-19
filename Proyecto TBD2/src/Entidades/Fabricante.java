package Entidades;

/**
 *
 * @author Dario
 */
public class Fabricante {
    private int idFabricante;
    private String nombreF;
    private String pais;

    public Fabricante(int idFabricante, String nombreF, String pais) {
        this.idFabricante = idFabricante;
        this.nombreF = nombreF;
        this.pais = pais;
    }

    public int getIdFabricante() {
        return idFabricante;
    }

    public void setIdFabricante(int idFabricante) {
        this.idFabricante = idFabricante;
    }

    public String getNombreF() {
        return nombreF;
    }

    public void setNombreF(String nombreF) {
        this.nombreF = nombreF;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return idFabricante + "/" + nombreF + "/" + pais;
    }
}