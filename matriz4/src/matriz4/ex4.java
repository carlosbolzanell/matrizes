package matriz4;
import java.util.Scanner;

public class ex4 {
	public static void main (String[]args) {
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
					for(int i=0; i< linha+1; i++) {
						System.out.print(linha+1);
					}
					System.out.print("*");
				}
				if (coluna + linha == matriz.length-1) {
					for (int cont=0; cont<linha+1; cont++) {
						System.out.print(linha+1);
					}
				}
			}
			System.out.print("\n");
		}
		System.out.print("*****************\n");
		
		aux = numero;
		
		for(int linha=0; linha<matriz.length; linha++) {
			for(int coluna =0; coluna<matriz.length; coluna++) {
				if (coluna != linha) {
					System.out.print(" ");
				}else {
					for(int cont=numero; cont>0; cont--) {
						System.out.print(numero);
					}
					numero -= 1;
					
					System.out.print("*");
					
					if(linha == coluna) {
						for(int cont=aux; cont>0; cont--) {
							System.out.print(aux);
						}
						aux -= 1;
					}
				}
			}
			System.out.print("\n");
		}
	}

}
