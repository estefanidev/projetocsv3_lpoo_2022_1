/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package br.edu.ifsul.cc.lpoo.cs.model;

/**
 *
 * @author 20202PF.CC0011
 */
public class Partida {

    private Integer id;
    private Calendar inicio;
    private Calendar fim;
    private Jogador jogador;
    private List<Round> rounds;

    public Integer getId(){
        return id;
    }

    public Calendar getInicio(){
        return inicio;
    }

    public Calendar getFim(){
        return fim;
    }

    public Jogador getJogador(){
        return jogador;
    }

    public void setId(Integer id){
        this.id = id;
    }
    
    public void setInicio(Calendar inicio){
        this.inicio = inicio;
    }

    public void setFim(Calendar fim){
        this.fim = fim;
    }

    public void setJogador(Jogador jogador){
        this.jogador = jogador;
    }

}
