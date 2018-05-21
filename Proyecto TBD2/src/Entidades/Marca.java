package Entidades;

/**
 *
 * @author Dario
 */
public class Marca {
    private int idMarca;
    private int idFabricante;
    private String  nombreM;

    public Marca(int idMarca, int idFabricante, String nombreM) {
        this.idMarca = idMarca;
        this.idFabricante = idFabricante;
        this.nombreM = nombreM;
    }

    public int getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(int idMarca) {
        this.idMarca = idMarca;
    }

    public int getIdFabricante() {
        return idFabricante;
    }

    public void setIdFabricante(int idFabricante) {
        this.idFabricante = idFabricante;
    }

    public String getNombreM() {
        return nombreM;
    }

    public void setNombreM(String nombreM) {
        this.nombreM = nombreM;
    }
}
