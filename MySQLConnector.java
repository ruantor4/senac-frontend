import java.sql.*;

public class MySQLConnector {
    public static Connection conectar() throws Exception {
        String mysqlHost = "127.0.0.1";
        String mysqlDb = "login";
        String mysqlUser = "root";
        String mysqlPassword = "torquatop5w";
        String mysqlPort = "3306";
        String mysqlUrl = "jdbc:mysql://" + mysqlHost + ":" + mysqlPort + "/" + mysqlDb + "?user=" + mysqlUser + "&password=" + mysqlPassword;
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            conn = DriverManager.getConnection(mysqlUrl);
            // System.out.println("Conexão realizada com sucesso!");
        } catch (Exception e) {
            System.err.println("Ops! Algo de errado não está certo com a conexão com o banco de dados MySQL! Mensagem do servidor: " + e);
        }
        return conn;
    }
}
