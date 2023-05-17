package funcao2;
import java.util.Scanner;

public class exe14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		String palavra;
		
		System.out.println("Escreva a palavra");
		palavra = sc.next();
		
		if(verific(palavra) == true) {
			System.out.println("É palíndromo");
		}else {
			System.out.println("Não é palíndromo");
		}

	}
	 static boolean verific (String palavra) {
		 
		 palavra = palavra.toLowerCase();
		 
		 for (int contador=0, contador2 = palavra.length()-1; contador < contador2; contador++, contador2--) {
			 if (palavra.charAt(contador) != palavra.charAt(contador2)) {
				 return false;
			 }
		 }
		 return true;
	 }

}
