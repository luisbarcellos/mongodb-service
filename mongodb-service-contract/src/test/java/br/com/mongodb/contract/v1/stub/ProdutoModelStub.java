package br.com.mongodb.contract.v1.stub;

import br.com.mongodb.model.ProdutoModel;

public class ProdutoModelStub {
    public static ProdutoModel getProdutoModel(){
        return ProdutoModel.builder()
                .codigo(21332L)
                .nome("Teste")
                .quantidade(2)
                .build();
    }
}