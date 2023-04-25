package funcao;
import java.util.Scanner;

public class ex9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		int idade, sexo;
		double peso, altura;
		System.out.println("Sexo\n1 Feminino\n2 Masculino");
		sexo = sc.nextInt();
		
		System.out.println("Diga sua idade");
		idade = sc.nextInt();
		
		System.out.println("Diga seu peso");
		peso = sc.nextDouble();
		
		System.out.println("Diga sua altura");
		altura = sc.nextDouble();
		
		System.out.println("GEB: "+funcao(idade, sexo, peso, altura));

	}
	static double funcao(int idade, int sexo, double peso, double altura) {
		double geb;
		if (sexo == 2) {
			geb = 66.47 +(13.75*peso)+(5*altura)-(6.76*idade);
		}else {
			geb = 655.1 +(9.56*peso)+(1.85*altura)-(4.67*idade);
		}
		return geb;
		
	}

}
