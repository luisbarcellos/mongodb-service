package br.com.mongodb.contract.v1.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProdutoContract {
    private Long codigo;
//    private String nome;
//    private Integer quantidade;
}