package matriz4;
import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		int numero;
		
		System.out.println("Escreva um valor para n");
		numero = sc.nextInt();
		
		int [][] matriz = new int [numero][numero];
		
		System.out.println("*======*");
		
		for (int l=0; l<numero; l++) {
			for(int c=0; c<numero; c++) {
				
				if (l+c != matriz.length-1) {
					System.out.print(" ");
				}else {
					for(int i=0; i< l+1; i++) {
						System.out.print(l+1);
					}
				}	
			}
			System.out.print("*\n");
		}
		System.out.println("********");
		
		for(int linha=0; linha<matriz.length; linha++) {
			for(int coluna=0; coluna<matriz.length; coluna++) {
				
				if (linha == coluna) {
					for(int i=numero; i>0; i--) {
						System.out.print(numero);
					}
					numero = numero - 1;
				}
			}
			System.out.print("\n");
		}
		

	}

}
