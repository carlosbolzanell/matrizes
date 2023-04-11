package matriz4;
import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		int numero;
		
		System.out.println("Qual numero?");
		numero = sc.nextInt();
		
		int [][] matriz = new int [numero][numero];
		
		for(int linha=0; linha<matriz.length; linha++) {
			for(int coluna = 0; coluna<matriz.length; coluna++) {
				if (linha+coluna != matriz.length-1) {
					System.out.print(" ");
				}else {
					for(int i=0; i< linha+1; i++) {
						System.out.print(linha+1);
					}
				}
			}
			System.out.print("\n");
		}
		
		for(int linha=0; linha<matriz.length; linha++) {
			for(int coluna =0; coluna<matriz.length; coluna++) {
				if (coluna != linha) {
					System.out.print(" ");
				}else {
					for(int cont=numero; cont>0; cont--) {
						System.out.print(numero);
					}
					numero -= 1;
					
				}
			}
			System.out.print("\n");
		}
		
		

	}

}
