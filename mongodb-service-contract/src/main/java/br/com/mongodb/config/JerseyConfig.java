package br.com.mongodb.config;



import br.com.mongodb.contract.v1.RestEndpoint;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import javax.ws.rs.ApplicationPath;

@Component
@ApplicationPath("mongodb")
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig(){
        super();
        register(RestEndpoint.class);
        packages("io.swagger.jaxrs.json");
        register(io.swagger.jaxrs.listing.ApiListingResource.class);
        register(io.swagger.jaxrs.listing.SwaggerSerializers.class);
    }
}