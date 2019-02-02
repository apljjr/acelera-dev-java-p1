package br.com.codenation.aceleradev.rec.loja.dao;

import br.com.codenation.aceleradev.rec.loja.entidades.Produto;

import java.util.List;

public interface GenericDAO<T extends Produto> {
    public void salvar(T t);
    public void update(T bean);
    public void delete(int id);
    public T getById(int id);
    public List<T> getAll();
}
