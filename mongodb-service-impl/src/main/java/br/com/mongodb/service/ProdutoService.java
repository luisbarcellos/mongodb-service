package br.com.mongodb.service;

import br.com.mongodb.database.ProdutoRepository;
import br.com.mongodb.model.ProdutoModel;
import br.com.mongodb.validator.ProdutoValidator;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ProdutoService {
    private ProdutoValidator produtoValidador;
    private ProdutoRepository produtoRepository;

    public void inserirProduto(ProdutoModel produtoModel){
        try {
            produtoRepository.save(produtoModel);
        }catch (Exception e){
            produtoValidador.validarErroProdutoRepetido(e.getMessage());
        }
    }

    public ProdutoModel buscarProduto(Long codigo){
        return produtoValidador.validarProdutoExiste(produtoRepository.findFirstByCodigo(codigo));
    }

    public void deletarProduto(Long codigo){
        produtoRepository.delete(buscarProduto(codigo));
    }

    public void atualizarProduto(ProdutoModel produtoModel){
        produtoModel.setId(buscarIdDoProduto(produtoModel.getCodigo()));
        produtoRepository.save(produtoModel);
    }

    private String buscarIdDoProduto(Long codigo){
        return buscarProduto(codigo).getId();
    }
}