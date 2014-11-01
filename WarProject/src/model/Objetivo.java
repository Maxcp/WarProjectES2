/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;


public class Objetivo {
    String descricao;
    List<Territorio> territoriosNecessarios;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Territorio> getTerritoriosNecessarios() {
        return territoriosNecessarios;
    }

    public void setTerritoriosNecessarios(List<Territorio> territoriosNecessarios) {
        this.territoriosNecessarios = territoriosNecessarios;
    }
}
