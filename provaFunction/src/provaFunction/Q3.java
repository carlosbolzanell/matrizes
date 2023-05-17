package provaFunction;
import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escreva um numero real");
		String numero = sc.next();
		
		System.out.println("Inteiro: "+setInteiro(numero));
		System.out.println("Fracionario: "+setFracao(numero));
		
	}
	static String setInteiro(String numero) {
		
		String[] inteiro = numero.split(",");
		
		return inteiro[0];
	}
	
	static String setFracao(String numero) {
		
		String[] fracao = numero.split(",");
		
		return fracao[1];
	}

}
