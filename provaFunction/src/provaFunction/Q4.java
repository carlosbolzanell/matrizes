package provaFunction;
import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int[] vetor = new int[20];
		
		
		for(int cont=0; cont<vetor.length; cont++) {
			System.out.println("Digite o numero: "+(cont+1)+" da lista");
			vetor[cont] = sc.nextInt();		
		}
		
		System.out.println("Numero Qualquer");
		int numero = sc.nextInt();
		
		System.out.println("Array sem o numero: ");
		setRemove(vetor, numero);
	}
	static void setRemove(int[] vetor, int numero) {
		
		for(int cont =0; cont<vetor.length; cont++) {
			
			if(vetor[cont] != numero) {
				
				System.out.print(vetor[cont]+" ");	
				
			}
		}
		
	}

}
