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
public class Cadastro_usuariosPOJO {

    public int getCod_usuario() {
        return Cod_usuario;
    }

    public void setCod_usuario(int Cod_usuario) {
        this.Cod_usuario = Cod_usuario;
    }

    public int getNivel_acesso() {
        return Nivel_acesso;
    }

    public void setNivel_acesso(int Nivel_acesso) {
        this.Nivel_acesso = Nivel_acesso;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }
    int Cod_usuario,Nivel_acesso;
    String Nome,Senha;
    
}
