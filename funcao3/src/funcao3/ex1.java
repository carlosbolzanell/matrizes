package funcao3;
import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		String palavra;
		
		System.out.println("Escreva a palavra");
		palavra = sc.next();
		
		if (verific(palavra) == true) {
			System.out.println("Tudo minusculo");
		}else {
			System.out.println("Não é tudo minúsculo");
		}

	}
	static boolean verific(String palavra) {
		String conferir;
		
		conferir = palavra.toLowerCase();
		
		if (palavra != conferir) {
			return false;
		}else {
			return true;
		}
	}

}
