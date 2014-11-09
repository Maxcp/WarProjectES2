/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.DadosJogo;
import java.util.List;


public class Objetivo {
    int id_objetivo;
    int tipo_objetivo;
    final static int TIPO_UM=1, TIPO_DOIS=2, TIPO_TRES=3, TIPO_QUATRO=4, TIPO_CINCO=5;
    String descricao;
    List<Territorio> territoriosNecessarios;

    public Objetivo(int[] restricoes){
        id_objetivo = geraObjetivoAleatorio(restricoes);
        tipo_objetivo = verificaTipoDoObjetivo(id_objetivo);
    }
    
    public String getDescricao() {
        return DadosJogo.descricaoDeObjetivos[id_objetivo];
    }
    
    public int getID(){
        return id_objetivo;
    }
    
    public List<Territorio> getTerritoriosNecessarios() {
        return territoriosNecessarios;
    }

    public void setTerritoriosNecessarios(List<Territorio> territoriosNecessarios) {
        this.territoriosNecessarios = territoriosNecessarios;
    }
    
    public static int verificaTipoDoObjetivo(int num){
        if(num>=0 && num <=3)
            return TIPO_UM;
        if(num>=4 && num <=6)
            return TIPO_DOIS;
        if(num>=7 && num <=10)
            return TIPO_TRES;
        if(num==11)
            return TIPO_QUATRO;
        if(num>=12 && num <=13)
            return TIPO_UM;
        return -1;
    }
    
    public static int geraObjetivoAleatorio(int[] restricoes){ //SE NAO TEM RESTRICAO, PARAMETRO TEM QUE SER NULO
        boolean valido = false;
        int num = (int)(Math.random() * 14);//GERA VALOR ENTRE 0-14;
        if(restricoes == null){ //Ou seja, nao tem restricao
            valido = true;
        }
        while(!valido){
            num =(int)(Math.random() * 14);//GERA NOVO VALORE ENTRE 0-14
            valido = true;//ASSUME QUE EH VERDADEIRO
            for (int j = 0; j < restricoes.length; j++) {//VE SE EH UM NUMERO RESTRITO
                if(num==restricoes[j]){
                    valido=false;  
                }
            }
        }
        return num;
    }
    
    public boolean verificaSeObjetivoFoiAtingido(){
        if (tipo_objetivo == 1){
            
        }else{
            if (tipo_objetivo == 2){
            
            }
            else{
                if (tipo_objetivo == 3){
            
                }
                else{
                    if (tipo_objetivo == 4){
            
                    }
                    else{

                    }
                }
            }
        }
        return false;
    }

    //METODOS ESTATICOS AUXILIARES
    
    public static void geraQuatroObjetivos(Objetivo objetivo1, Objetivo objetivo2, Objetivo objetivo3, Objetivo objetivo4){
        
        objetivo1 = new Objetivo(null);
        
        int[] vetorAuxiliar = new int[1];
        vetorAuxiliar[0] = objetivo1.getID();
        objetivo2 = new Objetivo(vetorAuxiliar);
        
        vetorAuxiliar = new int[2];
        vetorAuxiliar[0] = objetivo1.getID();
        vetorAuxiliar[1] = objetivo2.getID();
        objetivo3 = new Objetivo(vetorAuxiliar);
        
        vetorAuxiliar = new int[3];
        vetorAuxiliar[0] = objetivo1.getID();
        vetorAuxiliar[1] = objetivo2.getID();
        vetorAuxiliar[2] = objetivo3.getID();
        objetivo4 = new Objetivo(vetorAuxiliar);
        
    }
}
