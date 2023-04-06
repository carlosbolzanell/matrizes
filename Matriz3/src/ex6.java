import java.util.Random;
import java.util.Scanner;
public class ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
	
		int [][] matriz = new int [5][5];
		
		for(int linha=0; linha<matriz.length; linha++) {
			for(int coluna=0; coluna<matriz[0].length; coluna++) {
				matriz[linha][coluna] = random.nextInt(1);
				System.out.print(matriz[linha][coluna]+ " ");
			}
			System.out.print("\n");
				
		}
		int valor;
		System.out.println("Escolha um número qualquer");
		valor = sc.nextInt();
		
		for(int linha=0; linha<matriz.length; linha++) {
			for(int coluna=0; coluna<matriz[0].length; coluna++) {
				matriz[0][0] = valor;
				matriz[4][0] = valor;
				matriz[0][4] = valor;
				matriz[4][4] = valor;
				matriz[2][2] = valor;
				System.out.print(matriz[linha][coluna]+ " ");
			}	
			System.out.println("\n");
		}
	}
}