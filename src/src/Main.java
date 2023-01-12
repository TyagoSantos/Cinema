import database.AdmFilmesData;
import database.AdmLancheData;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {

        //new TelaInicial();
        //AdmFilmesData admFilmesData = new AdmFilmesData();
            AdmLancheData admLancheData = new AdmLancheData();
        try {
            admLancheData.editarLanche(5,4);
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}