package funcao2;
import java.util.Scanner;

public class exe10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		String caracter;
		
		System.out.println("Frase");
		caracter = sc.next();
		
		System.out.println(funcao(caracter));

	}
	static String funcao(String caracter) {
		String maiusculo;
		maiusculo = caracter.toUpperCase();
		return maiusculo;
	}

}
