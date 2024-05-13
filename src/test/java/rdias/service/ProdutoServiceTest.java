package rdias.service;

import rdias.dao.IProdutoDAO;
import rdias.dao.ProdutoDaoMock;
import rdias.domain.Produto;
import rdias.exceptions.TipoChaveNaoEncontradaException;
import rdias.services.IProdutoService;
import rdias.services.ProdutoService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

public class ProdutoServiceTest {

    private IProdutoService produtoService;

    private Produto produto;

    public ProdutoServiceTest() {
        IProdutoDAO dao = new ProdutoDaoMock();
        produtoService = new ProdutoService(dao);
    }

    @Before
    public void init() {
        produto = new Produto();
        produto.setCodigo("A1");
        produto.setDescricao("Produto 1");
        produto.setNome("Produto 1");
        produto.setValor(BigDecimal.TEN);
    }

    @Test
    public void pesquisar() {
        Produto produtor = this.produtoService.consultar(produto.getCodigo());
        Assert.assertNotNull(produtor);
    }

    @Test
    public void salvar() throws TipoChaveNaoEncontradaException {
        Boolean retorno = produtoService.cadastrar(produto);
        Assert.assertTrue(retorno);
    }

    @Test
    public void excluir() {
        produtoService.excluir(produto.getCodigo());
    }

    @Test
    public void alterarCliente() throws TipoChaveNaoEncontradaException {
        produto.setNome("Ronaldo Dias");
        produtoService.alterar(produto);

        Assert.assertEquals("Ronaldo Dias", produto.getNome());
    }
}
