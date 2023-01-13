package database;
import java.sql.*;

public class AdmLancheData {

    private String nome;
    private String marca;
    private int preco;
    private int quantidadeEstoque;
    private int idLache;


    //METODOS FUNCIONÁRIO
    public void adicionarLanche(int idLanche, String nome, String marca, int preco, int quantidadeEstoque) throws SQLException{
        Conexao conexao = new Conexao();
        this.nome = nome;
        this.marca = marca;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
        this.idLache = idLanche;

        String inserir = "insert into lanche(idlanche, nome, marca, preco, quantidadeEstoque) values (?, ?, ?, ?, ?)";
        try{
            PreparedStatement pstmt = conexao.getConexao().prepareStatement(inserir);
            pstmt.setInt(1, idLanche);
            pstmt.setString(2, nome);
            pstmt.setString(3, marca);
            pstmt.setInt(4, preco);
            pstmt.setInt(5,quantidadeEstoque);
            pstmt.executeUpdate();


            PreparedStatement statement = conexao.getConexao().prepareStatement("select * from lanche");

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
            conexao.getConexao().close();
        }
    }



    //MÉTODO QUANDO UM CLIENTE COMPRA UM PRODUTO (MÉTODO A SER ALTERADO!!!)
    public void editarQuantidade(int idLanche, int quantidadeEstoque) throws SQLException{
        Conexao conexao = new Conexao();
        String alterarQTD = "update lanche set quantidadeestoque=? where idlanche = ?";
        try {
            PreparedStatement pstmt = conexao.getConexao().prepareStatement(alterarQTD);
            pstmt.setInt(1, quantidadeEstoque);
            pstmt.setInt(2, idLanche);
            pstmt.executeUpdate();

            PreparedStatement statement = conexao.getConexao().prepareStatement("select * from lanche");

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
            conexao.getConexao().close();
        }
    }



    //MÉTODO DE QUANDO O ADM QUER REMOVER ALGUM LANCHE DA LISTA DE LANCHE
    public void removerLanche(int idLanche) throws SQLException{
        Conexao conexao = new Conexao();
        String apagarLanche = "DELETE FROM lanche WHERE idlanche=?";
        try {
            PreparedStatement pstmt = conexao.getConexao().prepareStatement(apagarLanche);
            pstmt.setInt(1, idLanche);
            pstmt.executeUpdate();

            PreparedStatement statement = conexao.getConexao().prepareStatement("select * from lanche");

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
            conexao.getConexao().close();
        }
    }



    //MÉTODO PARA O ADM ALTERAR ALGUMA INFORMAÇÃO PASSADA
    public void editarGeral(int idLanche,String nome, String marca, int preco, int quantidadeEstoque) throws SQLException{
        Conexao conexao = new Conexao();
        String editarGeral = "update lanche set nome=?, marca=?, preco=?, quantidadeEstoque=? where idlanche = ?";
        try {
            PreparedStatement pstmt = conexao.getConexao().prepareStatement(editarGeral);
            pstmt.setString(1, nome);
            pstmt.setString(2, marca);
            pstmt.setInt(3, preco);
            pstmt.setInt(4, quantidadeEstoque);
            pstmt.setInt(5, idLanche);

            pstmt.executeUpdate();

            PreparedStatement statement = conexao.getConexao().prepareStatement("select * from lanche");

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
            conexao.getConexao().close();
        }
    }
}

