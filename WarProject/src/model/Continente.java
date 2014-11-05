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
public class Continente {

    String nome;
    Territorio territorios[];
    
    public Continente(String nome,  Territorio[] territorios) {
        this.nome = nome;
        this.territorios = territorios;
    }    

    public Territorio[] getTerritorios() {
        return territorios;
    }

    public void setTerritorios(Territorio[] territorios) {
        this.territorios = territorios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
