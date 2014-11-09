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
public class CartasTerritorio {
    
    private static final String formasGeometricasPossiveis[] = {
     "Quadrado", //0
     "Triangulo", //1
     "Circulo" //2
    };
        
    Territorio territorio;
    int formaGeometrica;

    public CartasTerritorio(Territorio territorio, int formaGeometrica) {
        this.territorio = territorio;
        this.formaGeometrica = formaGeometrica;
    }

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
    
    public String getNomeFormaGeometrica() {
        return formasGeometricasPossiveis[formaGeometrica];
    }

}
