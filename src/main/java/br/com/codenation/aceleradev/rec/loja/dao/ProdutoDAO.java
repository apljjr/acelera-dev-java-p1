package br.com.codenation.aceleradev.rec.loja.dao;

import br.com.codenation.aceleradev.rec.loja.connection.ConnectionFactory;
import br.com.codenation.aceleradev.rec.loja.entidades.Produto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class ProdutoDAO implements GenericDAO<Produto> {

    private Connection connection = new ConnectionFactory().getConnection();

    @Override
    public void salvar(Produto bean) {

    }

    @Override
    public void upate(Produto bean) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public Produto getById(int id) {
        return null;
    }

    @Override
    public List<Produto> getAll() {

        ResultSet rs = null;
        PreparedStatement stmt = null;

        List<Produto> produtos = new ArrayList<>();

        try{
            stmt = connection.prepareStatement("select * from produto");
            rs = stmt.executeQuery();
            Produto produto;
            while (rs.next()) {

                produto = new Produto();

                produto.setId(rs.getLong("id"));
                produto.setCategoria(rs.getInt("categoria"));
                produto.setDescricao(rs.getString("descricao"));
                produto.setPreco(rs.getDouble("preco"));
                produto.setQtdEstoque(rs.getInt("qtd_estoque"));

                produtos.add(produto);

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
        return produtos;
    }
}
