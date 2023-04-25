package funcao2;
import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		String caracter;
		
		System.out.println("Diga o caracter");
		caracter = sc.next();
		
		if(conferir(caracter) == true) {
			System.out.println("é do alfabeto maiúsculo");
		}else {
			System.out.println("não é do alfabeto");
		}
		

	}
	static boolean conferir(String caracter) {
		String [] alfabeto = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
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
