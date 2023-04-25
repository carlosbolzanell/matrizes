package funcao2;
import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		String caracter;
		
		System.out.println("Diga o caracter");
		caracter = sc.next();
		
		if(conferir(caracter) == true) {
			System.out.println("é do alfabeto");
		}else {
			System.out.println("não é do alfabeto");
		}
		

	}
	static boolean conferir(String caracter) {
		String [] alfabeto = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
		int cont=0;
		
		for(int i=0; i<26; i++) {
			if(caracter.equals(alfabeto[i])) {
				cont++;
			}
		}
		if (cont != 0) {
			return true;
		}else {
			return false;
		}
	}

}
