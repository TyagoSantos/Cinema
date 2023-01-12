package database;
import java.sql.*;

public class FuncionarioData {

    private String severname = "localhost:3306";
    private String mydatabase = "cineif"; //colocar o nome idêntico do que esta na máquina local do MySQL//
    private String url = "jdbc:mysql://" + severname + "/" + mydatabase;
    private String userName = "root";
    private String passWord = "sua senha"; //colocar a senha que foi criada na máquina local do MySQL//
    private Connection conexao = null;

    private String nome;
    private String marca;
    private int preco;
    private int quantidadeEstoque;
    private int idLache;




    //METODOS FUNCIONÁRIO
    public void adicionarLanche(int idLanche, String nome, String marca, int preco, int quantidadeEstoque) throws SQLException{
        this.nome = nome;
        this.marca = marca;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
        this.idLache = idLanche;


        String inserir = "insert into lanche(idlanche, nome, marca, preco, quantidadeEstoque) values (?, ?, ?, ?, ?)";
        try{
            conexao = DriverManager.getConnection(url, userName, passWord);


            PreparedStatement pstmt = conexao.prepareStatement(inserir);
            pstmt.setInt(1, idLanche);
            pstmt.setString(2, nome);
            pstmt.setString(3, marca);
            pstmt.setInt(4, preco);
            pstmt.setInt(5,quantidadeEstoque);
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
}

