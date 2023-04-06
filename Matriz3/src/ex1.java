import java.util.Scanner;
import java.util.Random;
public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		int procura, contador=0;
		int [][] matriz = new int [6][6];
		
		for(int linha=0; linha<matriz.length; linha++) {
			for(int coluna=0; coluna<matriz[0].length; coluna++) {
				matriz[linha][coluna] = random.nextInt(20);
				System.out.print(matriz[linha][coluna]+ " ");
			}
			System.out.print("\n");
		}
		
		System.out.println("Qual número você deseja procurar?");
		procura = sc.nextInt();
		
		for(int linha=0; linha<matriz.length; linha++) {
			for(int coluna=0; coluna<matriz[0].length; coluna++) {
				if(procura == matriz[linha][coluna]) {
					System.out.println("Número encontrado! \nLinha "+linha+ " coluna "+coluna);
					contador++;
					break;
				}
				
				}
			
			}
			if(contador==0) {
					System.out.println("Número não encontrado");
		}
		

	}

}
