package funcao3;
import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int num;
		
		for(int i=10; i<=100; i++) {
			if(primos100(i)) {
				System.out.println(i);
			}
		}
		
		int numero;
		System.out.println("Escreva um numero");
		numero = sc.nextInt();
		
		
		
		if(primos100(numero) == true) {
			System.out.println("Primo");
		}else {
			System.out.println("Não é primo");
		}

	}
	static boolean primos100(int numero) {
		
		if(numero<=0) {
			return false;
		}
		
		for(int i=2; i<=numero/2; i++) {
			if(numero%i == 0) {
				return false;
			}
		}
		return true;
	}
}
