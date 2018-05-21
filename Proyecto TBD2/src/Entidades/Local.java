package Entidades;

/**
 *
 * @author Dario
 */
public class Local {
    private int numLocalidad;
    private int numFiscal;
    private String nombre;

    public Local(int numLocalidad, int numFiscal, String nombre) {
        this.numLocalidad = numLocalidad;
        this.numFiscal = numFiscal;
        this.nombre = nombre;
    }

    public int getNumLocalidad() {
        return numLocalidad;
    }

    public void setNumLocalidad(int numLocalidad) {
        this.numLocalidad = numLocalidad;
    }

    public int getNumFiscal() {
        return numFiscal;
    }

    public void setNumFiscal(int numFiscal) {
        this.numFiscal = numFiscal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return numLocalidad + "/" + numFiscal + "/" + nombre;
    }
}
