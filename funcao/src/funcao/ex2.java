package funcao;
import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int numero;
		System.out.println("Qual o número?");
		numero = sc.nextInt();
		
		
		System.out.println(absoluto(numero));
		

	}
	static int absoluto(int numero) {
		
		return Math.abs(numero);
	}

}
