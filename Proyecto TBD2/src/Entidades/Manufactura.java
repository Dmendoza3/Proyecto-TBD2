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
    private String marca;
    private int carton;
    private int embalaje;

    public Manufactura(int idManufactura, int idFabricante, String marca, int carton, int embalaje) {
        this.idManufactura = idManufactura;
        this.idFabricante = idFabricante;
        this.marca = marca;
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

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
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
        return "Manufactura/idManufactura,idFabricante,marca,carton,embalaje/" 
                + idManufactura + "/" + idFabricante + "/" + marca + "/" + carton + "/" + embalaje;
    }
}
