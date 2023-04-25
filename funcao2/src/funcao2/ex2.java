package funcao2;
import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		double a, b;
		
		System.out.println("Número");
		a = sc.nextDouble();
		System.out.println("Número 2");
		b = sc.nextDouble();
		
		System.out.println(multiplicacao(a,b));
	}
	static double multiplicacao(double a, double b) {
		
		double mult = 0;
		
		for (int i=0; i<b;i++) {
			mult += a;
		}
		return mult;
	}


}
