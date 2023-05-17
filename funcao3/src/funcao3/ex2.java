package funcao3;
import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		String palavra1, palavra2;
		
		System.out.println("Escreva a palavra 1");
		palavra1 = sc.next();
		
		System.out.println("Escreva a palavra 2");
		palavra2 = sc.next();
		
		if (conferir(palavra1, palavra2) == true) {
			System.out.println("são iguais");
		}else {
			System.out.println("não são iguais");
		}
		
	}
	static boolean conferir(String palavra1, String palavra2) {
		
		for (int i =0; i<palavra2.length(); i++) {
			if (palavra1.charAt(i) != palavra2.charAt(i)) {
				return false;
			}
		}
		return true;
	}

}
