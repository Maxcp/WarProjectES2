/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author giseleafreitas
 */

public class Ataque {
    public static boolean[] comparaSeAtaqueGanhouNoDado(int[] dados_ataque, int[] dados_defesa) {
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
    public static void realizaAtque(int[] dados_ataque, int[] dados_defesa, Territorio territorio_ataque, Territorio territorio_defesa) {
        boolean[] resultado = comparaSeAtaqueGanhouNoDado(dados_ataque, dados_defesa);//true quando ataque ganhou

        for(int i = 0; i < resultado.length; i++)
        {
            int exercitoQtd;
            if(resultado[i])
            {
                exercitoQtd = territorio_defesa.getExercitosPosicionados();
                territorio_defesa.setExercitosPosicionados(exercitoQtd - 1);
            }
            else
            {
                exercitoQtd = territorio_ataque.getExercitosPosicionados();
                territorio_ataque.setExercitosPosicionados(exercitoQtd - 1);
            }
        }
    }
    
}
