package Entidades;

/**
 *
 * @author Dario
 */
public class Estanco {
    private int numExp;
    private int numFiscal;
    private String nombre;

    public Estanco(int numExp, int numFiscal, String nombre) {
        this.numExp = numExp;
        this.numFiscal = numFiscal;
        this.nombre = nombre;
    }

    public int getNumExp() {
        return numExp;
    }

    public void setNumExp(int numExp) {
        this.numExp = numExp;
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
        return numExp + "/" + numFiscal + "/" + nombre;
    }
}
