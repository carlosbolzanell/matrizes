package funcao2;
import java.util.Scanner;

public class exe15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		String caracters;
		
		System.out.println("Escreva caracters");
		caracters = sc.next();
		
		if(verific(caracters) == true) {
			System.out.println("Tudo maiusculo");
		}else {
			System.out.println("Não é tudo maiusculo");
		}

	}
	static boolean verific(String caracters) {
		String conferir;
		
		conferir = caracters.toUpperCase();
		
		if (caracters != conferir) {
			return false;
		}else {
			return true;
		}
	}

}
