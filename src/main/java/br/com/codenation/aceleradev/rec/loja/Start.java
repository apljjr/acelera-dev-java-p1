package br.com.codenation.aceleradev.rec.loja;
import br.com.codenation.aceleradev.rec.loja.dao.SoftwareDAO;
import br.com.codenation.aceleradev.rec.loja.test.UsuarioTest;

import java.sql.SQLException;
import java.util.Scanner;

public class Start {
    public static void main(String[] args) throws SQLException {

      SoftwareDAO dao = new SoftwareDAO();
      System.out.println(dao.getById(1));

    }
}
