
import java.util.Random;
public class ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random random = new Random();
	
		int [][] matriz = new int [4][4];
		System.out.println("Matriz 1");
		for(int linha=0; linha<matriz.length; linha++) {
			for(int coluna=0; coluna<matriz[0].length; coluna++) {
				matriz[linha][coluna] = random.nextInt(10)-5;
				System.out.print(matriz[linha][coluna]+ " ");
			}
			System.out.print("\n");
		}
		System.out.println("\n\nMatriz 2");
		for(int linha=0; linha<matriz.length; linha++) {
			for(int coluna=0; coluna<matriz[0].length; coluna++) {
				if(matriz[linha][coluna] <0) {
					matriz[linha][coluna] = 0;
					}
				System.out.print(matriz[linha][coluna]+ " ");
			}
			System.out.println("\n");
		}
	}
}
