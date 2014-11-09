/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.DadosJogo;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Matheus
 */
public class Jogador {

    private String nome;
    private int cor;
    private List<Territorio> territorios = new ArrayList();
    private List<CartasTerritorio> cartas = new ArrayList();
    private Objetivo objetivo;
    private int pontuacao;

    public Jogador(String nome, int cor, Objetivo objetivo, List<Territorio> territorios) {
        this.nome = nome;
        this.cor = cor;
        this.territorios = territorios;
        this.objetivo = objetivo;
    }

    public String getNome() {
        return nome;
    }

    public int getCor() {
        return cor;
    }

    public String getNomeCor() {

        switch (cor) {
            case DadosJogo.legiaoVermelha:
                return "Vermelho";
            case DadosJogo.legiaoVerde:
                return "Verde";
            case DadosJogo.legiaoAzul:
                return "Azul";
            case DadosJogo.legiaoPreta:
                return "Preto";
            default:
                return "Vermelho";
        }
    }

    public Color getColor() {
        switch (cor) {
            case DadosJogo.legiaoVermelha:
                return new Color(204, 0, 0);
            case DadosJogo.legiaoVerde:
                return new Color(0, 153, 51);
            case DadosJogo.legiaoAzul:
                return new Color(51, 51, 255);
            case DadosJogo.legiaoPreta:
                return Color.black;
            default:
                return Color.white;
        }
    }

    public List<Territorio> getTerritorios() {
        return territorios;
    }

    public void addTerritorios(List<Territorio> territorios) {
        this.territorios.addAll(territorios);//Adiciona todas as novos territorios para a lista atual
    }

    public void addTerritorio(Territorio territorio) {
        this.territorios.add(territorio);
    }

    public void removeTerritorio(Territorio territorio) {//remove a primeira ocorrencia do territorio
        boolean naoAchou = true;
        Iterator<Territorio> it = territorios.iterator();
        while (it.hasNext() && naoAchou) {
            if (it.next().equals(territorio)) {
                it.remove();
                naoAchou = false;
            }
        }
    }

    public void addCartas(List<CartasTerritorio> cartas) {
        this.cartas.addAll(cartas);//Adiciona todas as novas cartas territorios para a lista atual
    }

    public void addCarta(CartasTerritorio carta) {
        this.cartas.add(carta);
    }

    public void removeCarta(CartasTerritorio carta) {//remove a primeira ocorrencia da carta
        boolean naoAchou = true;
        Iterator<CartasTerritorio> it = cartas.iterator();
        while (it.hasNext() && naoAchou) {
            if (it.next().equals(carta)) {
                it.remove();
                naoAchou = false;
            }
        }
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public Objetivo getObjetivo() {
        return objetivo;
    }

    private int[] continentesDominados() {
        int continenteID = 0;
        List<Integer> listaContinentesDominados = new ArrayList();
        for (int[] territoriosDoContinente : DadosJogo.territoriosDoContinente) {
            
            boolean dominouContinente = true;
            for (int j = 0; j < territoriosDoContinente.length; j++) {
                if(!territoriosPorId().contains(territoriosDoContinente[j])){
                    dominouContinente = false;
                }
            }
            if (dominouContinente){
                listaContinentesDominados.add(continenteID);
            }
            continenteID++;
        }
        int continentes[] = new int[listaContinentesDominados.size()];
        
        for (int i = 0; i < listaContinentesDominados.size(); i++) {
            continentes[i] = listaContinentesDominados.get(i);
        }
        return continentes;
    }

    public int qtdExercitosParaDistribuir() {
        int qtd = territorios.size() / 3;
        int contDom[] = continentesDominados();
        if (contDom.length > 0) {
            for (int i = 0; i < contDom.length; i++) {
                switch (contDom[i]) {
                    case 0:
                        qtd += DadosJogo.exercitosBonusDosContinentes[0];
                        break;
                    case 1:
                        qtd += DadosJogo.exercitosBonusDosContinentes[1];
                        break;
                    case 2:
                        qtd += DadosJogo.exercitosBonusDosContinentes[2];
                        break;
                    case 3:
                        qtd += DadosJogo.exercitosBonusDosContinentes[3];
                        break;
                    case 4:
                        qtd += DadosJogo.exercitosBonusDosContinentes[4];
                        break;
                    case 5:
                        qtd += DadosJogo.exercitosBonusDosContinentes[5];
                        break;
                    case 6:
                        qtd += DadosJogo.exercitosBonusDosContinentes[6];
                        break;
                }
            }
        }
        return qtd;
    }
    
    private List<Integer> territoriosPorId(){
        List<Integer> listaTerritorioInt = new ArrayList();
        for(Territorio t: territorios){
            listaTerritorioInt.add(t.id);
        }
        return listaTerritorioInt;
    }

    public boolean territorioPertence(int indice) {
        List<Integer> listaTerritorioInt = territoriosPorId();
        for(int i: listaTerritorioInt){
            if(indice == i){
                return true;
            }
        }
        return false;
    }

}
