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
    public static int qtdTerritorios = 42;
    public static String[] nomeTerritorios;
    public static String[] nomeContinentes;
    public static int[][] vinzihosDoTerritorio = {
            {1, 2, 17}, //0 Baeticia
            {0, 2}, //1 Lusitania
            {0, 1, 3, 5, 6}, //2 Tarraconesis
            {2, 4, 6}, //3 Aquitania
            {3, 6, 7, 9}, //4 Lugdunensis
            {2, 8}, //5 Britania
            {2, 3, 4, 9, 10, 13}, //6 Narbonensis
            {4, 8, 9}, //7 Bélgica
            {5, 7, 9}, //8 Germania Superior
            {4, 6, 7, 8, 10}, //9 Germania Inferior
            {6, 9, 11, 12, 13}, //10 Raetia
            {10, 12, 21, 22}, //11 Pandomia
            {10, 11, 13, 22, 24}, //12 Illyricum
            {6, 10, 12, 14, 16, 25}, //13 Itália
            {13, 15}, //14 Corsica
            {14}, //15 Sardinia
            {13, 18}, //16 Sicília
            {0, 18, 19},//17 Mauritania
            {16, 17, 19},//18 Africa
            {17, 18, 20},//19 Numidia
            {19, 26, 41},//20 Cyrenaica
            {11, 22, 30},//21 Dacia
            {11, 12, 21, 23, 24},//22 Moesia
            {22, 24, 27, 29},//23 Thracia
            {12, 22, 23, 25},//24 Macedônia
            {13, 24, 26},//25 Achaca
            {20, 25, 32},//26 Creta
            {23, 28, 29, 32, 33},//27 Asia
            {27, 29, 33},//28 Galatia
            {23, 27, 28, 30, 33, 34},//29 Bithynia
            {21, 29},//30 Taurica
            {32},//31 Cyprus
            {26, 27, 31, 33, 38},//32 Lycia
            {27, 28, 29, 32, 34, 35, 37, 38},//33 Cappadocia
            {29, 33, 35},//34 Ponfus
            {33, 34, 36, 37},//35 Armenia
            {35, 37},//36 Assyria
            {33, 35, 36, 38},//37 Mesopotamia
            {32, 33, 37, 39, 40},//38 Syria
            {38, 40},//39 Judaca
            {38, 39, 41},//40 Arabia Petrae
            {20, 40}//41 Aegyptus
        };

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
        nomeContinentes[3] = "Africa Setentrional";

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
