package br.com.mongodb.validator;

import br.com.mongodb.exception.ProdutoDataException;
import br.com.mongodb.exception.ProdutoNotFoundException;
import br.com.mongodb.exception.ProdutoRepetidoException;
import br.com.mongodb.model.ProdutoModel;

import java.util.Optional;

public class ProdutoValidator {
    private static final String ERROR_DUPLICATE_KEY = "11000";

    public ProdutoModel validarProdutoExiste(ProdutoModel produtoModel){
        return Optional.ofNullable(produtoModel).orElseThrow(ProdutoNotFoundException::new);
    }

    public void validarErroProdutoRepetido(String erro){
        if(erro.contains(ERROR_DUPLICATE_KEY))
            throw new ProdutoRepetidoException();
        throw new ProdutoDataException();
    }
}