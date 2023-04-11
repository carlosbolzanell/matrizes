package matriz4;
import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int numero, aux = 1;
		System.out.println("Numero");
		numero = sc.nextInt();
		
		int [][] matriz = new int [numero][numero];
		
		for(int linha = 0; linha<matriz.length; linha++) {
			for(int coluna=0; coluna<matriz[0].length; coluna++) {
				
				if (coluna+linha == matriz.length-1){
					for (int cont=0; cont<linha+1; cont++) {
						if(linha%2==0) {
						System.out.print(linha+1);
						}
					}
				}
			}
			System.out.print("\n");
		}

	}

}
