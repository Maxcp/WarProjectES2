/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Matheus
 */
class CartasTerritorio {

    public Territorio getTerritorio() {
        return territorio;
    }

    public void setTerritorio(Territorio territorio) {
        this.territorio = territorio;
    }

    public int getFormaGeometrica() {
        return formaGeometrica;
    }

    public void setFormaGeometrica(int formaGeometrica) {
        this.formaGeometrica = formaGeometrica;
    }
    Territorio territorio;
    int formaGeometrica;
}
