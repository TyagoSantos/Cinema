package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Conexao {
    private Connection conexao = null;
    public void verTabela(){ //CONEXÃO PARA VER A TABELA
        try{
            conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/Teste", "root", "Fam1l1a..");

            Statement statement = conexao.createStatement();

            ResultSet resultSet = statement.executeQuery("select * from cliente");

            while (resultSet.next()){
                System.out.print(resultSet.getString("nome"));
                System.out.print(" ");
                System.out.println(resultSet.getString("idade"));
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}

