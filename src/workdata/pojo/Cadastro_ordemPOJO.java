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
public class Cadastro_ordemPOJO {
    
    String Nome_produto;
    int Cod_ordem,Quant_produto,Data_inicio,Data_termino,Cod_prod;
    double Media_producao;
    
    public String getNome_produto() {
        return Nome_produto;
    }

    public void setNome_produto(String Nome_produto) {
        this.Nome_produto = Nome_produto;
    }
   
    
    public int getCod_ordem() {
        return Cod_ordem;
    }

    public void setCod_ordem(int Cod_ordem) {
        this.Cod_ordem = Cod_ordem;
    }

    public int getQuant_produto() {
        return Quant_produto;
    }

    public void setQuant_produto(int Quant_produto) {
        this.Quant_produto = Quant_produto;
    }

    public int getData_inicio() {
        return Data_inicio;
    }

    public void setData_inicio(int Data_inicio) {
        this.Data_inicio = Data_inicio;
    }

    public int getData_termino() {
        return Data_termino;
    }

    public void setData_termino(int Data_termino) {
        this.Data_termino = Data_termino;
    }

    public int getCod_prod() {
        return Cod_prod;
    }

    public void setCod_prod(int Cod_prod) {
        this.Cod_prod = Cod_prod;
    }

    public double getMedia_producao() {
        return Media_producao;
    }

    public void setMedia_producao(double Media_producao) {
        this.Media_producao = Media_producao;
    }
    
}
