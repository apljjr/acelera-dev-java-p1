package br.com.codenation.aceleradev.rec.loja.test;

import br.com.codenation.aceleradev.rec.loja.dao.UsuarioDAO;
import br.com.codenation.aceleradev.rec.loja.entidades.Usuario;

public class UsuarioTest {
    public static void getUsuarioById(){
        UsuarioDAO userDAO = new UsuarioDAO();
        Usuario user =userDAO.getById(1);
        if(user!=null){
            System.out.println(((Usuario) user).getNome());
        }
    }
}
