package br.edu.ifsul.cc.lpoo.cs.model;

/**
 *
 * @author 20202PF.CC0011
 */
public class Artefato {
    /// será uma superclasse de herança
    private Integer id;
    private String nome;
    private Float peso;
    private Float valor;

    public Artefato(){

    }

    public Integer getId(){
        return id;
    }

    public String getNome(){
        return nome;
    }

    public Float getPeso(){
        return peso;
    }
    
    public Float getValor(){
        return valor;
    }

    public void setId(Integer getId){
        this.id = id;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setPeso(Float peso){
        this.peso = peso;
    }

    public void setValor(Float valor){
        this.valor = valor;
    }

    


}
