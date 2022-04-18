package br.edu.ifsul.cc.lpoo.cs.model;

/**
 *
 * @author 20202PF.CC0011
 */
public class ItensCompra {

    private Integer id;
    private String quantidade;
    private Float valor
    private Artefato artefato;
    private Compra compra; // agregação or composição - refer a enti forte

    public ItensCompra(){

    }

    public Integer getId(){
        return id;
    }

    public String getQuantidade(){
        return quantidade;
    }

    public Float getValor(){
        return valor;
    }

    public void getId(Integer id){
        this.id = id;
    }

    public void getQuantidade(String quantidade){
        this.quantidade = quantidade;
    }

    public void getValor(Float valor){
        this.valor = valor;
    }
    
}
