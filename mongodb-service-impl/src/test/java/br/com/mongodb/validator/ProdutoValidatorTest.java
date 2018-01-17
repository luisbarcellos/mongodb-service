package br.com.mongodb.validator;

import br.com.mongodb.exception.ProdutoNotFoundException;
import br.com.mongodb.exception.ProdutoRepetidoException;
import br.com.mongodb.stub.ProdutoModelStub;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class ProdutoValidatorTest {
    @InjectMocks
    private ProdutoValidator produtoValidator;

    @Test(expected = ProdutoNotFoundException.class)
    public void deveValidarSeProdutoExisteERetornarExceptionNotFound(){
        produtoValidator.validarProdutoExiste(null);
    }

    @Test
    public void deveValidarSeProdutoExisteRetornoSucesso(){
        assertEquals(ProdutoModelStub.getProdutoModel(),
                     produtoValidator.validarProdutoExiste(ProdutoModelStub.getProdutoModel()));
    }

    @Test(expected = ProdutoRepetidoException.class)
    public void validarErroProdutoRepetido(){
        produtoValidator.validarErroProdutoRepetido("11000");
    }
}