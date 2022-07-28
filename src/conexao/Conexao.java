package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Conexao {
    
    private static String url = "jdbc:mysql://localhost:3306/projeto_integrador";
    private static String user = "root";
    private static String pass = "";
    
    public static Connection getConexao() throws SQLException{

        Connection c = null;
        try {
            c = DriverManager.getConnection(url, user, pass);
        } catch (SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }
  
        return c;
    }
}
