package database;

import javax.swing.*;
import java.sql.*;

public class Funcionario {
    public void acrescentarLanche(){
        try{
            Conexao conexao1 = new Conexao();
            Statement con = conexao1.getConexao().createStatement();

           // Comando para inserir dados (tem que vir antes da execução)
            con.executeUpdate("insert into lanche(idlanche, nome, marca, preco, quantidadeEstoque) values (default, 'coca-cola', 'Coca-Cola', '19', '50')");

            con.executeQuery("select * from lanche");

            ResultSet rs = con.getResultSet();
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
        }

    }
}

