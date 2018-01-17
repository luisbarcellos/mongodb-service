package br.com.mongodb.contract.v1.put;

import br.com.mongodb.contract.v1.ProdutoController;
import br.com.mongodb.contract.v1.stub.ProdutoStub;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringJUnit4ClassRunner.class)
@WebMvcTest(ProdutoController.class)
public class ProdutoControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @MockBean
    private ProdutoController produtoController;

    @Test
    public void atualizarProdutoSucesso() throws Exception{
        String json  = objectMapper.writeValueAsString(ProdutoStub.getProduto());

        this.mockMvc.perform(put("/produto")
                    .contentType(MediaType.APPLICATION_JSON)
                    .content(json))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(status().is(200));
    }

    @Test
    public void atualizarProdutoSemCodigo() throws Exception{
        String json  = objectMapper.writeValueAsString(ProdutoStub.getProdutoSemCodigo());

        this.mockMvc.perform(put("/produto")
                    .contentType(MediaType.APPLICATION_JSON)
                    .content(json))
                .andDo(print())
                .andExpect(status().isBadRequest())
                .andExpect(status().is(400));
    }
}