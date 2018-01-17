package br.com.mongodb.contract.v1.post;

import br.com.mongodb.contract.v1.ProdutoController;
import br.com.mongodb.contract.v1.model.Produto;
import br.com.mongodb.contract.v1.stub.ProdutoStub;
import br.com.mongodb.exception.ProdutoNotFoundException;
import br.com.mongodb.exception.ProdutoRepetidoException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
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
    public void inserirProdutoSucesso() throws Exception{
        String json  = objectMapper.writeValueAsString(ProdutoStub.getProduto());

        this.mockMvc.perform(post("/produto")
                    .contentType(MediaType.APPLICATION_JSON)
                    .content(json))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(status().is(200));
    }

    @Test
    public void inserirProdutoSemCodigo() throws Exception{
        String json  = objectMapper.writeValueAsString(ProdutoStub.getProdutoSemCodigo());

        this.mockMvc.perform(post("/produto")
                    .contentType(MediaType.APPLICATION_JSON)
                    .content(json))
                .andDo(print())
                .andExpect(status().isBadRequest())
                .andExpect(status().is(400));
    }
}