package br.com.dextra.loja;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import junit.framework.Assert;
import org.junit.Test;

public class ClientTest {

	@Test
	public void testaQueAConexaoComOServidorFunciona() {
		Client client = ClientBuilder.newClient();
		//WebTarget target = client.target("http://www.mocky.io");
		//String conteudo = target.path("v2/54eb56c0fab2e6f405edbaab").request().get(String.class);

		WebTarget target = client.target("http://localhost:8080");
		String conteudo = target.path("/carrinhos").request().get(String.class);

		
		Assert.assertTrue(conteudo.contains("Polo de Tecnologia"));
		
		System.out.println(conteudo);
		
		
	}
}
