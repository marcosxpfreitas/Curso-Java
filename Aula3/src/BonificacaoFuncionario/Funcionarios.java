package BonificacaoFuncionario;

public class Funcionarios {
	private String nome;
	private double salario;
	private String cargo;
	private double pocentagemBonificacao;
	
	
	public Funcionarios (String nome, double salario, String cargo, double porcBoni){
		this.nome = nome;
		this.salario = salario;
		this.cargo = cargo;
		this.pocentagemBonificacao = porcBoni;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public double getSalario(){
		return this.salario;
	}
	public double getBonificacao(){
		return this.pocentagemBonificacao;
	}
	public void setSalario(double salario){
		if(this.validarSalario(salario)==true){
			this.salario=salario;
		}
	}
	public void setBonificacao(double bonificacao){
		if (this.validarBonificacao(bonificacao)==true){
			this.pocentagemBonificacao=bonificacao;
		}
	}
	
	private boolean validarSalario (double salario){
		if(this.salario>salario){
			return false;
		}
		return true;
	}
	
	private boolean validarBonificacao(double bonificacao){
		if(this.pocentagemBonificacao > bonificacao){
			return false;
		}
		return true;
	}
	
	public String toString(){
		String texto;
		texto= "Funcionario: "+this.nome+ "\n";
		texto+= "Cargo: "+this.cargo+ " \n";
		texto+= "Salario: "+this.salario+ "\n";
		texto+= "Bonificação: "+this.pocentagemBonificacao+"\n";
		return texto;
	}
	
}
