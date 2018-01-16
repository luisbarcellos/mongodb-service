package br.com.mongodb.contract.v1.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Produto {
    @NotNull(message = "Código do produto é obrigatório.")
    private Long codigo;
    private String nome;
    private Integer quantidade;
}