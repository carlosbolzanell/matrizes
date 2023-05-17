package funcao3;
import java.util.Scanner;

public class ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		for (int numero = 1000; numero <=10000; numero++) {
			if(numero == inversao(numero)) {
				System.out.println(numero);
			}
		}
		
		int num;
		System.out.println("\nQual numero?");
		num = sc.nextInt();
		
		inversao2(num);


	}
	static int inversao(int numero) {
		
		int invertido = 0;
		
		while (numero != 0) {
			invertido = invertido * 10 + numero%10;
			numero/=10;
		}
		return invertido;
	}
	static void inversao2(int num) {
		int invertido = 0;
		
		while (num != 0) {
			invertido = invertido * 10 + num%10;
			num/=10;
		}
		System.out.println(invertido);
	}

}
