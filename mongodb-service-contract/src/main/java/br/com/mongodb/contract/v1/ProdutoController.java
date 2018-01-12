package br.com.mongodb.contract.v1;

import br.com.mongodb.contract.v1.facade.ProdutoFacadeContract;
import br.com.mongodb.contract.v1.model.Produto;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/produto")
public class ProdutoController {
    @Autowired
    private ProdutoFacadeContract produtoFacadeContract;

    @RequestMapping(method = RequestMethod.POST, value = "")
    @ResponseBody
    @CrossOrigin(origins = "*")
    public void inserirProduto(@RequestBody Produto produto) {
        produtoFacadeContract.inserirProduto(produto);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{codigo}")
    @ResponseBody
    @CrossOrigin(origins = "*")
    public Produto buscarProduto(@ApiParam(value = "Codigo do produto.", required = true)
                                 @PathVariable("codigo") Long codigo) {
        return produtoFacadeContract.buscarProduto(codigo);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{codigo}")
    @ResponseBody
    @CrossOrigin(origins = "*")
    public void deletarProduto(@ApiParam(value = "Codigo do produto.", required = true)
                               @PathVariable("codigo") Long codigo) {
        produtoFacadeContract.deletarProduto(codigo);
    }
}