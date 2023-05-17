package atividadeDupla;
import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int escolha, num1, num2;
		
		System.out.println("Número 1");
		num1 = sc.nextInt();
		
		System.out.println("Número 2");
		num2 = sc.nextInt();
		
		while(true) {
			System.out.print("----Operações Matemáticas----\n");
			System.out.print("|-----------------------------|\n");
			System.out.print("| Opção 1 - Soma              |\n");
			System.out.print("| Opção 2 - Subtração         |\n");
			System.out.print("| Opção 3 - Multiplicação     |\n");
			System.out.print("| Opção 4 - Divisão           |\n");
			System.out.print("| Opção 5 - Sair              |\n");
			System.out.print("|-----------------------------|\n");
			System.out.print("Digite uma opção: ");
			escolha = sc.nextInt();
			
			switch (escolha) {
			case 1: 
				setSoma(num1, num2);
				break;
			case 2:
				setSubtracao(num1, num2);
				break;
			case 3: 
				setMultiplicacao(num1, num2);
				break;
			case 4: 
				setDivisao(num1, num2);
			}
		}

	}
	static void setSoma(int num1, int num2) {
		int resposta;
		resposta = num1 + num2;
		System.out.println("A soma de "+num1+ " e "+num2+" é: "+resposta+"\n");
	}
	static void setSubtracao(int num1, int num2) {
		int resposta;
		
		resposta = num1 - num2;
		System.out.println("A subtração de "+num1+ " e "+num2+" é: "+resposta+"\n");
	}
	static void setMultiplicacao(double num1, double num2) {
		double resposta;
		
		resposta = num1 * num2;
		System.out.println("A multiplicação de "+num1+ " e "+num2+" é: "+resposta+"\n");
	}
	static void setDivisao(double num1, double num2) {
		double resposta;
		
		resposta = num1 / num2;
		System.out.println("A divisão de "+num1+ " e "+num2+" é: "+resposta+"\n");
	}

}
