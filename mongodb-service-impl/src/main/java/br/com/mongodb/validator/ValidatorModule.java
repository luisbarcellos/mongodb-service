package br.com.mongodb.validator;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ValidatorModule {

    @Bean
    public ProdutoValidator produtoFacade(){
        return new ProdutoValidator();
    }
}
