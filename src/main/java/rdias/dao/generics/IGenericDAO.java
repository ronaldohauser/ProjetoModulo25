package rdias.dao.generics;

import rdias.domain.Persistente;
import rdias.exceptions.TipoChaveNaoEncontradaException;

import java.io.Serializable;
import java.util.Collection;


public interface IGenericDAO <T extends Persistente, E extends Serializable> {
    public Boolean cadastrar(T entity) throws TipoChaveNaoEncontradaException, TipoChaveNaoEncontradaException, TipoChaveNaoEncontradaException;

    public void excluir(Long valor);

    void excluir(String valor);

    public void alterar(T entity) throws TipoChaveNaoEncontradaException;

    public T consultar(E valor);

    public Collection<T> buscarTodos();
}