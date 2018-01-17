package br.com.mongodb.contract.v1.get;

import br.com.mongodb.contract.v1.ProdutoController;
import br.com.mongodb.contract.v1.stub.ProdutoStub;
import br.com.mongodb.database.ProdutoRepository;
import br.com.mongodb.exception.ProdutoNotFoundException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringJUnit4ClassRunner.class)
@WebMvcTest(ProdutoController.class)
public class ProdutoControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ProdutoController produtoController;

    @Test
    public void buscarProdutoSucesso() throws Exception{
        when(produtoController.buscarProduto(21332L)).thenReturn(ProdutoStub.getProduto());

        this.mockMvc.perform(get("/produto/21332"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(status().is(200))
                .andReturn().getRequest().equals(ProdutoStub.getProduto());
    }

    @Test
    public void buscarProdutoNotFound() throws Exception{
        when(produtoController.buscarProduto(21332L)).thenThrow(ProdutoNotFoundException.class);

        this.mockMvc.perform(get("/produto/21332"))
                .andDo(print())
                .andExpect(status().isNotFound())
                .andExpect(status().is(404));
    }
}