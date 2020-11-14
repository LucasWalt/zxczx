/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workdata.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import workdata.pojo.Cadastro_produtoPOJO;

/**
 *
 * @author Walt's
 */
public class Cadastro_produtoDAO {
    public static ConPooling cn = ConPooling.getIntance();
    
    public void inserirCadastro_produto(Cadastro_produtoPOJO cadastro_produto){
        Connection con=cn.getConnection();// Pegando Conexão com o banco de dados
        String sql="insert into contato(nome,descricao,grupo,peso_aproximado,media_producao)values(?,?,?,?,?);";
        try{
            PreparedStatement p=con.prepareStatement(sql);
            p.setString(1, cadastro_produto.getNome());
            p.setString(2, cadastro_produto.getDescricao());
            p.setString(3, cadastro_produto.getGrupo());
            p.setInt(4, cadastro_produto.getPeso_aproximado());
            p.setDouble(5, cadastro_produto.getMedia_producao());
            int sucesso=p.executeUpdate();
            if(sucesso!=0){
                JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!!!");  
            }
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro 01 - "+e);
        }
}
}
