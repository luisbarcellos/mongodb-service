package br.com.mongodb.exception;

import com.mongodb.MongoException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ProdutoRepetidoException extends MongoException {

    public ProdutoRepetidoException() {
        super("Produto já cadastrado.");
    }
}