package workdata.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import workdata.pojo.Cadastro_ordemPOJO;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Walt's
 */
public class Cadastro_ordemDAO {
    public static ConPooling cn = ConPooling.getIntance();
    
    public void inserirCadastro_ordemDAO(Cadastro_ordemPOJO cadastroordem){
        Connection con=cn.getConnection();// Pegando Conexão com o banco de dados
        String sql="insert into contato(nome_produto,quant_produto,data_inicio,data_termino,media_producao)values(?,?,?,?,?);";
        try{
            PreparedStatement p=con.prepareStatement(sql);
            p.setString(1, cadastroordem.getNome_produto());
            p.setInt(2, cadastroordem.getQuant_produto());
            p.setInt(3, cadastroordem.getData_inicio());
            p.setInt(4, cadastroordem.getData_termino());
            p.setDouble(5, cadastroordem.getMedia_producao());
            int sucesso=p.executeUpdate();
            if(sucesso!=0){
                JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!!!");  
            }
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro 01 - "+e);
        }
    }
}
