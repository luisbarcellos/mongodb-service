package br.com.mongodb.contract.v1.facade;

import br.com.mongodb.service.ProdutoService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FacadeContractModule {
    @Bean
    public ProdutoFacadeContract produtoFacadeContract(ProdutoService produtoService){
        return new ProdutoFacadeContract(produtoService);
    }
}
