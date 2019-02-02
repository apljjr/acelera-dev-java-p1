package br.com.codenation.aceleradev.rec.loja.service;

import br.com.codenation.aceleradev.rec.loja.dao.UsuarioDAO;
import br.com.codenation.aceleradev.rec.loja.entidades.Usuario;
import br.com.codenation.aceleradev.rec.loja.exception.UsuarioInvalidoException;
import br.com.codenation.aceleradev.rec.loja.vo.Response;

public class UsuarioService {


    public Response login(String cpf) {
        //
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        Usuario usuario = usuarioDAO.getByCPF(cpf);

        if (usuario != null) {
            return new Response(usuario.getNome(), true);
        } else {
            throw new UsuarioInvalidoException("Desculpe, vamos tentar novamente...");
        }
    }
}
