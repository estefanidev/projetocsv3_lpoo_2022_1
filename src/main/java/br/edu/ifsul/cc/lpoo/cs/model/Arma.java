/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package br.edu.ifsul.cc.lpoo.cs.model;

/**
 *
 * @author 20202PF.CC0011
 */
public class Arma extends Artefato{

    private Float comprimento_cano;
    private Tipo tipo;
    private List<Municao> municoes;

    public Arma(){

    }

    public Float getComprimento_cano(){
        return comprimento_cano;
    }

    public Tipo getTipo(){
        return tipo;
    }

    public List<Municao> getMunicoes(){
        return municoes;
    }

    public void setComprimento_cano(Float comprimento_cano){
        this.comprimento_cano = comprimento_cano;
    }

    public void setTipo(Tipo tipo){
        this.tipo = tipo;
    }

    public void setMunicoes(List<Municao> municoes){
        this.municoes =  municoes;
    }

}
