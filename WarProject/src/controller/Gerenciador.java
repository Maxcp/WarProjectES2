/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import model.*;

public class Gerenciador {

    String[][] parametrosDosJogadores;

    Objetivo objetivos[];
    Territorio territorios[];
    Continente continentes[];
    List<CartasTerritorio> cartasDisponiveis = new ArrayList();

    Jogador jogador1;
    Jogador jogador2;
    Jogador jogador3;
    Jogador jogador4;
    Jogador jogadores[] = new Jogador[4];

    int jogadorDaRodada = 0;
    int faseDaRodada = 0;

    private static Gerenciador instancia;

    public static Gerenciador getInstance(String[][] paramentros) {//Se ta mandando os parametros do usuario significa
        //que eh a primeira vez que o Gerenciador eh chamado, logo, precisa criar a instancia
        instancia = new Gerenciador(paramentros);
        return instancia;
    }

    public static Gerenciador getInstance() {
        if (instancia == null) {
            instancia = new Gerenciador();
        }
        return instancia;
    }

    private Gerenciador() {//Nao possui os parametros, ja foi inicializado anteriormente
        gerenciaJogo();
    }

    private Gerenciador(String[][] parametros) {
        //Parametro com dados do jogador
        parametrosDosJogadores = parametros;
        gerenciaJogo();
    }

    private void gerenciaJogo() {
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

        String nome1 = parametrosDosJogadores[0][1], nome2 = parametrosDosJogadores[1][1], nome3 = parametrosDosJogadores[2][1], nome4 = parametrosDosJogadores[3][1];
        int cor1 = Integer.parseInt(parametrosDosJogadores[0][2]);
        int cor2 = Integer.parseInt(parametrosDosJogadores[1][2]);
        int cor3 = Integer.parseInt(parametrosDosJogadores[2][2]);
        int cor4 = Integer.parseInt(parametrosDosJogadores[3][2]);

        jogador1 = new Jogador(nome1, cor1, objetivo1, territorios1);
        jogador2 = new Jogador(nome2, cor2, objetivo2, territorios2);
        jogador3 = new Jogador(nome3, cor3, objetivo3, territorios3);
        jogador4 = new Jogador(nome4, cor4, objetivo4, territorios4);
        jogadores[0] = jogador1;
        jogadores[1] = jogador2;
        jogadores[2] = jogador3;
        jogadores[3] = jogador4;
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

    public Jogador pegaJogadorDaRodada() {
        switch (jogadorDaRodada) {
            case 0:
                return jogador1;
            case 1:
                return jogador2;
            case 2:
                return jogador3;
            case 3:
                return jogador4;
            default:
                return jogador1;
        }
    }
    public void setEditavelApenasTerritoriosDoJogadorAtual(JButton[] btnterritorios){
        Jogador jogador_atual = pegaJogadorDaRodada();
        for (int i = 0; i < btnterritorios.length; i++) {
            btnterritorios[i].setEnabled(false);
        }
        for (int i = 0; i < jogador_atual.getTerritorios().size(); i++) {
            Territorio t = jogador_atual.getTerritorios().get(i);
            btnterritorios[t.getId()].setEnabled(true);
        }
    }
    public void setTerritoriosJogadores(JButton[] btnterritorios) {
        for (Jogador jogador : jogadores) {
            for (int i = 0; i < jogador.getTerritorios().size(); i++) {
                Territorio t = jogador.getTerritorios().get(i);
                btnterritorios[t.getId()].setText("" + t.getExercitosPosicionados());
                btnterritorios[t.getId()].setBackground(jogador.getColor());
                btnterritorios[t.getId()].setForeground(Color.white);
            }
        }
    }

}
