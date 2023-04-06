import java.util.Random;
public class ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random random = new Random();
	
		int [][] matriz = new int [5][5];
		
		for(int linha=0; linha<matriz.length; linha++) {
			for(int coluna=0; coluna<matriz[0].length; coluna++) {
				matriz[linha][coluna] = random.nextInt(10);
				System.out.print(matriz[linha][coluna]+ " ");
			}
			System.out.print("\n");
		}
		
		System.out.println("Numeros iguais ao seu segundo índice\n");
		for(int linha=0; linha<matriz.length; linha++) {
			for(int coluna=0; coluna<matriz[0].length; coluna++) {
				if (matriz[linha][coluna] == coluna) {
					System.out.print(matriz[linha][coluna]+" ");
				}
			}
		}
	}
}