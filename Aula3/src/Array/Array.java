package Array;

public class Array {
	
	public static void main(String args[]){
	
	int [] array3 = new int[6];	
	int [] array2 = {1,2,3,4,5};
	String[] texto = new String[10];
	
	for (int i=0; i<array3.length;i++){
		array3[i]=i+2;
	}
	for (int i=0; i<texto.length;i++){
		texto[i]="Ola";
	}
	for(int i=0;i<array3.length;i++){
		System.out.println(array3[i]);
	}
	for(int i=0;i<texto.length;i++){
		System.out.println(texto[i]);
	}
	
	
	
	
	}
	
	
	

}
