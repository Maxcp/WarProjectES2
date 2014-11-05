/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;
import model.*;

public class Gerenciador {

    Jogador jogadores[];
    Objetivo objetivos[];
    Territorio territorios[];
    Continente continentes[];
    List<CartasTerritorio> cartasDisponiveis;

    private static Gerenciador instancia;

    private Gerenciador() {
        inicializaTerritorios();
        inicializaContinentes();
        inicializaCartasTerritorios();
        
        //CRIACAO DE UM OBJETIVO ALEATORIO
        Objetivo objetivo1 = new Objetivo(null);
        System.out.println(objetivo1.getDescricao());
        
        inicializaJogadores();
    }

    public static synchronized Gerenciador getInstance() {
        if (instancia == null) {
            instancia = new Gerenciador();
        }
        return instancia;
    }
    
    private void inicializaTerritorios() {
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
    }

    private void inicializaContinentes() {
        continentes = new Continente[DadosJogo.qtdContinentes];
        for (int i = 0; i < DadosJogo.qtdContinentes; i++) {
            Territorio territoriosDoContinente[] = new Territorio[DadosJogo.territoriosDoContinente[i].length];
            for (int j = 0; j < DadosJogo.territoriosDoContinente[i].length; j++) {
                territoriosDoContinente[j] = territorios[DadosJogo.territoriosDoContinente[i][j]];
            }
            continentes[i] = new Continente(DadosJogo.nomeContinentes[i], territoriosDoContinente);
        }
    }

    private void inicializaCartasTerritorios() {
        int formatoGeometrico = 0; //varia de 0 a 2
        for (int i = 0; i < DadosJogo.qtdTerritorios; i++) {
            CartasTerritorio cartaTerritorio = new CartasTerritorio(territorios[i], formatoGeometrico);
            cartasDisponiveis.add(cartaTerritorio);
            formatoGeometrico += 1;
            if (formatoGeometrico == 3) {
                formatoGeometrico = 0;
            }
        }
    }

    private void inicializaJogadores() {
        
    }

}
