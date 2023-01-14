package database;
import java.sql.*;
import java.util.ArrayList;

import core.Administrador;

public class FuncionarioData {

    private String severname = "localhost:3306";
    private String mydatabase = "cineif"; //colocar o nome idêntico do que esta na máquina local do MySQL//
    private String url = "jdbc:mysql://" + severname + "/" + mydatabase;
    private String userName = "root";
    private String passWord = "203040lL"; //colocar a senha que foi criada na máquina local do MySQL//
    private Connection conexao = null;

    private String nome;
    private String marca;
    private int preco;
    private int quantidadeEstoque;

    //LANCHE1-------------------------
    public static String nomeLanche1;
    public static String marcaLanche1;
    public static String precoLanche1;
    public static String quantidadeLanche1;
    //LANCHE1-------------------------



    //LANCHE2-------------------------
    public static String nomeLanche2;
    public static String marcaLanche2;
    public static String precoLanche2;
    public static String quantidadeLanche2;
    //LANCHE2-------------------------



    //LANCHE3-------------------------
    public static String nomeLanche3;
    public static String marcaLanche3;
    public static String precoLanche3;
    public static String quantidadeLanche3;

    //LANCHE3-------------------------



    //LANCHE4-------------------------
    public static String nomeLanche4;
    public static String marcaLanche4;
    public static String precoLanche4;
    public static String quantidadeLanche4;

    //LANCHE4-------------------------



    //LANCHE5-------------------------
    public static String nomeLanche5;
    public static String marcaLanche5;
    public static String precoLanche5;
    public static String quantidadeLanche5;
    //LANCHE5-------------------------



    public ArrayList<String> arrayPull = new ArrayList<String>();



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
        try {
            conexao = DriverManager.getConnection(url, userName, passWord);

            PreparedStatement statement = conexao.prepareStatement("select * from lanche");

            ResultSet rs = statement.executeQuery();
            while(rs.next()){

                arrayPull.add(rs.getString("idLanche"));
                arrayPull.add(rs.getString("nome"));
                arrayPull.add(rs.getString("marca"));
                arrayPull.add(rs.getString("preco"));
                arrayPull.add(rs.getString("quantidadeEstoque"));


            }
            teste.puxarLanche(arrayPull);

            //STRINGS PARA O LANCHE 1 NA TELA DE CRUD
            //(OS MÉTODOS CRIADOS NA TELA DE ADMINISTRADOR SÃO USADOS AQUI
            //(PEGO ÍNDICE DO ARRAY ATRAVÉS DO RETORNO DO MÉTODO CRIADO NA TELA ADMINISTRADOR).
            //O MÉTODO VALUEOF É USADO PARA TRASNFORMAR OBJECT EM STRING
            nomeLanche1 = String.valueOf(teste.nomelanche1(arrayPull));
            marcaLanche1 = String.valueOf(teste.marcalanche1(arrayPull));
            precoLanche1 = String.valueOf(teste.precolanche1(arrayPull));
            quantidadeLanche1 = String.valueOf(teste.quantidadeLanche1(arrayPull));


            //STRINGS PARA O MÉTODO DE LANCHE 2
            nomeLanche2 = String.valueOf(teste.nomelanche2(arrayPull));
            marcaLanche2 = String.valueOf(teste.marcalanche2(arrayPull));
            precoLanche2 = String.valueOf(teste.precolanche2(arrayPull));
            quantidadeLanche2 = String.valueOf(teste.quantidadelanche2(arrayPull));


            //STRINGS PARA O MÉTODO DE LANCHE 3
            nomeLanche3 = String.valueOf(teste.nomelanche3(arrayPull));
            marcaLanche3 = String.valueOf(teste.marcalanche3(arrayPull));
            precoLanche3 = String.valueOf(teste.precolanche3(arrayPull));
            quantidadeLanche3 = String.valueOf(teste.quantidadelanche3(arrayPull));


            //STRINGS PARA O MÉTODO DE LANCHE 4
            nomeLanche4 = String.valueOf(teste.nomelanche4(arrayPull));
            marcaLanche4 = String.valueOf(teste.marcalanche4(arrayPull));
            precoLanche4 = String.valueOf(teste.precolanche4(arrayPull));
            quantidadeLanche4 = String.valueOf(teste.quantidadelanche4(arrayPull));


            //STRINGS PARA O MÉTODO DE LANCHE 5
            nomeLanche5 = String.valueOf(teste.nomelanche5(arrayPull));
            marcaLanche5 = String.valueOf(teste.marcalanche5(arrayPull));
            precoLanche5 = String.valueOf(teste.precolanche5(arrayPull));
            quantidadeLanche5 = String.valueOf(teste.quantidadelanche5(arrayPull));

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
    //---------------------------------------------------------------------
    public Object pullLanche1(){
        Administrador administrador = new Administrador();
        return administrador.nomelanche1(arrayPull);
    }
}
