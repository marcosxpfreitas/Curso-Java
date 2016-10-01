package usuario;

public class Usuario {
	private String nome;
	private String email;
	private String password;
	
	public Usuario(String nome, String email, String password){
		this.nome = nome;
		this.email = email;
		if (this.cincoCaracteres(password)==true && (this.possuiLetra(password)==true) && (this.possuiNumero(password)==true)){
			this.password = password;
		}
		
	}

	
	
	public boolean cincoCaracteres(String password){
		if (password.length()>=5){
			return true;
		}
		return false;
	}
	public boolean possuiNumero(String password){
		for (int i = 0; i<password.length();i++){
			if(Character.isDigit(password.charAt(i))){
				return true;
			}
		}
		return false;
	}
	
	public boolean possuiLetra(String password){
		for (int i = 0; i<password.length();i++){
			if(Character.isLetter(password.charAt(i))){
				return true;
			}
		}
		return false;
	
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	public String getNome(){
		return nome;
	}
	public void setEmail(String email){
		this.email = email;
	}
	public String getEmail(){
		return email;
	}
	public String getSenha(){
		return password;
	}
}		
	

	




