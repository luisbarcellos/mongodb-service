package br.com.mongodb.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(collection = "produto")
public class ProdutoModel {
    @Id
    private String id;
    @Indexed(unique = true)
    private Long codigo;
    private String nome;
    private Integer quantidade;
}