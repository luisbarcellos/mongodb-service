package br.com.mongodb.database;

import br.com.mongodb.model.ProdutoModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends MongoRepository<ProdutoModel, Long> {
    ProdutoModel findFirstByCodigo(Long codigo);
}