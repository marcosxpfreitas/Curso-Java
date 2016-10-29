package aula4.folhapagamento;

public class TestarFolhaPagamento {

	public static void main(String[] args) {
		// Criando classe anonima
		Funcionario funcionario = new Funcionario("Anonimo", 1000) {
			@Override
			protected double getPorcentagemAdicional() {
				return 0.5;
			}
		};
		Funcionario funcionarios[] = {
				new Gerente("Juquinha", 5000),
				new Secretaria("Salete", 1500),
				new Supervisor("Juquinha supervisor", 4000),
				funcionario
		};
		
		FolhaPagamento folhaPagamento = new FolhaPagamento();
		double valor = folhaPagamento.calcular(funcionarios);
		System.out.println("Valor total: " + valor);
	}
}
