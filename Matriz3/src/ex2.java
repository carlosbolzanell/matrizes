import java.util.Random;
public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random random = new Random();
	
		int [][] matriz = new int [4][4];
		
		for(int linha=0; linha<matriz.length; linha++) {
			for(int coluna=0; coluna<matriz[0].length; coluna++) {
				matriz[linha][coluna] = random.nextInt(10);
				System.out.print(matriz[linha][coluna]+ " ");
			}
			System.out.print("\n");
		}
		
		System.out.println("Diagonal principal");
		for(int linha=0; linha<matriz.length; linha++) {
			for(int coluna=0; coluna<matriz[0].length; coluna++) {
				if(linha == coluna) {
					System.out.print(matriz[linha][coluna]+ " ");
				}
			}
		}
		System.out.println("\nSem a diagonal principal");
		for(int linha=0; linha<matriz.length; linha++) {
			for(int coluna=0; coluna<matriz[0].length; coluna++) {
				if(linha != coluna) {
					System.out.print(matriz[linha][coluna]+ " ");
				}
			}
		}
		System.out.println("\nDiagonal secundaria");
		for(int linha=0; linha<matriz.length; linha++) {
			for(int coluna=0; coluna<matriz[0].length; coluna++) {
				if(linha + coluna == matriz.length-1) {
					System.out.print(matriz[linha][coluna]+ " ");
				}
			}
		}
		System.out.println("\nSem a diagonal principal");
		for(int linha=0; linha<matriz.length; linha++) {
			for(int coluna=0; coluna<matriz[0].length; coluna++) {
				if(linha + coluna != matriz.length-1) {
					System.out.print(matriz[linha][coluna]+ " ");
				}
			}
		}
		System.out.println("\nDiagonal principal e secundaria");
		for(int linha=0; linha<matriz.length; linha++) {
			for(int coluna=0; coluna<matriz[0].length; coluna++) {
				if(linha == coluna || linha+coluna == matriz.length-1) {
					System.out.print(matriz[linha][coluna]+ " ");
				}
			}
		}
		System.out.println("\nSem diagonal principal e secundaria");
		for(int linha=0; linha<matriz.length; linha++) {
			for(int coluna=0; coluna<matriz[0].length; coluna++) {
				if(linha != coluna && linha+coluna != matriz.length-1) {
					System.out.print(matriz[linha][coluna]+ " ");
				}
			}
		}

	}

}
