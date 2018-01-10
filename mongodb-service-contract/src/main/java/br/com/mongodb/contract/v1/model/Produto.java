package br.com.mongodb.contract.v1.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Produto {
    private Long codigo;
    private String nome;
    private Integer quantidade;
}