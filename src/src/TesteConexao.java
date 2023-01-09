import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TesteConexao {
    public static void main(String[] args) {
        try{
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Teste", "root", "Fam1l1a..");

            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("select * from cliente");

            while (resultSet.next()){
                System.out.println(resultSet.getString("nome"));
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
