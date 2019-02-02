package br.com.codenation.aceleradev.rec.loja.dao;

import java.util.List;

public interface GenericDAO<T> {
    public void salvar(T t);
    public void update(T bean);
    public void delete(int id);
    public T getById(int id);
    public List<T> getAll();
}
