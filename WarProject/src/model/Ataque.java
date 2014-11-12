/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author giseleafreitas
 */
public class Ataque {

    private String mensagemErro;
    private boolean aconteceuErro;

    private int dadosAtaque[] = new int[3];
    private int dadosDefesa[] = new int[3];
    private int indiceAtaque;
    private int indiceDefesa;
    
    private int indiceJogadorAtaque;

    private boolean ataqueConquistou;
    private Color corDoAtacante;
    
    private int qtdTerritorioNovoGanhou;
    private int qtdTerritorioAtaquePerdeu;

    private String qtdExercitosDoAtacanteParaMover;

    public int getQtdTerritorioNovoGanhou(){
        return qtdTerritorioNovoGanhou;
    }
    public int getQtdTerritorioAtaquePerdeu(){
        return qtdTerritorioAtaquePerdeu;
    }
    public String getQtdExercitosDoAtacanteParaMover() {
        return qtdExercitosDoAtacanteParaMover;
    }

    public Color getCorDoAtacante() {
        return corDoAtacante;
    }

    public int[] getDadosAtaque() {
        return dadosAtaque;
    }

    public int[] getDadosDefesa() {
        return dadosDefesa;
    }

    public int getIndiceAtaque() {
        return indiceAtaque;
    }

    public int getIndiceDefesa() {
        return indiceDefesa;
    }

    public boolean ataqueConquistou() {
        return ataqueConquistou;
    }

    public String getMensagemErro() {
        return mensagemErro;
    }

    public int getIndiceJogadorAtaque() {
        return indiceJogadorAtaque;
    }

    public boolean AconteceuErro() {
        return aconteceuErro;
    }

    //SE 1 ataque ganhou, se 0 defesa ganhou se 2 nada acontece
    private int[] comparaSeAtaqueGanhouNoDado() {
        int size_ataque;
        int size_defesa;

        if (dadosAtaque[1] == 0) {
            size_ataque = 1;
        } else if (dadosAtaque[2] == 0) {
            size_ataque = 2;
        } else {
            size_ataque = 3;
        }

        if (dadosDefesa[1] == 0) {
            size_defesa = 1;
        } else if (dadosDefesa[2] == 0) {
            size_defesa = 2;
        } else {
            size_defesa = 3;
        }

        int[] resultado = new int[Math.max(size_defesa, size_ataque)];

        for (int i = resultado.length - 1; i >= 0; i--) {

            if (dadosAtaque[i] > 0 && dadosDefesa[i] > 0) {
                if (dadosAtaque[i] > dadosDefesa[i]) {
                    resultado[i] = 1;
                } else {
                    resultado[i] = 0;
                }
            } else {
                resultado[i] = 2;
            }
        }
        return resultado;
    }

    private void realizaAtaque(Territorio territorio_ataque, Territorio territorio_defesa) {
        int[] resultado = comparaSeAtaqueGanhouNoDado();//true quando ataque ganhou

        for (int i = 0; i < resultado.length; i++) {
            if (resultado[i] == 1) {
                territorio_defesa.reduzExercitos(1);
            } else {
                if (resultado[i] == 0) {
                    territorio_ataque.reduzExercitos(1);
                }
            }
        }
    }

    private int[] geraDadosDadosOrdenados(int quantidade_exercitos) {
        if (quantidade_exercitos <= 0) {
            return null;
        }

        int size = quantidade_exercitos <= 3 ? quantidade_exercitos : 3;

        int[] dados = {0, 0, 0};
        for (int i = 0; i < size; i++) {
            dados[i] = ((int) (Math.random() * 6) + 1);
        }

        return ordenaDecrescente(dados);
    }

    private int[] ordenaDecrescente(int[] vet) {
        int aux;
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

    private Territorio[] getTerritoriosAtaqueDefesa(int indiceAtaque, int indiceDefesa, Jogador[] jogadores) {
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

    private Jogador[] getJogadoresAtaqueDefesa(int indiceAtaque, int indiceDefesa, Jogador[] jogadores) {
        Jogador j[] = new Jogador[2];
        int x = 0;
        for (Jogador jogador : jogadores) {
            for (int i = 0; i < jogador.getTerritorios().size(); i++) {
                if (jogador.getTerritorios().get(i).getId() == indiceAtaque) {
                    j[0] = jogador;
                    indiceJogadorAtaque = x;
                }
                if (jogador.getTerritorios().get(i).getId() == indiceDefesa) {
                    j[1] = jogador;
                }
            }
            x++;
        }
        return j;
    }

    public Ataque(int indiceTerritorioAtaque, int indiceTerritorioDefesa, Jogador[] jogadores) {
        indiceAtaque = indiceTerritorioAtaque;
        indiceDefesa = indiceTerritorioDefesa;

        Territorio t[];
        Jogador j[];

        t = getTerritoriosAtaqueDefesa(indiceTerritorioAtaque, indiceTerritorioDefesa, jogadores);
        j = getJogadoresAtaqueDefesa(indiceTerritorioAtaque, indiceTerritorioDefesa, jogadores);

        Territorio territorioAtaque = t[0];
        Territorio territorioDefesa = t[1];
        if (territorioAtaque.exercitosPosicionados > 1) {
            Jogador jogadorAtaque = j[0];
            Jogador jogadorDefesa = j[1];

            corDoAtacante = jogadorAtaque.getColor();

            int qtdExercitosAtaque = territorioAtaque.exercitosPosicionados - 1;
            int qtdExercitosDefesa = territorioDefesa.exercitosPosicionados;

            dadosAtaque = geraDadosDadosOrdenados(qtdExercitosAtaque);
            dadosDefesa = geraDadosDadosOrdenados(qtdExercitosDefesa);

            realizaAtaque(territorioAtaque, territorioDefesa);

            ataqueConquistou = (territorioDefesa.getExercitosPosicionados() == 0);

            if (ataqueConquistou) {
                jogadorDefesa.removeTerritorio(territorioDefesa);
                territorioDefesa.setConquistador(jogadorAtaque);
                int exercitos = verificaQuantosExercicitosJogadorQuerMover(territorioAtaque, territorioDefesa);
                qtdTerritorioNovoGanhou = exercitos;
                qtdTerritorioAtaquePerdeu = territorioAtaque.getExercitosPosicionados() - exercitos;
                territorioDefesa.setExercitosPosicionados(qtdTerritorioNovoGanhou);
                territorioAtaque.setExercitosPosicionados(qtdTerritorioAtaquePerdeu);
                jogadorAtaque.addTerritorio(territorioDefesa);
            }
        } else {
            aconteceuErro = true;
            mensagemErro = "Você precisa ter mais de um exercito dentro do territorio para realizar um ataque.";
        }
    }

    private int verificaQuantosExercicitosJogadorQuerMover(Territorio territorioAtaque, Territorio territorioDefesa) {
        int totalExercitosParaMovimentar = territorioAtaque.getExercitosPosicionados()-1;
        totalExercitosParaMovimentar = totalExercitosParaMovimentar >= 3 ? 3 : totalExercitosParaMovimentar;
        int item = 1;
        String[] list = new String[totalExercitosParaMovimentar];
        while(totalExercitosParaMovimentar>0){
            list[item-1] = item + "";
            totalExercitosParaMovimentar--;
            item++;
        }
        
        JComboBox jcb = new JComboBox(list);
        jcb.setEditable(true);
        String frase = "Parabens, voce ganhou um territorio!!";
        JOptionPane.showMessageDialog( null, jcb, frase, JOptionPane.QUESTION_MESSAGE);
        String item_cb = jcb.getSelectedItem().toString();
        qtdExercitosDoAtacanteParaMover = item_cb;
        return Integer.parseInt(item_cb);
    }

}
