package database;

import javax.swing.*;
import java.sql.*;

public class Funcionario {

    private String severname = "localhost:3306";
    private String mydatabase = "cineif"; //colocar o nome idêntico do que esta na máquina local do MySQL//
    private String url = "jdbc:mysql://" + severname + "/" + mydatabase;
    private String userName = "root";
    private String passWord = "Sua senha"; //colocar a senha que foi criada na máquina local do MySQL//
    private Connection conexao = null;

    public void acrescentarLanche() throws SQLException{

        String nome = "coca-cola";
        String marca = "Coca-Cola";
        int preco = 19;
        int quantidadeEstoque = 50;

        String inserir = "insert into lanche(idlanche, nome, marca, preco, quantidadeEstoque) values (default, ?, ?, ?, ?)";
        try{
            //Conexao conexao1 = new Conexao();
            //Statement con = conexao1.getConexao().createStatement();
            conexao = DriverManager.getConnection(url, userName, passWord);


            PreparedStatement pstmt = conexao.prepareStatement(inserir);
            pstmt.setString(1, nome);
            pstmt.setString(2, marca);
            pstmt.setInt(3, preco);
            pstmt.setInt(4,quantidadeEstoque);

            pstmt.executeUpdate();


            PreparedStatement statement = conexao.prepareStatement("select * from lanche");

            ResultSet rs = statement.executeQuery();
            while(rs.next()){
                System.out.println(rs.getString("idLanche"));
                System.out.println(rs.getString("nome"));
                System.out.println(rs.getString("marca"));
                System.out.println(rs.getString("preco"));
                System.out.println(rs.getString("quantidadeEstoque"));
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        } finally {
            conexao.close();
        }

    }
}

