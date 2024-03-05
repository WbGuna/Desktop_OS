package br.com.infoX.dao;

import java.sql.*;
/**
 *
 * @author wb
 */
public class ModuloConexao {

    public static Connection conector() {
        Connection conexao = null;
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/dbinfox";
        String user = "root";
        String password = "root";
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            System.out.println("conexão com sucesso");
            return conexao;
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
             System.out.println("conexão erro");
            return null;
        }
    }
     
    /*public static Connection conector() {
        java.sql.Connection conexao = null;
        String driver = "org.h2.Driver";
        String url = "jdbc:h2:~/test";
        String user = "sa";
        String password = "";
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            System.out.println("conexão com sucesso");
            return conexao;
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
             System.out.println("conexão erro");
            return null;
        }
    }*/
    
}
