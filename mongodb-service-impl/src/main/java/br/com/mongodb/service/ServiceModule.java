package br.com.mongodb.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceModule {

    @Bean
    public ProdutoService produtoService(){
        return new ProdutoService();
    }

//    @Bean
//    public ProdutoService produtoService(ProdutoData produtoData){
//        return new ProdutoService(produtoData);
//    }
}
