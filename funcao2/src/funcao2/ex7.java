package funcao2;
import java.util.Scanner;

public class ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		String caracter;
		
		System.out.println("Diga o caracter");
		caracter = sc.next();
		
		if(conferir(caracter) == true) {
			System.out.println("é um digito");
		}else {
			System.out.println("não é um digito");
		}
		

	}
	static boolean conferir(String caracter) {
		String [] digito = {"1","2","3","4","5","6","7","8","9"};
		int cont=0;
		
		for(int i=0; i<9; i++) {
			if(caracter.equals(digito[i])) {
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
