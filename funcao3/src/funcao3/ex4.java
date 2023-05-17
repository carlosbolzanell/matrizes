package funcao3;
import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		String numero;
		
		System.out.println("Escreva um número inteiro e positivo");
		numero = sc.next();
		
		System.out.println(quantidadeNumeros(numero));
	}
	static int quantidadeNumeros(String numero) {
		int quantidadeNumero=0;
		
		for(int quantidade=0; quantidade<numero.length(); quantidade++) {
			quantidadeNumero = quantidade;
		}
		return quantidadeNumero+1;
	}

}
