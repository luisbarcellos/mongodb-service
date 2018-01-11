package br.com.mongodb.contract.v1;

import br.com.mongodb.contract.v1.facade.ProdutoFacadeContract;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/produto")
public class ProdutoController {
    @Autowired
    private ProdutoFacadeContract produtoFacadeContract;

//    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
//    @ResponseBody
//    @CrossOrigin(origins = "*")
//    public ProdutoContract buscarProduto(@ApiParam(value = "Codigo do produto.", required = true)
//                                 @PathVariable("codigo") Long codigo) {
//        return produtoFacadeContract.buscarProduto(codigo);
//    }
}
