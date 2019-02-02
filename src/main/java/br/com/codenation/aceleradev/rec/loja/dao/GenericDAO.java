package br.com.codenation.aceleradev.rec.loja.dao;

import java.util.List;

public interface GenericDAO<T> {
    public void salvar(T bean);
    public void upate(T bean);
    public void delete(int id);
    public T getById(int id);
    public List<T> getAll();
}
