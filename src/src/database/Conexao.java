package database;

import java.sql.*;

public class Conexao {
    private String severname = "localhost:3306";
    private String mydatabase = "cineif"; //colocar o nome idêntico do que esta na máquina local do MySQL//
    private String url = "jdbc:mysql://" + severname + "/" + mydatabase;
    private String userName = "root";
    private String passWord = "Fam1l1a.."; //colocar a senha que foi criada na máquina local do MySQL//
    private Connection conexao = null;

    public Connection getConexao(){
        return this.conexao;
    }
    public void setConexao(Connection conexao){
        this.conexao = conexao;
    }

    Conexao() throws SQLException{
        try {
            conexao = DriverManager.getConnection(url, userName, passWord);
            Statement statement = conexao.createStatement();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

