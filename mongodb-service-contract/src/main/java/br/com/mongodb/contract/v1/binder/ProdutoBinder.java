package br.com.mongodb.contract.v1.binder;

import br.com.mongodb.contract.v1.model.Produto;
import br.com.mongodb.model.ProdutoModel;

public class ProdutoBinder {
    public static ProdutoModel bindToModel(Produto produto){
        return ProdutoModel.builder()
                .codigo(produto.getCodigo())
                .nome(produto.getNome())
                .quantidade(produto.getQuantidade())
                .build();
    }

    public static Produto bindTo(ProdutoModel produtoModel){
        return Produto.builder()
                .codigo(produtoModel.getCodigo())
                .nome(produtoModel.getNome())
                .quantidade(produtoModel.getQuantidade())
                .build();
    }
}
