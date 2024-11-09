package conexao_api_teste_01.cadastra_api.UsuarioController.UsuarioController;

import conexao_api_teste_01.cadastra_api.UsuarioController.UsuarioService.PerfilService;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(PerfilController.class)
public class PerfilControllerTest {
	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private PerfilService perfilService;

	@Test
	public void listarTodosPerfis() throws Exception {
		this.mockMvc.perform(get("/perfil"))
			.andExpect(status().isOk())
			.andExpect(content().contentType(MediaType.APPLICATION_JSON_VALUE))
			.andExpect(jsonPath("$[0].id").value("<value>"))
			.andExpect(jsonPath("$[0].descricao").value("<value>"));
	}
}
