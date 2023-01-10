import database.Conexao;
import database.Funcionario;
import gui.*;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {

        // new TelaInicial();

        Funcionario funcionario = new Funcionario();
        try {
            funcionario.acrescentarLanche();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}