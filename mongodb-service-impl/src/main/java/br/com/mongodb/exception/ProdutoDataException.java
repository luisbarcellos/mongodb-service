package br.com.mongodb.exception;

import com.mongodb.MongoException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class ProdutoDataException extends MongoException {

    public ProdutoDataException() {
        super("Falha ao inserir produto.");
    }
}