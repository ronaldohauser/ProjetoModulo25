package rdias.dao;

import rdias.domain.Produto;
import rdias.exceptions.TipoChaveNaoEncontradaException;

import java.util.Collection;

public class ProdutoDaoMock implements IProdutoDAO  {
    @Override
    public Boolean cadastrar(Produto entity) throws TipoChaveNaoEncontradaException, TipoChaveNaoEncontradaException, TipoChaveNaoEncontradaException {
        return true;
    }

    @Override
    public void excluir(Long valor) {

    }

    @Override
    public void excluir(String valor) {

    }

    @Override
    public void alterar(Produto entity) throws TipoChaveNaoEncontradaException {

    }

    @Override
    public Produto consultar(String valor) {
        Produto produto = new Produto();
        produto.setCodigo(valor);
        return produto;
    }

    @Override
    public Collection<Produto> buscarTodos() {
        return null;
    }
}
