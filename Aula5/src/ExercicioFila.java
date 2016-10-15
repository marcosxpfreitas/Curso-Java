import java.util.Scanner;


public class ExercicioFila {
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		GeradorSenha gerador = new GeradorSenha();
		int opcao;
		do{
			System.out.println("EMISSOR DE SENHAS");
			System.out.println("1-SENHAS PARA IDOSOS");
			System.out.println("2-SENHA NORMAL");
			opcao = scanner.nextInt();
			switch (opcao){
			case 1: System.out.println(gerador.gerarSenhaIdoso());
					break;
			case 2: System.out.println(gerador.gerarSenhaPadrao());
					break;
			case 3: System.out.println(gerador.chamarSenha());		
			}
		}while(opcao!=4);
	}
}
	

