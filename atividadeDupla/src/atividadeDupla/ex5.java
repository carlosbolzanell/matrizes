package atividadeDupla;
import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Numero");
		Integer numero = sc.nextInt();
		
		System.out.println(setReverse(numero));

	}
	static String setReverse(Integer numero) {
		
		String numero1, reverso = "";
		
		numero1 = numero.toString();
		
		for (int i = numero1.length()-1; i>=0; i--) {
			reverso += numero1.charAt(i);
		}
		
		return reverso;
		
		
	}

}
