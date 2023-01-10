package database;

import java.sql.*;

public class Funcionario {
    public void acrescentarLanche(){
        try{
            Conexao conexao1 = new Conexao();
            Statement con = conexao1.getConexao().createStatement();

           // con.executeUpdate("insert into lanche(idLanche) values (default)");
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

