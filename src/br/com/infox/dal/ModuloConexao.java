/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infox.dal;

import java.sql.*;
/**
 *
 * @author Notebook
 */
public class ModuloConexao {
    //metodo responsavel por estabeleçer conexao com o banco de dados
    
    public static Connection conector(){
        java.sql.Connection conexao = null;
        // a linha abaixo chama o driver
        String driver = "com.mysql.jdbc.Driver";
        // armazenando informaçãoes referente ao banco
        String url = "jdbc:mysql://localhost:3306/dbinfox";
        String user = "root";
        String password = "";
        // estabeleçendo a conexão com o banco
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url,user,password);
            return conexao;
        } catch (Exception e) {
            //linha de apoio para erro de execuçao
            
            //System.out.println(e);
            return null;
        }
    }
}
