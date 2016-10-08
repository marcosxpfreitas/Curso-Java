package ExercicioFolhaPagamentos;

public abstract class Funcionario {
	private String nome;
	private double salario;
	
	public Funcionario(String nome, double salario){
		this.nome=nome;
		this.salario=salario;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return this.salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public abstract double getPorcentagemAdicional();

	

	public double getSalarioComBonificacao(){
		return this.getSalario()*(1+getPorcentagemAdicional());
	}
	

}
