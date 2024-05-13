package rdias.services;

import rdias.dao.IProdutoDAO;
import rdias.domain.Produto;
import rdias.services.generics.GenericService;

public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

    public ProdutoService(IProdutoDAO dao) {
        super(dao);
    }

    @Override
    public void excluir(String valor) {

    }

    @Override
    public Produto consultar(String valor) {
        return null;
    }

    @Override
    public Produto consultar(Long valor) {
        return null;
    }
}
