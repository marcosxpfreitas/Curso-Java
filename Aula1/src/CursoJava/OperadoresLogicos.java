
package CursoJava;
import java.util.Scanner;
public class OperadoresLogicos {
		public static void main(String args[]){
			//Exercicio 1
			int idade;
			Scanner ler = new Scanner(System.in);
			System.out.println("Digite sua idade:");
			idade = ler.nextInt();
			System.out.println((idade >= 19)?"Você é maior de idade":"Você é menor de idade");
			
			
			
			//Exercicio 2 
			String nome1,nome2;
			System.out.println("Digite o primeiro nome:");
			nome1 = ler.next();
			System.out.println("Digite o segundo nome:");
			nome2 = ler.next();
			boolean validacaoNome = (nome1.equals(nome2));
			System.out.println(nome1+" e "+nome2+" são nomes iguais? "+validacaoNome);
			
			
			
			
			
			
			
	}
	
	
	
}
