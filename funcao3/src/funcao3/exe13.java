package funcao3;
import java.util.Scanner;

public class exe13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		int posicao;
		
		System.out.println("Diga a Posição");
		posicao = sc.nextInt();
		
		fibonacci(posicao);

	}
	static int fibonacci(int posicao) {
		
		int sequencia=0, prox1=0, prox2=1;
		int[] fibonacci = new int[posicao];
		
		for (int contador=0; contador<posicao; contador++) {
			sequencia = prox1 + prox2;
			
			fibonacci[contador] = prox2;
			
			prox1 = prox2;
			prox2 = sequencia;
		}
		
		System.out.print(fibonacci[posicao-1]);
		
		return sequencia;
				
	}

}

