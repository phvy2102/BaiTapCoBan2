package connect;

import java.sql.*;

public class JDBCConnection {

        public static Connection getJDBCConnection() {
                final String url = "jdbc:sqlserver://PHUONGVY\\SQLEXPRESS:1433;databaseName = BANHANG";
                final String userName = "sa";
                final String password = "123456";

                try {
                        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                        return DriverManager.getConnection(url, userName, password);
                } catch (ClassNotFoundException | SQLException e) {
                        e.printStackTrace();
                }

                return null;
        }
}
