import database.Conexao;
import gui.*;
public class Main {

    public static void main(String[] args) {

        // new TelaInicial();
        Conexao conexao = new Conexao();
        conexao.verTabela();
    }

}