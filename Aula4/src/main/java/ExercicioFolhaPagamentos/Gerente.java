package ExercicioFolhaPagamentos;

public class Gerente extends Funcionario {

	public Gerente(String nome, double salario) {
		super(nome, salario);
		
	}

	@Override
	public double getPorcentagemAdicional() {
		return 0.15;
	}
	
	
}
