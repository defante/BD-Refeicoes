/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.refeicoes.conect;

import java.sql.*;
/**
 *
 * @author pamela
 */
public class ModuloConexao {
    public static Connection conector() {
        // conexão com o banco
        java.sql.Connection conexao = null;
        //carregando o driver correspondente ao banco         
        String driver = "com.postgresql.jdbc.Driver";
        String url = "jdbc:postgresql://localhost:5432/dbrefeicoes";
        String user = "root";
        String password = "ufabc";
        //estabelecendo a conexão com o banco
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;

        } catch (Exception e) {
            
            //System.out.println(e);
            return null;
            //e.printStackTrace();
        }
        

    }
    
}
