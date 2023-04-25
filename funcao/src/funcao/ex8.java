package funcao;
import java.util.Scanner;

public class ex8 {

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
		
		for (int contador=0; contador<posicao; contador++) {
			sequencia = prox1 + prox2;
			System.out.print(prox2 +"; ");
			prox1 = prox2;
			prox2 = sequencia;
		}
		return sequencia;
				
	}

}
