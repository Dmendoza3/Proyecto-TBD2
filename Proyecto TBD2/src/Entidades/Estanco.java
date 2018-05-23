package Entidades;

/**
 *
 * @author Dario
 */
public class Estanco {
    private int numExp;
    private int numFiscal;
    private String nombre;
    private String local;

    public Estanco(int numExp, int numFiscal, String nombre, String local) {
        this.numExp = numExp;
        this.numFiscal = numFiscal;
        this.nombre = nombre;
        this.local = local;
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

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }
    
    @Override
    public String toString() {
        return "Estanco/numExp,numFiscal,nombre,local/" + numFiscal + "/" + numExp + "/" + nombre + "/" + local;
    }
}
