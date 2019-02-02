package br.com.codenation.aceleradev.rec.loja;
import br.com.codenation.aceleradev.rec.loja.dao.SoftwareDAO;
import br.com.codenation.aceleradev.rec.loja.entidades.Software;

import java.sql.SQLException;

public class Start {
    public static void main(String[] args) throws SQLException {

        SoftwareDAO dao = new SoftwareDAO();

        Software s = new Software();


        s.setId(100);
        s.setCategoria(1);
        s.setDescricao("Descricao EDITADA");
        s.setQtdEstoque(34);
        s.setPreco(324.0);
        s.setVersao("123");
        s.setRequisitoSistema("Requisitos NOVO");

        //dao.update(s);
        dao.delete(100);

        System.out.println(dao.getAll());

    }
}
