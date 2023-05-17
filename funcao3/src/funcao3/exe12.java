package funcao3;
import java.util.Scanner;

public class exe12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub]
		Scanner sc = new Scanner (System.in);
		
		int numero;
		
		System.out.println("Numero");
		numero = sc.nextInt();
		
		System.out.println(funcao(numero));
		

	}
	static int funcao(int numero) {
		int fatorial=1;
		
		for (int contador = numero; contador>0; contador--) {
			fatorial *= contador; 
		}
		return fatorial;
	}

}
