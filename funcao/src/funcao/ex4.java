package funcao;
import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		int numero1, numero2;
		
		System.out.println("Número 1");
		numero1 = sc.nextInt();
		System.out.println("Número 2");
		numero2 = sc.nextInt();
		
		if(funcao(numero1, numero2) == true) {
			System.out.println("Multiplo");
		}else {
			System.out.println("Não multiplo");
		}
		

	}
	static boolean funcao(int numero1, int numero2) {
		
		if(numero2%numero1 == 0) {
			return true;
		}else {
			return false;
		}
	}

}
