/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Arrays;
import java.util.List;

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
        this.exercitosPosicionados = exercitosPosicionados;
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
    
}
