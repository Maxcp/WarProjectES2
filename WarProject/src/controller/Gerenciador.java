/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import controller.DadosJogo;
import model.Continente;
import model.Jogador;
import model.Objetivo;
import model.Territorio;

public class Gerenciador {

    Jogador jogadores[];
    Objetivo objetivos[];
    Territorio territorios[];
    Continente continentes[];

    private static Gerenciador instancia;

    private Gerenciador() {
        // INICIANDO PREENCHIMENTO DE TERRITORIOS
        territorios = new Territorio[DadosJogo.qtdTerritorios];
        for (int i = 0; i < DadosJogo.qtdTerritorios; i++) {
            territorios[i] = new Territorio(i, DadosJogo.nomeTerritorios[i], null, null, 0);
        }
        
        for (int i = 0; i < DadosJogo.qtdTerritorios; i++) {
            Territorio vizinhosDoTerritorio[] = new Territorio[DadosJogo.vinzihosDoTerritorio[i].length];
            for (int j = 0; j < DadosJogo.vinzihosDoTerritorio[i].length; j++) {
                vizinhosDoTerritorio[j] = territorios[DadosJogo.vinzihosDoTerritorio[i][j]];
            }
            territorios[i].setVizinhos(vizinhosDoTerritorio);
        }
        
        Objetivo objetivo1 = new Objetivo(null);
        System.out.println(objetivo1.getDescricao());
        // FIM DO PREENCHIMENTO DE TERRITORIOS
        
        //CRIACAO DE UM OBJETIVO ALEATORIO
        
    }
    
    public static synchronized Gerenciador getInstance(){
        if (instancia == null) {
            instancia = new Gerenciador();
        }
        return instancia;
    }
    
}
