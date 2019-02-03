package br.com.codenation.aceleradev.rec.loja.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    private static Connection ourInstance;

    private static final String url = "jdbc:mysql://db4free.net:3306/adminproj";
    private static final String user = "adminproj";
    private static final String pass = "FSFU06hq";


    private ConnectionFactory() {
    
    }


    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(url, user, pass);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static Connection getInstance() {

        if (ourInstance == null) {
            ourInstance = getConnection();
        }

        return ourInstance;
    }

}
