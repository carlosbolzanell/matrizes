package funcao3;
import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		String caracteres;
		
		System.out.println("Digite os caracteres");
		caracteres = sc.next();
		
		System.out.println(conferirCaracteres(caracteres));

	}
	static int conferirCaracteres(String caracteres) {
		
		int caracterEspecial=0, caracterAlfabetico=0, caracterNumerico=0;
		
		
		for(char c : caracteres.toCharArray()) {
			if(Character.isLetter(c)) {
				caracterAlfabetico++;
			}else if(Character.isDigit(c)) {
				caracterNumerico++;
			}else {
				caracterEspecial++;
			}
		}
		if (caracterEspecial != 0) {
			return -1;
		}else if(caracterAlfabetico > caracterNumerico) {
			return 1;
		}else {
			return 0;
		}
	}

}
