package funcao;
import java.util.Scanner;

public class ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		int sexo;
		double altura;
		
		System.out.println("Sexo\n1 Mulher\n2 Homem");
		sexo = sc.nextInt();
		
		System.out.println("Altura");
		altura = sc.nextDouble();
		
		System.out.printf("peso ideal: %,.2f",funcao (sexo, altura));

	}
	static double funcao(int sexo, double altura) {
		double pesoIdeal;
		
		if (sexo ==2) {
			pesoIdeal = (72.7*altura)-58;
		}else {
			pesoIdeal = (62.1 * altura)-44.7;
		}
		return pesoIdeal;
	}

}
