package aula6.exceptions.pessoa;

import aula6.exceptions.ErroValidacao;

public class TestarPessoa {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		// pessoa.setNome("Juquinha");

		try {
			PessoaService service = new PessoaService();
			service.salvar(pessoa);
			System.out.println("Ultima linha do catch");
		} catch (ErroValidacao e) {
			// System.out.println("Erro que eu sei tratar: " + e.getMessage());
			System.out.println("Verifique o campo " + e.getNomeCampo());
		} catch (Exception e) {
			System.out.println("Erro generico: " + e.getMessage());
		} finally {
			System.out.println("Finally sempre sera executado");
		}
		System.out.println("Finalizando... ");
	}
}
