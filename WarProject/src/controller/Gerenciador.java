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

    Jogador jogadores[] = new Jogador[4];

    int jogadorDaRodada = 0;
    int faseDaRodada = 0;
    int qtdExercitosParaDistribuirJogadorAtual = 0;

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

    public Territorio[] getTerritorios() {
        return territorios;
    }

    public int getFaseDaRodada() {
        return faseDaRodada;
    }

    public void autalizaFaseDaRodada() {
        faseDaRodada++;
        if (faseDaRodada > 2) {
            faseDaRodada = 0;
            atualizaJogadorDaRodada();
        }
    }

    public void atualizaJogadorDaRodada() {
        jogadorDaRodada++;

        if (jogadorDaRodada > 3) {
            jogadorDaRodada = 0;
        }
        atualizaQtdExercitosParaDistribuirJogadorAtual();
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

        Jogador jogador1 = new Jogador(nome1, cor1, objetivo1, territorios1);
        Jogador jogador2 = new Jogador(nome2, cor2, objetivo2, territorios2);
        Jogador jogador3 = new Jogador(nome3, cor3, objetivo3, territorios3);
        Jogador jogador4 = new Jogador(nome4, cor4, objetivo4, territorios4);

        setDonoTerritorios(jogador1, territorios1);
        setDonoTerritorios(jogador2, territorios2);
        setDonoTerritorios(jogador3, territorios3);
        setDonoTerritorios(jogador4, territorios4);

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
        return jogadores[jogadorDaRodada];
    }

    public void setEditavelApenasTerritoriosDoJogadorAtual(JButton[] btnterritorios) {
        Jogador jogador_atual = pegaJogadorDaRodada();
        for (int i = 0; i < btnterritorios.length; i++) {
            btnterritorios[i].setEnabled(false);
        }
        for (int i = 0; i < jogador_atual.getTerritorios().size(); i++) {
            Territorio t = jogador_atual.getTerritorios().get(i);
            btnterritorios[t.getId()].setEnabled(true);
        }
    }

    public void setEditavelTodosOsTerritorios(JButton[] btnterritorios) {
        for (int i = 0; i < btnterritorios.length; i++) {
            btnterritorios[i].setEnabled(true);
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

    public Territorio[] getTerritoriosAtaqueDefesa(int indiceAtaque, int indiceDefesa) {
        Territorio t[] = new Territorio[2];
        for (Jogador jogador : jogadores) {
            for (int i = 0; i < jogador.getTerritorios().size(); i++) {
                if (jogador.getTerritorios().get(i).getId() == indiceAtaque) {
                    t[0] = jogador.getTerritorios().get(i);
                }
                if (jogador.getTerritorios().get(i).getId() == indiceDefesa) {
                    t[1] = jogador.getTerritorios().get(i);
                }
            }
        }
        return t;
    }

    public int getQtdExercitosParaDistribuirJogadorAtual() {
        return qtdExercitosParaDistribuirJogadorAtual;
    }

    public void atualizaQtdExercitosParaDistribuirJogadorAtual() {
        qtdExercitosParaDistribuirJogadorAtual = pegaJogadorDaRodada().qtdExercitosParaDistribuir();
    }

    public void reduzQtdExercitosParaDistribuirJogadorAtual() {
        qtdExercitosParaDistribuirJogadorAtual--;
    }

    public void aumentaQtdExercitosParaDistribuirJogadorAtual() {
        qtdExercitosParaDistribuirJogadorAtual++;
    }

    public int[] geraDadosDadosOrdenados(int quantidade_exercitos) {
        if(quantidade_exercitos <= 0)
            return null;
        
        int size = quantidade_exercitos <= 3 ? quantidade_exercitos : 3;
        
        int[] dados = {0, 0, 0};
        for(int i = 0; i < size; i++)   dados[i] = ((int) (Math.random() * 5) + 1);
        
        return ordena(dados);
    }

    public int[] ordena(int[] vet) {
        int aux = 0;
        for (int i = 0; i < vet.length; i++) {
            for (int j = 0; j < vet.length - 1; j++) {
                if (vet[j] < vet[j + 1]) {
                    aux = vet[j];
                    vet[j] = vet[j + 1];
                    vet[j + 1] = aux;
                }
            }
        }
        return vet;
    }
    public boolean[] comparaSeAtaqueGanhouNoDado(int[] dados_ataque, int[] dados_defesa) {
        int size;
        
        if((dados_ataque[1] == 0) || (dados_defesa[1] == 0))
            size = 1;
        else if((dados_ataque[2] == 0) || (dados_defesa[2] == 0))
            size = 2;
        else
            size = 3;
        
        boolean[] resultado = new boolean[size];
        for(int i = 0; i < size; i++)
            resultado[i] = dados_ataque[i] > dados_defesa[i];
        
        return resultado;
    }

    private void setDonoTerritorios(Jogador jogador, List<Territorio> territorios) {
        for (Territorio territorio : territorios) {
            territorio.setConquistador(jogador);
        }
    }

    public boolean territorioPossuiExercitosParaMovimentar(int indiceTerritorioDe, int qtdExercitosApassar) {
        return true;//TODO
    }

    public void reduzQtdExercitosDoTerritorio(int indiceTerritorioDe, int qtdExercitosApassar) {
       //TODO
    }

    public void aumentaQtdExercitosDoTerritorio(int indiceTerritorioPara, int qtdExercitosApassar) {
        //TODO
    }

    public void realizaAtaque(int indiceTerritorioAtaque, int indiceTerritorioDefesa) {
        Territorio t[] = getTerritoriosAtaqueDefesa(indiceTerritorioAtaque, indiceTerritorioDefesa);

        Territorio territorio_ataque = t[0];
        Territorio territorio_defesa = t[1];
        int quantidade_exercitos_participantes_ataque = territorio_ataque.getExercitosPosicionados() - 1;
        int quantidade_exercitos_defesa = territorio_defesa.getExercitosPosicionados();

        int[] dados_ataque;
         dados_ataque = geraDadosDadosOrdenados(quantidade_exercitos_participantes_ataque);
        int[] dados_defesa;
        dados_defesa = geraDadosDadosOrdenados(quantidade_exercitos_defesa);

        boolean[] resultado = {};//true quando ataque ganhou

        if ((quantidade_exercitos_defesa >= 1) && quantidade_exercitos_participantes_ataque >= 1) {//ambos possuem pelo menos 1
            if (resultado[0] == true) {//defesa perde um territorio
                territorio_defesa.setExercitosPosicionados(territorio_defesa.getExercitosPosicionados() - 1);
            }
            if (resultado[0] == false) {//defesa perde um territorio
                territorio_ataque.setExercitosPosicionados(territorio_ataque.getExercitosPosicionados() - 1);
            }
        }
        if ((quantidade_exercitos_defesa >= 2) && quantidade_exercitos_participantes_ataque >= 2) {//ambos possuem pelo menos 1
            if (resultado[1] == true) {//defesa perde um territorio
                territorio_defesa.setExercitosPosicionados(territorio_defesa.getExercitosPosicionados() - 1);
            }
            if (resultado[1] == false) {//defesa perde um territorio
                territorio_ataque.setExercitosPosicionados(territorio_ataque.getExercitosPosicionados() - 1);
            }
        }
        if ((quantidade_exercitos_defesa >= 3) && quantidade_exercitos_participantes_ataque >= 3) {//ambos possuem pelo menos 1
            if (resultado[2] == true) {//defesa perde um territorio
                territorio_defesa.setExercitosPosicionados(territorio_defesa.getExercitosPosicionados() - 1);
            }
            if (resultado[2] == false) {//defesa perde um territorio
                territorio_ataque.setExercitosPosicionados(territorio_ataque.getExercitosPosicionados() - 1);
            }
        }

    }
}
