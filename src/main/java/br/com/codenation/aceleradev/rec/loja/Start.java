package br.com.codenation.aceleradev.rec.loja;

import br.com.codenation.aceleradev.rec.loja.connection.ConnectionFactory;

import java.sql.Connection;
import java.sql.SQLException;

public class Start {
    public static void main(String[] args) throws SQLException {
        Connection conexao = new ConnectionFactory().getConnection();
        System.out.println("Conectado!");
        conexao.close();
    }

}
