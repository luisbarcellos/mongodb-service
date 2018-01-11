package br.com.mongodb.contract.v1.facade;

import br.com.mongodb.contract.v1.model.ProdutoContract;
import br.com.mongodb.service.ProdutoService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ProdutoFacadeContract {
    private ProdutoService produtoService;

    public void inserirProduto(ProdutoContract produtoContract){
//        produtoService.inserirProduto(ProdutoBinder.bindToModel(produtoContract));
    }

    public ProdutoContract buscarProduto(Long codigo){
//        return ProdutoBinder.bindTo(produtoService.buscarProduto(codigo));
        return null;
    }
}