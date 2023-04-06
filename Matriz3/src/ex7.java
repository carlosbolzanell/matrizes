import java.util.Random;
import java.util.Scanner;
public class ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		
		int linhas, colunas;
		
		System.out.println("Linhas da matriz");
		linhas = sc.nextInt();
		System.out.println("Colunas da Matriz");
		colunas = sc.nextInt();
	
		int [][] matriz = new int [linhas][colunas];
		
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
				matriz[linhas-1][0] = valor;
				matriz[0][colunas-1] = valor;
				matriz[linhas-1][colunas-1] = valor;
				
				if(linhas%2==1 && colunas%2==1) {
					matriz[(linhas-1)/2][(colunas-1)/2] = valor;
					
				}else if(linhas%2==1 && colunas%2==0) {
					matriz[(linhas-1)/2][(colunas/2)-1] = valor;
					matriz[(linhas-1)/2][colunas/2] = valor;
					
				}else if(linhas%2==0 && colunas%2==1) {
					matriz[(linhas/2)-1][(colunas-1)/2] = valor;
					matriz[(linhas/2)][(colunas-1)/2] = valor;
				}else {
					matriz[(linhas-1)/2][(colunas/2)-1] = valor;
					matriz[(linhas-1)/2][colunas/2] = valor;
					matriz[(linhas/2)][(colunas/2)] = valor;
					matriz[(linhas/2)][(colunas/2)-1] = valor;
				}
				System.out.print(matriz[linha][coluna]+ " ");
			}
			System.out.print("\n");
		}
	}
}