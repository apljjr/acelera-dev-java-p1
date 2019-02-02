package br.com.codenation.aceleradev.rec.loja.test;

import br.com.codenation.aceleradev.rec.loja.dao.UsuarioDAO;
import br.com.codenation.aceleradev.rec.loja.entidades.Usuario;

public class UsuarioTest {
    public static void getUsuarioByCpf(){
        UsuarioDAO userDAO = new UsuarioDAO();
        Usuario user =userDAO.getByCPF("23521765733");
        if(user!=null){
            System.out.println(user.getCpf().equals("23521765733"));
        }
    }
}
