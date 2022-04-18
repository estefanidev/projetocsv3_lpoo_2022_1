package br.edu.ifsul.cc.lpoo.cs.model;

/**
 *
 * @author 20202PF.CC0011
 */
public class Compra {

    private Integer id;
    private Calendar data;
    private Float total;
    private List<ItensCompra> itens;

    public Compra(){

    }

    public Integer getId(){
        return id;
    }

    public Calendar getData(){
        return data;
    }

    public Float getTotal(){
        return total;
    }

    public List<ItensCompra> getItens(){
        return itens;
    }
    
    public void setId(Integer id){
        this.id = id;
    }

    public void setData(Calendar data){
        this.data = data;
    }

    public void setTotal(Float total){
        this.total = total;
    }

    public void setItens(List<ItensCompra> itens){
        this.itens = itens;
    }

}
