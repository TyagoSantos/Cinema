package database;
import java.sql.*;
import java.util.ArrayList;

import gui.crudADM;
import gui.crudADM.*;

import core.Administrador;
import core.Administrador.*;

public class FuncionarioData {

    private String severname = "localhost:3306";
    private String mydatabase = "cineif"; //colocar o nome idêntico do que esta na máquina local do MySQL//
    private String url = "jdbc:mysql://" + severname + "/" + mydatabase;
    private String userName = "root";
    private String passWord = "Sua Senha"; //colocar a senha que foi criada na máquina local do MySQL//
    private Connection conexao = null;

    private String nome;
    private String marca;
    private int preco;
    private int quantidadeEstoque;




    //METODOS FUNCIONÁRIO
    public void adicionarLanche(String nome, String marca, int preco, int quantidadeEstoque) throws SQLException{
        this.nome = nome;
        this.marca = marca;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;


        String inserir = "insert into lanche(idlanche, nome, marca, preco, quantidadeEstoque) values (?, ?, ?, ?, ?)";
        try{
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
    public void editarLanche(int idLanche, int quantidadeEstoque) throws SQLException{
        String alterarQTD = "update lanche set quantidadeestoque=? where idlanche = ?";
        try {
            conexao = DriverManager.getConnection(url, userName, passWord);
            PreparedStatement pstmt = conexao.prepareStatement(alterarQTD);
            pstmt.setInt(1, quantidadeEstoque);
            pstmt.setInt(2, idLanche);
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
        }
        finally {
            conexao.close();
        }
    }


    public void pullLanches() throws SQLException {

         Administrador teste = new Administrador();



        //arraylist para puxar do banco
        ArrayList<String> arrayPull = new ArrayList<String>();

        try {
            conexao = DriverManager.getConnection(url, userName, passWord);

            PreparedStatement statement = conexao.prepareStatement("select * from lanche ");

            ResultSet rs = statement.executeQuery();
            while(rs.next()){

                arrayPull.add(rs.getString("idLanche"));
                arrayPull.add(rs.getString("nome"));
                arrayPull.add(rs.getString("marca"));
                arrayPull.add(rs.getString("preco"));
                arrayPull.add(rs.getString("quantidadeEstoque"));

//                teste.puxarLanche(rs.getString("idLanche"),rs.getString("nome"),
//                        rs.getString("marca"),rs.getString("preco"),
//                        rs.getString(("quantidadeEstoque")));
            }
            teste.puxarLanche(arrayPull);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }







    //MÉTODO PARA O ADM ALTERAR ALGUMA INFORMAÇÃO PASSADA
    public void editarGeral(int idLanche,String nome, String marca, int preco, int quantidadeEstoque) throws SQLException{
        //Conexao conexao = new Conexao();
        String editarGeralUp = "update lanche set nome=?, marca=?, preco=?, quantidadeEstoque=? where idlanche = ?";
        try {
            conexao = DriverManager.getConnection(url, userName, passWord);

            PreparedStatement pstmt = conexao.prepareStatement(editarGeralUp);
            pstmt.setString(1, nome);
            pstmt.setString(2, marca);
            pstmt.setInt(3, preco);
            pstmt.setInt(4, quantidadeEstoque);
            pstmt.setInt(5, idLanche);

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
        }
        finally {
            conexao.close();
        }
    }
}

