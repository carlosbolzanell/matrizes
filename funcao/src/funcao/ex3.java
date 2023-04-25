package funcao;
import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		int numero;
		System.out.println("Número");
		numero = sc.nextInt();
		
		if (funcao(numero) == true) {
			System.out.println("Par");
		}else {
			System.out.println("Ímpar");
		}
		
		
	}
	static boolean funcao(int numero) {
		
		if (numero%2==0) {
			return true;
		}else {
			return false;
		}
	}

}
