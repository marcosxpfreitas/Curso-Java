package aula4.folhapagamento;

public class FolhaPagamento {

	public double calcular(Funcionario... funcionarios) {
		double valor = 0;

		for (Funcionario funcionario : funcionarios) {
			valor += funcionario.getSalarioComBonificacao();
		}
		return valor;
	}
}
