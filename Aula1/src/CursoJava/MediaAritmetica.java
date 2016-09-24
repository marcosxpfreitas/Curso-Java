package CursoJava;

import java.util.Scanner;

public class MediaAritmetica {
	public static void main(String args[]){
		double nota1,nota2,nota3,media;
		
		//Coleta as notas
		Scanner ler = new Scanner(System.in);
		System.out.println("Media aritmetica.\nDigite a primeira nota:");
		nota1 = ler.nextDouble();
		System.out.println("Digite a segunda nota:");
		nota2 = ler.nextDouble();
		System.out.println("Digite a terceira nota");
		nota3 = ler.nextDouble();
		//Calcula a média
		media = (nota1+nota2+nota3)/3;
		//Informa se o aluno esta aprovado ou reprovado.
		if (media >= 7){
			System.out.println("Media = "+media+",APROVADO! :D ");
		}else if(media >= 4){
			System.out.println("Media = "+media+",EXAME! :| ");
		}else{
			System.out.println("Media = "+media+",REPROVADO :( ");
		}
		ler.close();
		
		
	}
}
