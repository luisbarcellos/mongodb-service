package br.com.mongodb.contract.v1.stub;

import br.com.mongodb.contract.v1.model.Produto;

public class ProdutoStub {
    public static Produto getProduto(){
        return Produto.builder()
                .codigo(21332L)
                .nome("Teste")
                .quantidade(2)
                .build();
    }
}