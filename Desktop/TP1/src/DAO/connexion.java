package DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connexion {
    public static final String url = "jdbc:mysql://localhost:3306/g_employe";
    public static final String user = "root";
    public static final String password = "";
    private static Connection conn = null;

    public static Connection getConnexion() {
        if (conn == null) { 
            try {
                conn = DriverManager.getConnection(url, user, password);
                System.out.println("Connexion établie avec succès !");
            } catch (SQLException e) {
                System.out.println("Erreur de connexion !!!!!");
               
            }
        }
        return conn;
    }
    
    public static void closeConnexion() {
        if (conn != null) {
            try {
                conn.close();
                conn = null; 
                System.out.println("Connexion fermée avec succès !");
            } catch (SQLException e) {
                System.out.println("Erreur lors de la fermeture de la connexion !!!!!");
                
            }
        }
    }
}