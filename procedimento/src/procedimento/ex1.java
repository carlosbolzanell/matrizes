package procedimento;
import java.util.Scanner;

public class ex1 {
	static double dolar=0.30, yenes=30, conversaoDolar=0, conversaoYenes=0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double reais;
		int escolha;
		
		System.out.println("Qual o valor em reais?");
		reais = sc.nextDouble();
		
		System.out.println("Qual moeda você deseja converter?\n1 para Dolar\n2 para Yenes");
		escolha = sc.nextInt();
		
		switch(escolha) {
		case 1:
			conversaoDolar(reais);
			System.out.println("US$ "+conversaoDolar);
			break;
		case 2:
			conversaoYenes(reais);
			System.out.println("¥ "+conversaoYenes);
			break;
		}
		
		

	}
	static void conversaoDolar(double reais) {
		conversaoDolar = dolar * reais;		
	}
	static void conversaoYenes(double reais) {
		conversaoYenes = yenes * reais;
	}

}
