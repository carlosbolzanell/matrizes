package atividadeDupla;
import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Numero");
		Integer numero = sc.nextInt();
		
		System.out.println(setQuantd(numero));

	}
	static int setQuantd (Integer numero) {
		
		return numero.toString().length();
	}

}
