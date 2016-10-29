package aula6.geracaosenhas;

import java.util.ArrayList;
import java.util.List;

public class GeradorSenha {
	private static final String PREFIXO_SENHA_IDOSO = "I";
	private static final String PREFIXO_SENHA_PADRAO = "P";
	private static final int LIMITE_IDOSOS_EM_SEQUENCIA = 5;

	private List<Integer> senhasIdosos;
	private List<Integer> senhasPadrao;

	private int proximaSenhaIdoso;
	private int proximaSenhaPadrao;
	private int idososAtendidosEmSequencia;

	public GeradorSenha() {
		this.senhasIdosos = new ArrayList<>();
		this.senhasPadrao = new ArrayList<>();
		this.proximaSenhaPadrao = this.proximaSenhaIdoso = 1;
		this.idososAtendidosEmSequencia = 0;
	}

	public String gerarSenhaIdoso() {
		String senha = PREFIXO_SENHA_IDOSO + proximaSenhaIdoso;
		senhasIdosos.add(proximaSenhaIdoso);
		proximaSenhaIdoso++;
		return senha;
	}

	public String gerarSenhaPadrao() {
		String senha = PREFIXO_SENHA_PADRAO + proximaSenhaPadrao;
		senhasPadrao.add(proximaSenhaPadrao);
		proximaSenhaPadrao++;
		return senha;
	}

	public String proximaSenha() {
		if (!senhasIdosos.isEmpty()) {
			if (idososAtendidosEmSequencia >= LIMITE_IDOSOS_EM_SEQUENCIA
					&& !senhasPadrao.isEmpty()) {

				return proximaSenhaPadrao();
			}
			return proximaSenhaIdoso();
		}
		if (!senhasPadrao.isEmpty()) {
			return proximaSenhaPadrao();
		}
		return null;
	}

	private String proximaSenhaIdoso() {
		idososAtendidosEmSequencia++;
		return PREFIXO_SENHA_IDOSO + senhasIdosos.remove(0);
	}

	private String proximaSenhaPadrao() {
		idososAtendidosEmSequencia = 0;
		return PREFIXO_SENHA_PADRAO + senhasPadrao.remove(0);
	}
}
