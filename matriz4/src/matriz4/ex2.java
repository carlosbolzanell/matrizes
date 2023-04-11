package matriz4;
import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		int numero, aux;
		
		System.out.println("Digite um valor para n");
		numero = sc.nextInt();
		
		int [][] matriz = new int [numero][numero];
		
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
