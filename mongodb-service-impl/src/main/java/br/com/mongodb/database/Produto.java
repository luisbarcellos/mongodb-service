package br.com.mongodb.database;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(collection = "produto")
public class Produto {
    @Id
    private String id;

    private String nome;









//    private Long codigo;
//
//    private String nome;
//    private Integer quantidade;

}
