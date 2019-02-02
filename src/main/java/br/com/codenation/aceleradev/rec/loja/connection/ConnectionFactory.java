package br.com.codenation.aceleradev.rec.loja.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    private static ConnectionFactory ourInstance = new ConnectionFactory();

    private static final String url = "jdbc:mysql://db4free.net:3306/adminproj";
    private static final String user = "adminproj";
    private static final String pass = "FSFU06hq";


    private ConnectionFactory() {
    }


    public Connection getConnection() {
        try {
            return DriverManager.getConnection(
                    url, user, pass);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static ConnectionFactory getInstance() {
        return ourInstance;
    }

}
