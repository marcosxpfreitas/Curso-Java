package Array;

import java.util.Scanner;

public class InverteArray {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n;
		System.out.println("Quantas posições?");
		n = ler.nextInt();
		int[] arrayNormal = new int[n];
		int[] arrayInvertido = new int[n];
		
		for (int i=0,j=n;(i<arrayNormal.length);i++,j--){
			arrayNormal[i]=i;
			arrayInvertido[j-1]=i;
		}
		for(int i=0; i<arrayNormal.length;i++){
			System.out.println(arrayNormal[i]);
			
		}
		for(int i=0; i<arrayNormal.length;i++){
			System.out.println(arrayInvertido[i]);
			
		}
		
		
		
		

	}

}
