package br.com.codenation.aceleradev.rec.loja.dao;

import br.com.codenation.aceleradev.rec.loja.connection.ConnectionFactory;
import br.com.codenation.aceleradev.rec.loja.entidades.Usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


public class UsuarioDAO implements GenericDAO<Usuario> {

    private Connection connection = ConnectionFactory.getInstance().getConnection();

    @Override
    public void salvar(Usuario bean) {

    }

    @Override
    public void upate(Usuario bean) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public Usuario getById(int id) {
        ResultSet rs = null;
        PreparedStatement stmt = null;

        Usuario result = new Usuario();

        try{
            stmt = connection.prepareStatement("select * from usuario where cpf=?");
            stmt.setInt(0,id);
            rs = stmt.executeQuery();
            Usuario usuario;
            while (rs.next()) {
                usuario = new Usuario();
                usuario.setNome(rs.getString("nome"));
                usuario.setCpf(rs.getString("cpf"));
                usuario.setId(rs.getLong("id"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if(rs != null){
                try {
                    rs.close();
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        return result;
    }

    @Override
    public List<Usuario> getAll() {
        return null;
    }
}
