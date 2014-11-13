/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.DadosJogo;
import java.util.List;


public class Objetivo {

    private static boolean verificaSeObjetivoTipoUmFoiConcluido(Jogador jogador_atual, Jogador[] jogadores) {
        /*
        Acabar com as seguintes legioes:
        public static int[] objetivosTipo1 = {legiaoVermelha,legiaoVerde,legiaoAzul,legiaoPreta};
        */
        int id_do_objetivo = jogador_atual.getObjetivo().getID();
        int objetivo_tipo1 = DadosJogo.objetivosTipo1[id_do_objetivo];
        //Se a cor do objetivo for igual a cor dele, conquista 24 territorios
        if(jogador_atual.getCor() == objetivo_tipo1){
            return jogador_atual.getTerritorios().size()>23;
        }
        for (int i = 0; i < jogadores.length; i++) {
            if(jogadores[i].getCor() == objetivo_tipo1){
                return jogadores[i].getTerritorios().size()<1;
            }
        }
        return false;
    }

    private static boolean verificaSeObjetivoTipoDoisFoiConcluido(Jogador jogador_atual) {
        /*
        Conquistar 2 continentes:
        public static int[][] objetivosTipo2 = {{0, 5},{4, 2},{4, 3}};
        */
        int tamanhos_anteriores = DadosJogo.objetivosTipo1.length;//Tamanhos dos Tipos de Objetivos Anteriores
        int id_do_objetivo = jogador_atual.getObjetivo().getID();
        int[] continentes = DadosJogo.objetivosTipo2[id_do_objetivo-tamanhos_anteriores];
        return (jogador_atual.verificaSePossuiContinente(continentes[0])&&
                jogador_atual.verificaSePossuiContinente(continentes[1]));
        
    }

    private static boolean verificaSeObjetivoTipoTresFoiConcluido(Jogador jogador_atual) {
        /*
        public static int[][] objetivosTipo3 = {{0, 6},{1, 6},{1, 3},{5, 2}};
        */
        int tamanhos_anteriores = DadosJogo.objetivosTipo1.length+DadosJogo.objetivosTipo2.length;//Tamanhos dos Tipos de Objetivos Anteriores
        int id_do_objetivo = jogador_atual.getObjetivo().getID();
        int[] continentes = DadosJogo.objetivosTipo3[id_do_objetivo-tamanhos_anteriores];
        return (jogador_atual.verificaSePossuiContinente(continentes[0])&&
                jogador_atual.verificaSePossuiContinente(continentes[1])&&
                (jogador_atual.continentesDominados().length>2));
    }

    private static boolean verificaSeObjetivoTipoQuatroFoiConcluido(Jogador jogador_atual) {
        /*
        Conquiste 24 provincias:
        public static int[] objetivosTipo4 = {24};
        */
        int tamanhos_anteriores = DadosJogo.objetivosTipo1.length+DadosJogo.objetivosTipo2.length+DadosJogo.objetivosTipo3.length;//Tamanhos dos Tipos de Objetivos Anteriores
        int id_do_objetivo = jogador_atual.getObjetivo().getID();
        int numero_de_provincias = DadosJogo.objetivosTipo4[id_do_objetivo-tamanhos_anteriores];
        
        return jogador_atual.getTerritorios().size()>= numero_de_provincias;
    }

    private static boolean verificaSeObjetivoTipoCincoFoiConcluido(Jogador jogador_atual) {
        int tamanhos_anteriores = DadosJogo.objetivosTipo1.length+DadosJogo.objetivosTipo2.length+DadosJogo.objetivosTipo3.length+DadosJogo.objetivosTipo4.length;//Tamanhos dos Tipos de Objetivos Anteriores
        int id_do_objetivo = jogador_atual.getObjetivo().getID();
        int numero_de_provincias = DadosJogo.objetivosTipo5[id_do_objetivo-tamanhos_anteriores];
        
        jogador_atual.verificaSePossuiXTerritoriosCom2Legioes(numero_de_provincias);
        return false;
    }

    int id_objetivo;
    private int tipo_objetivo;
    final static int TIPO_UM=1, TIPO_DOIS=2, TIPO_TRES=3, TIPO_QUATRO=4, TIPO_CINCO=5;
    String descricao;
    List<Territorio> territoriosNecessarios;

    public Objetivo(int[] restricoes){
        id_objetivo = geraObjetivoAleatorio(restricoes);
        tipo_objetivo = verificaTipoDoObjetivo(id_objetivo);
    }
    
    public int getTipoObjetivo(){
        return tipo_objetivo;
    }
    public static boolean foiConcluido(int indiceJogadorDaRodada, Jogador[] jogadores) {
        Jogador jogador_atual = jogadores[indiceJogadorDaRodada];
        int tipo_do_objetivo = jogador_atual.getObjetivo().getTipoObjetivo();
        
        boolean foiConcluido =false;
        switch(tipo_do_objetivo){
            case TIPO_UM:
                foiConcluido = verificaSeObjetivoTipoUmFoiConcluido(jogador_atual, jogadores);
                break;
            case TIPO_DOIS:
                foiConcluido = verificaSeObjetivoTipoDoisFoiConcluido(jogador_atual);
                break;
            case TIPO_TRES:
                foiConcluido = verificaSeObjetivoTipoTresFoiConcluido(jogador_atual);
                break;
            case TIPO_QUATRO:
                foiConcluido = verificaSeObjetivoTipoQuatroFoiConcluido(jogador_atual);
                break;
            case TIPO_CINCO:
                foiConcluido = verificaSeObjetivoTipoCincoFoiConcluido(jogador_atual);
                break;
        }
        return foiConcluido;   
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
