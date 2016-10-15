package aula5.list;

public class Pessoa implements Comparable<Pessoa> {
	private String nome;
	private String cpf;
	
	public Pessoa(String nome, String cpf){
		this.nome=nome;
		this.cpf=cpf;
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		return true;
	}
	public int compareTo(Pessoa outraPessoa){
		//-0 quem recebeu o metodo vem antes
		//0 são iguais
		//1 que esta no parametro vem antes
		return nome.compareTo(outraPessoa.nome);
	}
	

}