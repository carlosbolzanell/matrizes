package matriz4;

import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int numero, aux;
		System.out.println("Numero");
		numero = sc.nextInt();
		
		int [][] matriz = new int [numero][numero];
		
		for(int linha = 0; linha<matriz.length; linha++) {
			for(int coluna=0; coluna<matriz.length; coluna++) {
				if (linha+coluna != matriz.length-1) {
					System.out.print(" ");
				}else {
					for(int i=0; i< coluna+1; i++) {
						System.out.print(coluna+1);
					}
					System.out.print("*");
				}

			}
			System.out.print("\n");

		}	
	}
}
