package br.com.mongodb.service;

import br.com.mongodb.database.ProdutoRepository;
import br.com.mongodb.validator.ProdutoValidator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceModule {

    @Bean
    public ProdutoService produtoService(ProdutoValidator produtoFacade, ProdutoRepository produtoRepository){
        return new ProdutoService(produtoFacade, produtoRepository);
    }
}
