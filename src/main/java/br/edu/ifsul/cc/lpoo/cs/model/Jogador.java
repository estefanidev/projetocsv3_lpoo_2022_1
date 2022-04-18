package br.edu.ifsul.cc.lpoo.cs.model;

/**
 *
 * @author 20202PF.CC0011
 * @data: 11/04/2022
 */
public class Jogador {

    private String nickname;
    private String senha;
    private Integer pontos;
    private Calendar data_cadastro;
    private Calendar data_ultimo_login;
    private Endereco endereco; //Associação
    private List<Patente> patentes; //Agregação - é uma lista
    private List<Artefato> artefatos //Agregação
    private List<Compra> compras; //Agregação por composição

    public Jogador(){

    }

    public String getNickname(){
        return nickname;
    }

    public String getSenha(){
        return senha;
    }

    public Integer getPontos(){
        return pontos;
    }

    public Calendar getData_cadastro(){
        return data_cadastro;
    }

    public Calendar getData_ultimo_login(){
        return data_ultimo_login;
    }

    public Endereco getEndereco(){
        return endereco;
    }

    public List<Patente> getPatentes(){
        return patentes;
    }

    public List<Artefato> getArtefatos(){
        return artefatos;
    }

    public List<Compra> getCompras{
        return compras;
    }

    public void setNickname(String nickname){
        this.nickname = nickname;
    }

    public void setSenha(String senha){
        this.senha = senha;
    }

    public void setPontos(Integer pontos){
        this.pontos = pontos;
    }

    public void setData_cadastro(Calendar data_cadastro){
        this.data_cadastro = data_cadastro;
    }

    public void setData_ultimo_login(Calendar data_ultimo_login){
        this.data_ultimo_login = data_ultimo_login;
    }

    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }

    public void setPatentes(List<Patente> patentes){
        this.patentes = patentes;
    }

    public void setArtefatos(List<Artefato> artefatos){
        this.artefatos = artefatos;
    }

    public void setCompras(List<Compra> compras){
        this.compras = compras;
    }

}
