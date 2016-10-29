package aula6.exceptions.pessoa;

import java.util.ArrayList;
import java.util.List;

import aula6.exceptions.ErroValidacao;

/**
 * Responsavel por realizar a logica de salvar pessoas no banco
 * 
 * @author java01
 * 
 */
public class PessoaService {

	private List<Pessoa> pessoas;

	/**
	 * Construtor padrao, apenas inicializa os atributos
	 */
	public PessoaService() {
		this.pessoas = new ArrayList<>();
	}

	/**
	 * Metodo para salvar pessoa
	 * 
	 * @param pessoa
	 *            Pessoa a ser salva
	 * @throws ErroValidacao
	 *             Lanca erro quando nao conseguir salvar a pessoa devido aos
	 *             campos obrigatorios.
	 */
	public void salvar(Pessoa pessoa) throws ErroValidacao {
		if (pessoa.getNome() == null) {
			throw new ErroValidacao("nome");
		}
		// throw new NullPointerException("Deu null pointer");
		pessoas.add(pessoa);
		System.out.println("Pessoa salva com sucesso!");
	}

	public List<Pessoa> buscarTodos() {
		return pessoas;
	}
}
