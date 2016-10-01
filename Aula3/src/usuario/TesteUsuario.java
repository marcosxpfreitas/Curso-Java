package usuario;

public class TesteUsuario {
	public static void main (String args[]){
		Usuario usuario1 = new Usuario ("Marcos","marcos@hotmail.com","fff4f");
		
		System.out.println(usuario1.getNome());
		System.out.println(usuario1.getEmail());
		System.out.println(usuario1.getSenha());
	}
}
