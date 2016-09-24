package CursoJava;

import java.util.Scanner;

public class NumeroDecrescente {
	public static void main (String args[]){
		Scanner ler = new Scanner(System.in);
		int n1,n2,n3;
		System.out.println("Digite 3 número aleátorios");
		n1 = ler.nextInt();
		n2 = ler.nextInt();
		n3 = ler.nextInt();
		
		if(n1<n2 & n1>n3){
			System.out.println(n3+" "+n1+ " " + n2);
		}else if(n2<n1 & n2>n3){
			System.out.println(n1+" "+n2+" "+n3);
		}else {
			System.out.println(n2+ " "+n1+" "+n3);
		}
	}

}
