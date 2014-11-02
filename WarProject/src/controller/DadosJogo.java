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
    public static int[][] vinzihosDoTerritorio = new int[41][];

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

        int[][] vizinhosDoTerritorio = {
            {1, 2, 17}, //0
            {0, 2},
            {0, 1, 3, 5, 6}, //2
            {2, 4, 6},
            {3, 6, 7, 9}, //4
            {2, 8},
            {2, 3, 4, 9, 10, 13}, //6
            {4, 8, 9},
            {5, 7, 9}, //8
            {4, 6, 7, 8, 10}, //9
            {6, 9, 11, 12, 13}, //10
            {10, 12, 21, 22}, //11
            {10, 11, 13, 22, 24}, //12
            {6, 10, 12, 14, 16, 25}, //13
            {13, 15}, //14
            {14}, //15
            {13, 18}, //16
            {0, 18, 19},//17
            {16, 17, 19},//18
            {17, 18, 20},//19
            {19, 26, 41},//20
            {11, 22, 30},//21
            {11, 12, 21, 23, 24},//22
            {22, 24, 27, 29},//23
            {12, 22, 23, 25},//24
            {13, 24, 26},//25
            {20, 25, 32},//26
            {23, 28, 29, 32, 33},//27
            {27, 29, 33},//28
            {23, 27, 28, 30, 33, 34},//29
            {21, 29},//30
            {32},//31
            {26, 27, 33, 38},//32
            {27, 28, 29, 32, 34, 35, 37, 38},//33
            {29, 33, 35},//34
            {33, 34, 36, 37},//35
            {35, 37},//36
            {33, 35, 36, 38},//37
            {32, 33, 37, 39, 40},//38
            {38, 40},//39
            {38, 39, 41},//40
            {20, 40}//41
        };
    }


}
