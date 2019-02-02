package br.com.codenation.aceleradev.rec.loja.dao;

import br.com.codenation.aceleradev.rec.loja.connection.ConnectionFactory;
import br.com.codenation.aceleradev.rec.loja.entidades.Usuario;
import br.com.codenation.aceleradev.rec.loja.exception.UsuarioInvalidoException;
import br.com.codenation.aceleradev.rec.loja.util.SQL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


public class UsuarioDAO implements GenericDAO<Usuario> {

    private Connection connection = ConnectionFactory.getInstance();

    @Override
    public void salvar(Usuario bean) {

    }

    @Override
    public void update(Usuario bean) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public Usuario getById(int id) throws UsuarioInvalidoException {
        return null;
    }

    public Usuario getByCPF(String cpf) {
        ResultSet rs = null;
        PreparedStatement stmt = null;
        Usuario usuario = null;

        try {
            stmt = connection.prepareStatement(SQL.SELECT_USUARIO_CPF);
            stmt.setString(1, cpf);
            rs = stmt.executeQuery();

            if (rs.next()) {
                usuario = new Usuario();
                usuario.setNome(rs.getString("nome"));
                usuario.setCpf(rs.getString("cpf"));
                usuario.setId(rs.getLong("id"));
            }else{
                throw new UsuarioInvalidoException();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        return usuario;
    }

    @Override
    public List<Usuario> getAll() {
        return null;
    }

}
