package br.com.mongodb.config;

import io.swagger.jaxrs.config.BeanConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    @Bean
    public BeanConfig beanConfig() {
        BeanConfig beanConfig = new BeanConfig();
        beanConfig.setTitle("Documentação do serviço mongo db");
        beanConfig.setVersion("1.0.0");
        beanConfig.setBasePath("/mongodb");
        beanConfig.setResourcePackage("br.com.mongodb.contract");
        beanConfig.setScan(true);
        return beanConfig;
    }
}