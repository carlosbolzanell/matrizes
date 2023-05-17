package funcao3;
import java.util.Scanner;

public class ex9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		int num1, num2;
		
		System.out.println("Escreva o multiplicador 1");
		num1 = sc.nextInt();
		
		System.out.println("Escreva o multiplicador 2");
		num2 = sc.nextInt();
		
		System.out.println(setMultiplicador(num1, num2));
		
				
	}
	static int setMultiplicador(int num1, int num2) {
		
		int resultado1=0, resultado2=0, cont1=0, resultado;
		resultado2 = num2;
		
		while(num1 != 1) {
			num1 /= 2;
			cont1++;
		}
		while(cont1 != 0) {
			num2 *= 2;
			cont1--;
		}
		resultado = num2 + resultado2;
		return resultado;
	}

}
