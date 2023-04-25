package procedimento;
import java.util.Scanner;
import java.util.Random;

public class ex6 {
	static int numeroSorteado=0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int resposta;
	
		System.out.println("Sortear numero?\n1-Sim\n2-Não");
		resposta = sc.nextInt();
			
		if(resposta==1) {
			sorteio();
				
			pergunta();
		}else {
			System.out.println("Obrigado pelo seu tempo, tenha um ótimo dia!");
		}
		
		

	}
	static void sorteio() {
		Random random = new Random();
		
		numeroSorteado = random.nextInt(1000);
		
		
	}
	static void pergunta() {
		Scanner sc = new Scanner (System.in);
		int palpite, cont1=0, cont2=0;
		
		do {
			System.out.println("Palpite para o numero sorteado");
			palpite = sc.nextInt();
		
			if(palpite > numeroSorteado) {
				System.out.println("Menor \n");
				cont1++;
			}else if(palpite < numeroSorteado){
				System.out.println("Maior \n");
				cont1++;
			}else {
				System.out.println("Arcetou, Parabéns!!\n");
				cont2++;
			}
		}while(cont2==0);
		
		System.out.println("O ususario acertou o número em: "+cont1+ " tentativas");
		
	}

}