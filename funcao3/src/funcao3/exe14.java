package funcao3;
import java.util.Scanner;
import java.util.Arrays;

public class exe14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int [] numero = new int[80], prova1 = new int[80], prova2 = new int[80], prova3 = new int[80], prova4 = new int[80], provaFinal = new int[80];
		int [] provaMensal = new int[4];
		
		for(int i=0; i<80; i++) {
			System.out.println("Numero do aluno");
			numero[i] = sc.nextInt();
			
			System.out.println("Nota da prova 1");
			prova1[i] = sc.nextInt();
			
			System.out.println("Nota da prova 2");
			prova2[i] = sc.nextInt();
			
			System.out.println("Nota da prova 3");
			prova3[i] = sc.nextInt();
			
			System.out.println("Nota da prova 4");
			prova4[i] = sc.nextInt();
			
			System.out.println("Nota da Prova Final");
			provaFinal[i] = sc.nextInt();
			
			provaMensal[0] = prova1[i];
			provaMensal[1] = prova2[i];
			provaMensal[2] = prova3[i];
			provaMensal[3] = prova4[i];
			
			}
		setConceito(prova1, prova2, prova3, prova4, provaFinal, provaMensal);
			
			
			
		}
		static String setConceito(int[] prova1, int[] prova2, int[] prova3, int[] prova4, int[] provaFinal, int[] provaMensal) {
			
			int respostaFinal;
			
			Arrays.sort(provaMensal);
			
			
			
			
		
		

	}

}
