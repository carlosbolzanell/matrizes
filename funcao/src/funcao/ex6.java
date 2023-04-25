package funcao;
import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub]
		Scanner sc = new Scanner (System.in);
		
		int mes;
		
		System.out.println("Diga o número do mês");
		mes = sc.nextInt();
		
		funcao(mes);
		
	}
	static void funcao(int mes) {
	String[] meses = {"janeiro", "fevereiro", "março", "abril", "maio", "junho", "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"};
	
	System.out.println(meses[mes-1]);
	
	}
}

