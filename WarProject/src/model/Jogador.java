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

    public void removeCartaTerritorio(CartasTerritorio cartaTerritorio) {//remove a primeira ocorrencia do territorio
        boolean naoAchou = true;
        Iterator<CartasTerritorio> it = cartas.iterator();
        while (it.hasNext() && naoAchou) {
            if (it.next().equals(cartaTerritorio)) {
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

    public List<CartasTerritorio> getCartas() {
        return cartas;
    }

    private int[] continentesDominados() {
        int continenteID = 0;
        List<Integer> listaContinentesDominados = new ArrayList();
        for (int[] territoriosDoContinente : DadosJogo.territoriosDoContinente) {

            boolean dominouContinente = true;
            for (int j = 0; j < territoriosDoContinente.length; j++) {
                if (!territoriosPorId().contains(territoriosDoContinente[j])) {
                    dominouContinente = false;
                }
            }
            if (dominouContinente) {
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

    private List<Integer> territoriosPorId() {
        List<Integer> listaTerritorioInt = new ArrayList();
        for (Territorio t : territorios) {
            listaTerritorioInt.add(t.id);
        }
        return listaTerritorioInt;
    }

    public boolean territorioPertence(int indice) {
        List<Integer> listaTerritorioInt = territoriosPorId();
        for (int i : listaTerritorioInt) {
            if (indice == i) {
                return true;
            }
        }
        return false;
    }

    public String getStringDescricaoCartaTerritorio(int indexCarta) {
        if (indexCarta > cartas.size()) {
            return "Você não possui a carta de numero " + indexCarta;
        } else {
            return cartas.get(indexCarta - 1).getTerritorio().getNome();
        }
    }

    public String getStringTipoCartaTerritorio(int indexCarta) {
        if (indexCarta > cartas.size()) {
            return "";
        } else {
            return cartas.get(indexCarta - 1).getNomeFormaGeometrica();
        }
    }

    public boolean podeTrocarCartas() {
        int indiceQuadrado = 0;
        int indiceCirculo = 0;
        int indiceTriangulo = 0;
        for (int i = 0; i < cartas.size(); i++) {
            CartasTerritorio cartaTerritorio = cartas.get(i);
            if (cartaTerritorio.formaGeometricaQuadrada()) {
                indiceQuadrado += 1;
            } else {
                if (cartaTerritorio.formaGeometricaCircular()) {
                    indiceCirculo += 1;
                } else {
                    indiceTriangulo += 1;
                }
            }
        }
        return (indiceCirculo >= 3 || indiceQuadrado >= 3 || indiceTriangulo >= 3 || (indiceCirculo >= 1 && indiceTriangulo >= 1 && indiceQuadrado >= 1));
    }

    public CartasTerritorio[] TrocarCartas() {
        int indiceQuadrados = 0;
        int indiceCirculos = 0;
        int indiceTriangulos = 0;

        CartasTerritorio quadrados[] = new CartasTerritorio[5];
        CartasTerritorio circulos[] = new CartasTerritorio[5];
        CartasTerritorio triangulos[] = new CartasTerritorio[5];
        CartasTerritorio diferentes[] = new CartasTerritorio[5];
        CartasTerritorio arrayDaTroca[] = new CartasTerritorio[5];

        for (int i = 0; i < cartas.size(); i++) {
            CartasTerritorio cartaTerritorio = cartas.get(i);
            if (cartaTerritorio.formaGeometricaQuadrada()) {
                quadrados[indiceQuadrados] = cartaTerritorio;
                if (indiceQuadrados == 0) {
                    diferentes[0] = cartaTerritorio;
                }
                indiceQuadrados += 1;
            } else {
                if (cartaTerritorio.formaGeometricaCircular()) {
                    circulos[indiceCirculos] = cartaTerritorio;
                    if (indiceCirculos == 0) {
                        diferentes[1] = cartaTerritorio;
                    }
                    indiceCirculos += 1;
                } else {
                    triangulos[indiceTriangulos] = cartaTerritorio;
                    if (indiceTriangulos == 0) {
                        diferentes[2] = cartaTerritorio;
                    }
                    indiceTriangulos += 1;

                }
            }
        }

        if (indiceQuadrados >= 3) {
            arrayDaTroca = quadrados;
        } else {
            if (indiceCirculos >= 3) {
                arrayDaTroca = circulos;
            } else {
                if (indiceTriangulos >= 3) {
                    arrayDaTroca = triangulos;
                } else {
                    if (indiceQuadrados >= 1 && indiceCirculos >= 1 && indiceTriangulos >= 1) {
                        arrayDaTroca = diferentes;
                    }
                }
            }
        }
        CartasTerritorio ct[] = new CartasTerritorio[3];
        for (int i = 0; i < ct.length; i++) {
            removeCarta(arrayDaTroca[i]);
            ct[i] = arrayDaTroca[i];
        }
        return ct;
    }

    public int possuiTerritorioDaCartaTerritorio(CartasTerritorio cartasTerritorio) {
        Territorio t = cartasTerritorio.getTerritorio();
        for (int i = 0; i < territorios.size(); i++) {
            if (territorios.get(i) == t) {
                return i;
            }
        }

        return -1;
    }

    public Territorio getTerritorio(int indice) {
        return territorios.get(indice);
    }

    public boolean naoPossuiTerritorios() {
        return territorios.isEmpty();
    }

}
