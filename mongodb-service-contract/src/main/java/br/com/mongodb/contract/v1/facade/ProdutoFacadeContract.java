package br.com.mongodb.contract.v1.facade;

import br.com.mongodb.contract.v1.binder.ProdutoBinder;
import br.com.mongodb.contract.v1.model.Produto;
import br.com.mongodb.service.ProdutoService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ProdutoFacadeContract {
    private ProdutoService produtoService;

    public void inserirProduto(Produto produto){
        produtoService.inserirProduto(ProdutoBinder.bindToModel(produto));
    }

    public Produto buscarProduto(Long codigo){
        return ProdutoBinder.bindTo(produtoService.buscarProduto(codigo));
    }

    public void deletarProduto(Long codigo){
        produtoService.deletarProduto(codigo);
    }
}