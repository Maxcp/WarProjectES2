/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warproject;

import java.util.List;

/**
 *
 * @author Matheus
 */
class Territorio {
    String nome;
    List<Territorio> vizinhos;
    Jogador conquistador;
    int exercitosPosicionados;
}
