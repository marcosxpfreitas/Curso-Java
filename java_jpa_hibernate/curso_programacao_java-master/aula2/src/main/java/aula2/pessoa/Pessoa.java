package aula2.pessoa;

public class Pessoa {

	/**
	 * Atributos da classe.
	 */
	String nome;
	String cpf;
	String rg;

	/**
	 * Construtor da classe. Construtor nao tem tipo de retorno e deve ter o
	 * mesmo nome da classe.
	 * 
	 * @param nome
	 * @param cpf
	 * @param rg
	 */
	public Pessoa(String nome, String cpf, String rg) {
		/**
		 * Utilizacao do "this", que é uma referencia para o proprio objeto.
		 */
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
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
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (rg == null) {
			if (other.rg != null)
				return false;
		} else if (!rg.equals(other.rg))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", cpf=" + cpf + ", rg=" + rg + "]";
	}
}
