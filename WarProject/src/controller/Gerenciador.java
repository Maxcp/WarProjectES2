/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import model.*;

public class Gerenciador {

    Jogador jogadores[];
    Objetivo objetivos[];
    Territorio territorios[];
    Continente continentes[];
    List<CartasTerritorio> cartasDisponiveis = new ArrayList();
    
    Jogador jogador1;
    Jogador jogador2;
    Jogador jogador3;
    Jogador jogador4;

    private static Gerenciador instancia;

    private Gerenciador() {
        inicializaTerritorios();
        inicializaContinentes();
        inicializaCartasTerritorios();
        inicializaJogadores();
    }

    private void inicializaJogadores() {
        
        List<Territorio> territorios1 = new ArrayList(), territorios2 = new ArrayList(), territorios3 = new ArrayList(), territorios4 = new ArrayList();
        Objetivo objetivo1 = new Objetivo(null), objetivo2 = new Objetivo(null), objetivo3 = new Objetivo(null), objetivo4 = new Objetivo(null);
        
        Territorio.distribuiTerritorio(territorios, territorios1, territorios2, territorios3, territorios4);
        Objetivo.geraQuatroObjetivos(objetivo1, objetivo2, objetivo3, objetivo4);

        String nome1="Jogador 1", nome2="Jogador 2", nome3="Jogador 3", nome4="Jogador 4"; 
        int cor1=DadosJogo.legiaoVermelha, cor2=DadosJogo.legiaoVerde, cor3=DadosJogo.legiaoAzul, cor4=DadosJogo.legiaoPreta;
        
        jogador1 = new Jogador(nome1, cor1, objetivo1, territorios1);
        jogador2 = new Jogador(nome2, cor2, objetivo2, territorios2);
        jogador3 = new Jogador(nome3, cor3, objetivo3, territorios3);
        jogador4 = new Jogador(nome4, cor4, objetivo4, territorios4);
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




}
