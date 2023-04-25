package funcao2;
import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		double graus;
		
		System.out.println("Quantos Fahrenheit");
		graus = sc.nextDouble();
		
		System.out.printf(conversao(graus)+"°C");
		
		

	}
	static double conversao(double graus) {
		double celsius;
		
		celsius = (graus-32)/1.8;
		
		return celsius;
	}

}
