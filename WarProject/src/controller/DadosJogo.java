/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author Samsung
 */
public class DadosJogo {

    public static String[] nomeTerritorios;
    public static String[] nomeContinentes;

    private static DadosJogo instancia;

    public static synchronized DadosJogo getInstance() {
        if (instancia == null) {
            instancia = new DadosJogo();
        }
        return instancia;
    }

    private DadosJogo() {
        nomeTerritorios[0] = "Baeticia";
        nomeTerritorios[1] = "Lusitania";
        nomeTerritorios[2] = "Tarraconesis";
        nomeTerritorios[3] = "Aquitania";
        nomeTerritorios[4] = "Lugdunensis";
        nomeTerritorios[5] = "Britania";
        nomeTerritorios[6] = "Narbonensis";
        nomeTerritorios[7] = "Bélgica";
        nomeContinentes[0] = "Europa Ocidental";

        nomeTerritorios[8] = "Germania Superior";
        nomeTerritorios[9] = "Germania Inferior";
        nomeTerritorios[10] = "Raetia";
        nomeTerritorios[11] = "Pandomia";
        nomeTerritorios[12] = "Illyricum";
        nomeContinentes[1] = "Europa Central";
        
        

    }

}
