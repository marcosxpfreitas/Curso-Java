package ExercicioFolhaPagamentos;

public class Secretaria extends Funcionario{

	public Secretaria(String nome, double salario) {
		super(nome, salario);
	}

	@Override
	public double getPorcentagemAdicional() {
		return 0;
	}
	

}
