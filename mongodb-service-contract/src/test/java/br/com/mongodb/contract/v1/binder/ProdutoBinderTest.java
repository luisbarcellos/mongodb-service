package br.com.mongodb.contract.v1.binder;

import br.com.mongodb.contract.v1.stub.ProdutoModelStub;
import br.com.mongodb.contract.v1.stub.ProdutoStub;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ProdutoBinderTest {
    @Test
    public void bindToModelTest(){
        assertEquals(ProdutoModelStub.getProdutoModel(),
                ProdutoBinder.bindToModel(ProdutoStub.getProduto()));
    }

    @Test
    public void bindToTest(){
        assertEquals(ProdutoStub.getProduto(),
                ProdutoBinder.bindTo(ProdutoModelStub.getProdutoModel()));
    }
}