package funcao2;
import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		int potencial, expoente;
		System.out.println("numero");
		potencial = sc.nextInt();
		System.out.println("expoente");
		expoente = sc.nextInt();
		
		System.out.println(funcao(potencial, expoente));

	}
	static int funcao(int potencial, int expoente) {
		
		int valor = 1;
		
		for(int i=0; i<expoente; i++) {
			valor *= potencial;
		}
		return valor;
	}

}
