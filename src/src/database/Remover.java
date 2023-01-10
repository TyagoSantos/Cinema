package database;

import javax.swing.*;
import java.sql.*;
import java.util.Scanner;

public class Remover {
    private void remover(){
        int comfirma = JOptionPane.showConfirmDialog(null,"Tem certeza que deseja remover","Atenção",JOptionPane.YES_NO_OPTION);//cria um botão de confirmação para que o usuário não delete ao equivocadamente //
        if(comfirma== JOptionPane.YES_OPTION){//confirma o delete pelo usuário//
            try{
                Conexao conexao1 = new Conexao();
                Statement con = conexao1.getConexao().createStatement();

                // Comando para inserir dados (tem que vir antes da execução)
                con.executeUpdate("DELETE FROM lanche WHERE idlanche values ('1')");
                con.executeQuery("select * from lanche");

                ResultSet rs = con.getResultSet();
                while(rs.next()){
                    System.out.print(rs.getString("idLanche"));
                    System.out.print(rs.getString("nome"));
                    System.out.print(rs.getString("marca"));
                    System.out.print(rs.getString("preco"));
                    System.out.print(rs.getString("quantidadeEstoque"));
                }
            }
            catch(SQLException e){
                e.printStackTrace();
            }

        }
    }
}
