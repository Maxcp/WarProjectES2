/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Matheus
 */
public class Territorio {



    int id;
    String nome;
    Territorio vizinhos[];
    Jogador conquistador;
    int exercitosPosicionados;

    public Territorio(int id, String nome, Territorio vizinhos[], Jogador conquistador, int exercitosPosicionados) {
        this.id = id;
        this.nome = nome;
        this.vizinhos = vizinhos;
        this.conquistador = conquistador;
        this.exercitosPosicionados = 1;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Territorio[] getVizinhos() {
        return vizinhos;
    }
    public boolean isVizinho(Territorio t){
        for(int i = 0; i < vizinhos.length; i++) {
            if(vizinhos[i]==t){
            return true;
            }
        }
        return false;
    }

    public void setVizinhos(Territorio[] vizinhos) {
        this.vizinhos = vizinhos;
    }

    public Jogador getConquistador() {
        return conquistador;
    }

    public void setConquistador(Jogador conquistador) {
        this.conquistador = conquistador;
    }

    public int getExercitosPosicionados() {
        return exercitosPosicionados;
    }

    public void setExercitosPosicionados(int exercitosPosicionados) {
        this.exercitosPosicionados = exercitosPosicionados;
    }
    //---------------------------METODOS ESTATICOS AUXILIARES--------------------------------------------
    public static Territorio retiraUltimoTerritorioDaLista(List<Territorio> list){
        Territorio territorio = list.get(list.size() - 1);
        list.remove(list.size() - 1);
        return territorio;
    }
    
    public static void embaralhaTerritorio(List<Territorio> list){
        long seed = System.nanoTime();
        Collections.shuffle(list, new Random(seed));
    }
    
    private static List<Territorio> geraListasDeTerritoriosAleatoria(Territorio[] territorios){
        List<Territorio> territoriosEmbaralhados = new ArrayList();
        for (int i = 0; i < territorios.length; i++) {
            territoriosEmbaralhados.add(territorios[i]);
        }
        Territorio.embaralhaTerritorio(territoriosEmbaralhados);
        return territoriosEmbaralhados;
    }
    
    public static void distribuiTerritorio(Territorio[] t, List<Territorio> territorios1, List<Territorio> territorios2, List<Territorio> territorios3, List<Territorio> territorios4) {
        List<Territorio> territoriosEmbaralhados = new ArrayList();
        territoriosEmbaralhados = geraListasDeTerritoriosAleatoria(t);
        
        int quantidade = territoriosEmbaralhados.size()/4;
        int sobrou = territoriosEmbaralhados.size()%4;
        
        while(quantidade>0){
            territorios1.add(Territorio.retiraUltimoTerritorioDaLista(territoriosEmbaralhados));
            territorios2.add(Territorio.retiraUltimoTerritorioDaLista(territoriosEmbaralhados));
            territorios3.add(Territorio.retiraUltimoTerritorioDaLista(territoriosEmbaralhados));
            territorios4.add(Territorio.retiraUltimoTerritorioDaLista(territoriosEmbaralhados));
            quantidade--;
        }
        if(sobrou>0){
            territorios1.add(Territorio.retiraUltimoTerritorioDaLista(territoriosEmbaralhados));
            sobrou--;
        }
        if(sobrou>0){
            territorios2.add(Territorio.retiraUltimoTerritorioDaLista(territoriosEmbaralhados));
            sobrou--;
        }
        if(sobrou>0){
            territorios3.add(Territorio.retiraUltimoTerritorioDaLista(territoriosEmbaralhados));
        }

    }
    
    public static void escreveNomesTerritorios(List<Territorio> territorios){
        String listaDeTerritorios = "";
        for (int i = 0; i < territorios.size(); i++) {
            listaDeTerritorios += territorios.get(i).getNome() + ", ";
        }
        System.out.println(listaDeTerritorios);
    }
    
}
