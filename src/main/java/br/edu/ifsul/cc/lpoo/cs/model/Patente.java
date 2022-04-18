package br.edu.ifsul.cc.lpoo.cs.model;

/**
 *
 * @author 20202PF.CC0011
 */
public class Patente {
    private Integer id;
    private String nome;
    private String cor;
    
    public Patente() {
        
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCor(){
        return cor;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
