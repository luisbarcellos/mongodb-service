package br.com.mongodb.contract.v1;

import br.com.mongodb.contract.v1.facade.ProdutoFacadeContract;
import br.com.mongodb.contract.v1.model.Produto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/v1")
@Api(tags = "v1")

public class RestEndpoint {
    @Autowired
    private ProdutoFacadeContract produtoFacadeContract;

    @POST
    @Path("/mongodb/pedido")
    @Produces(MediaType.APPLICATION_JSON)
    @ApiOperation(value = "Inserir pedido.")
    public Response inserirPedido(Produto produto){
        produtoFacadeContract.inserirProduto(produto);
        return Response.status(Response.Status.OK).build();
    }
}