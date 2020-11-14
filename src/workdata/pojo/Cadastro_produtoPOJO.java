/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workdata.pojo;

/**
 *
 * @author Walt's
 */
public class Cadastro_produtoPOJO {

    int Cod_produto, Peso_aproximado;
    String Nome, Descricao, Grupo;
    double Media_producao;
    
    public int getCod_produto() {
        return Cod_produto;
    }

    public void setCod_produto(int Cod_produto) {
        this.Cod_produto = Cod_produto;
    }

    public int getPeso_aproximado() {
        return Peso_aproximado;
    }

    public void setPeso_aproximado(int Peso_aproximado) {
        this.Peso_aproximado = Peso_aproximado;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    public String getGrupo() {
        return Grupo;
    }

    public void setGrupo(String Grupo) {
        this.Grupo = Grupo;
    }

    public double getMedia_producao() {
        return Media_producao;
    }

    public void setMedia_producao(double Media_producao) {
        this.Media_producao = Media_producao;
    }
    
}
