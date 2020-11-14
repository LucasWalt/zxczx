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
import workdata.pojo.Cadastro_usuariosPOJO;

/**
 *
 * @author Walt's
 */
public class Cadastro_usuarioDAO {
    public static ConPooling cn = ConPooling.getIntance();
    
    public void inserirCadastro_usuario(Cadastro_usuariosPOJO cadastro_usuarios){
        Connection con=cn.getConnection();// Pegando Conexão com o banco de dados
        String sql="insert into contato(nivel_acesso,nome,senha)values(?,?,?);";
        try{
            PreparedStatement p=con.prepareStatement(sql);
            p.setInt(1, cadastro_usuarios.getNivel_acesso());
            p.setString(2, cadastro_usuarios.getNome());
            p.setString(3, cadastro_usuarios.getSenha());
            
            int sucesso=p.executeUpdate();
            if(sucesso!=0){
                JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!!!");  
            }
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro 01 - "+e);
        }
}
}
