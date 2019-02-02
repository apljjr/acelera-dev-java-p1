package br.com.codenation.aceleradev.rec.loja.dao;

import br.com.codenation.aceleradev.rec.loja.connection.ConnectionFactory;
import br.com.codenation.aceleradev.rec.loja.entidades.Software;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class SoftwareDAO implements GenericDAO<Software> {

    private Connection connection = new ConnectionFactory().getConnection();

    @Override
    public void salvar(Software software) {

      String query = "INSERT INTO produto (id, descricao, preco, qtd_estoque, categoria, versao, requisitos)" +
          " VALUES (?, ?, ?, ?, ?, ?, ?)";

      try (PreparedStatement stmt = connection.prepareStatement(query)) {

        stmt.setLong(1, software.getId());
        stmt.setString(2, software.getDescricao());
        stmt.setDouble(3, software.getPreco());
        stmt.setInt(4, software.getQtdEstoque());
        stmt.setInt(5, software.getCategoria());
        stmt.setString(6, software.getVersao());
        stmt.setString(7, software.getRequisitoSistema());

        stmt.execute();

      } catch (SQLException e) {
        throw new RuntimeException("Erro ao salvar produto", e);
      }

    }

    @Override
    public void update(Software software) {

      String query = "UPDATE produto SET descricao=?, preco=?, qtd_estoque=?, categoria=?," +
          " versao=?, requisitos=? WHERE id = ?";

      try (PreparedStatement stmt = connection.prepareStatement(query)) {

        stmt.setString(1, software.getDescricao());
        stmt.setDouble(2, software.getPreco());
        stmt.setInt(3, software.getQtdEstoque());
        stmt.setInt(4, software.getCategoria());
        stmt.setString(5, software.getVersao());
        stmt.setString(6, software.getRequisitoSistema());
        stmt.setLong(7, software.getId());

        stmt.execute();

      } catch (SQLException e) {
        throw new RuntimeException("Erro ao editar produto", e);
      }

    }

    @Override
    public void delete(int id) {

      String query = "DELETE FROM produto WHERE id = ?";

      try (PreparedStatement stmt = connection.prepareStatement(query)) {

        stmt.setInt(1, id);
        stmt.execute();

      } catch (SQLException e) {
        throw new RuntimeException("Erro ao excluir produto", e);
      }

    }

    @Override
    public Software getById(int id) {

      String query = "select * from produto where id = ?";

      try (PreparedStatement stmt = connection.prepareStatement(query)) {

        stmt.setInt(1, id);
        ResultSet rs = stmt.executeQuery();
        rs.next();

        return this.resultSetToSoftware(rs);

      } catch (SQLException e) {
        throw new RuntimeException("Erro ao recuperar produto", e);
      }

    }

    @Override
    public List<Software> getAll() {

        String query = "select * from produto";

        List<Software> softwares = new ArrayList<>();

        try (
            PreparedStatement stmt = connection.prepareStatement(query);
            ResultSet rs = stmt.executeQuery()
        ) {
            while (rs.next()) {

                softwares.add(this.resultSetToSoftware(rs));

            }

        } catch (SQLException e) {
            throw new RuntimeException("Erro ao recuperar produtos", e);
        }

        return softwares;
    }

    private Software resultSetToSoftware(ResultSet rs) {

      Software software = new Software();

      try {

        software.setId(rs.getLong("id"));
        software.setCategoria(rs.getInt("categoria"));
        software.setDescricao(rs.getString("descricao"));
        software.setPreco(rs.getDouble("preco"));
        software.setQtdEstoque(rs.getInt("qtd_estoque"));
        software.setVersao(rs.getString("versao"));
        software.setRequisitoSistema(rs.getString("requisitos"));

        return software;

      } catch (SQLException e) {
        throw new RuntimeException("Erro ao extrair produto", e);
      }

    }

}
