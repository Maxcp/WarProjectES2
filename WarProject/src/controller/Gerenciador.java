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

    Jogador jogadores[];
    Objetivo objetivos[];
    Territorio territorios[];
    Continente continentes[];

    private static Gerenciador instancia;

    private Gerenciador() {
        DadosJogo data = DadosJogo.getInstance();
        for (int i = 0; i < data.nomeTerritorios.length; i++) {
            territorios[i] = new Territorio(i, data.nomeTerritorios[i], null, null, 0);
        }
    }
    
    public static synchronized Gerenciador getInstance(){
        if (instancia == null) {
            instancia = new Gerenciador();
        }
        return instancia;
    }
    
}
