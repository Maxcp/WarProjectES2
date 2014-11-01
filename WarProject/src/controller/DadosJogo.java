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

        nomeTerritorios[13] = "Itália";
        nomeTerritorios[14] = "Corsica";
        nomeTerritorios[15] = "Sardinia";
        nomeTerritorios[16] = "Sicília";
        nomeContinentes[2] = "Península Itálica";

        nomeTerritorios[17] = "Mauritania";
        nomeTerritorios[18] = "Africa";
        nomeTerritorios[19] = "Numidia";
        nomeTerritorios[20] = "Cyrenaica";
        nomeContinentes[3] = "Península Itálica";

        nomeTerritorios[21] = "Dacia";
        nomeTerritorios[22] = "Moesia";
        nomeTerritorios[23] = "Thracia";
        nomeTerritorios[24] = "Macedônia";
        nomeTerritorios[25] = "Achaca";
        nomeTerritorios[26] = "Creta";
        nomeTerritorios[27] = "Asia";
        nomeTerritorios[28] = "Galatia";
        nomeTerritorios[29] = "Bithynia";
        nomeTerritorios[30] = "Taurica";
        nomeContinentes[4] = "Europa Oriental";

        nomeTerritorios[31] = "Cyprus";
        nomeTerritorios[32] = "Lycia";
        nomeTerritorios[33] = "Cappadocia";
        nomeTerritorios[34] = "Ponfus";
        nomeTerritorios[35] = "Armenia";
        nomeTerritorios[36] = "Assyria";
        nomeTerritorios[37] = "Mesopotamia";
        nomeContinentes[4] = "Ásia Menor";
        
        nomeTerritorios[38] = "Syria";
        nomeTerritorios[39] = "Judaca";
        nomeTerritorios[40] = "Arabia Petrae";
        nomeTerritorios[41] = "Aegyptus";
        nomeContinentes[5] = "Médio Oriente";

    }

}
