package ExercicioFolhaPagamentos;

public class FolhaPagamento{
	public void Calcular(Funcionario... funcionarios){
		double valorTotal=0;
		for(Funcionario funcionario : funcionarios){
			System.out.println(funcionario.getClass().getSimpleName()+": "+funcionario.getNome()+"\nsalario sem o adicional: "+funcionario.getSalario());
			System.out.println("Salário com adicional "+ funcionario.getSalarioComBonificacao());
			System.out.println("****************************************");
			valorTotal+=funcionario.getSalarioComBonificacao();
			
		}
		System.out.println("Valor total: "+ valorTotal);
	}
	

}
