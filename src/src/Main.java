import core.Administrador;
import core.Funcionario;
import database.FuncionarioData;
import gui.*;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario();

        FuncionarioData funcionario = new FuncionarioData();
        Administrador adm = new Administrador();
        try {
            funcionario.pullLanches();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        new TelaInicial();
        System.out.println(funcionario.nomeLanche1);


//        //new LancheADM();
//        //new crudADM();
//

}
}