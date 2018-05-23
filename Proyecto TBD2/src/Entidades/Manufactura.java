/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Dario
 */
public class Manufactura {
    private int idManufactura;
    private int idFabricante;
    private int carton;
    private int embalaje;

    public Manufactura(int idFabricante, int carton, int embalaje) {
        this.idManufactura = -1;
        this.idFabricante = idFabricante;
        this.carton = carton;
        this.embalaje = embalaje;
    }
    
    public Manufactura(int idManufactura, int idFabricante, int carton, int embalaje) {
        this.idManufactura = idManufactura;
        this.idFabricante = idFabricante;
        this.carton = carton;
        this.embalaje = embalaje;
    }

    public int getIdManufactura() {
        return idManufactura;
    }

    public void setIdManufactura(int idManufactura) {
        this.idManufactura = idManufactura;
    }

    public int getIdFabricante() {
        return idFabricante;
    }

    public void setIdFabricante(int idFabricante) {
        this.idFabricante = idFabricante;
    }

    public int getCarton() {
        return carton;
    }

    public void setCarton(int carton) {
        this.carton = carton;
    }

    public int getEmbalaje() {
        return embalaje;
    }

    public void setEmbalaje(int embalaje) {
        this.embalaje = embalaje;
    }

    @Override
    public String toString() {
        if(idManufactura != -1)
            return "Manufactura/idManufactura,idFabricante,carton,embalaje/"  + idManufactura + "/" + 
                + carton + "/" + embalaje + "/" + idFabricante;
        
            
        return "Manufactura/carton,embalaje,idFabricante/" 
                + carton + "/" + embalaje + "/" + idFabricante;
    }
}
