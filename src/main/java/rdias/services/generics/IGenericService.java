package rdias.services.generics;

import rdias.domain.Persistente;
import rdias.exceptions.TipoChaveNaoEncontradaException;

import java.io.Serializable;
import java.util.Collection;

public interface IGenericService <T extends Persistente, E extends Serializable> {

    public Boolean cadastrar(T entity) throws TipoChaveNaoEncontradaException;

    public void excluir(E valor);

    void excluir(Long valor);

    public void alterar(T entity) throws TipoChaveNaoEncontradaException;


    public T consultar(E valor);


    T consultar(Long valor);

    public Collection<T> buscarTodos();

}