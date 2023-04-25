package funcao;
import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		int ano;
		
		System.out.println("Diga o ano");
		ano = sc.nextInt();
		
		if (funcao(ano) == true) {
			System.out.println("Bissexto");
		}else {
			System.out.println("Não Bissexto");
		}
		
	}
	static boolean funcao( int ano) {
		
		if (ano %4 ==0 && ano%100 != 0 || ano%400 ==0) {
			return true;
		}else {
			return false;
		}
	}

}
