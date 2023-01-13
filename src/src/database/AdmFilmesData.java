package database;
import database.Conexao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.format.DateTimeFormatterBuilder;

public class AdmFilmesData {
    private String nome;
    private String cartaz;
    private String trailer;
    private String sinopse;
    private String diretor;
    private int duracao;
    private String genero;
    private String anoLancamento;
    private int classificacaoIndicativa;

    public void adicionarFilme(String nome, String cartaz, String trailer, String sinopse, String diretor,
                               int duracao, String genero, String anoLancamento, int classificacaoIndicativa) throws SQLException{
        this.nome = nome;
        this.cartaz = cartaz;
        this.trailer = trailer;
        this.sinopse = sinopse;
        this.diretor = diretor;
        this.duracao = duracao;
        this.genero = genero;
        this.anoLancamento = anoLancamento;
        this.classificacaoIndicativa = classificacaoIndicativa;

        Conexao conexao = new Conexao();

        String inserir = "insert into filme(nome, cartaz, trailer, sinopse, diretor, duracao, " +
                "genero, anoLancamento, classificacaoIndicativa) values (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try{
            PreparedStatement pstmt = conexao.getConexao().prepareStatement(inserir);
            pstmt.setString(1, nome);
            pstmt.setString(2, cartaz);
            pstmt.setString(3, trailer);
            pstmt.setString(4, sinopse);
            pstmt.setString(5,diretor);
            pstmt.setInt(6, duracao);
            pstmt.setString(7, genero);
            pstmt.setString(8,anoLancamento);
            pstmt.setInt(9, classificacaoIndicativa);
            pstmt.executeUpdate();


            PreparedStatement statement = conexao.getConexao().prepareStatement("select * from filme");

            ResultSet rs = statement.executeQuery();
            while(rs.next()){
                System.out.println(rs.getString("nome"));
                System.out.println(rs.getString("cartaz"));
                System.out.println(rs.getString("trailer"));
                System.out.println(rs.getString("sinopse"));
                System.out.println(rs.getString("duracao"));
                System.out.println(rs.getString("genero"));
                System.out.println(rs.getString("anoLancamento"));
                System.out.println(rs.getString("classificacaoIndicativa"));

            }
        }
        catch(SQLException e){
            e.printStackTrace();
        } finally {
            conexao.getConexao().close();
        }

    }
}
