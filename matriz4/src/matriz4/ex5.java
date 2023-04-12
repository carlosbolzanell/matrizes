package matriz4;

import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int numero, aux=1;
		System.out.println("Numero");
		numero = sc.nextInt();
		
		int [][] matriz = new int [numero][numero];
		
		for(int linha = 0; linha<matriz.length; linha++) {
			for(int coluna=0; coluna<numero; coluna++) {
				if(coluna==linha) {
					matriz[linha][coluna] = coluna+1;	
					System.out.print(matriz[linha][coluna]+ " ");
				}else {
					matriz[linha][coluna] = " ";
				}
		
			}
			System.out.print("\n");
			

		}	
	}
}
