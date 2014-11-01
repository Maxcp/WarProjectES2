/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Jogador;
import model.Objetivo;
import model.Territorio;
import model.Continente;
import java.util.List;

public class Gerenciador {

    List<Jogador> jogadores;
    List<Objetivo> objetivos;
    List<Territorio> territorios;
    List<Continente> continentes;

    private static Gerenciador instancia;

    private Gerenciador() {
    }
    
    public static synchronized Gerenciador getInstance(){
        if (instancia == null) {
            instancia = new Gerenciador();
        }
        return instancia;
    }
    
}
