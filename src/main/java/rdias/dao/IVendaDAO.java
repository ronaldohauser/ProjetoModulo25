package rdias.dao;

import rdias.dao.generics.IGenericDAO;
import rdias.domain.Venda;
import rdias.exceptions.TipoChaveNaoEncontradaException;

public interface IVendaDAO extends IGenericDAO<Venda, String> {

    void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException;
}