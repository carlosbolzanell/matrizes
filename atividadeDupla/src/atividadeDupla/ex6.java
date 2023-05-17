package atividadeDupla;
import java.util.Scanner;
import java.util.Random;

public class ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		Random rd = new Random();
		
			System.out.println("Jogar dados");
			
			int dados = rd.nextInt(12)+2;
			System.out.println(dados);
			
			setPerda(dados);
			
			setGanha(dados);
			
			if (dados >3 && dados < 11) {
				
				while (true) {
					System.out.println("jogar dados");
					int dados2 = rd.nextInt(12)+2;
					System.out.println(dados2);
					
					if (dados2 == dados) {
						System.out.println("Ganhou");
						break;
					}else if(dados2 == 7) {
						System.out.println("Perdeu");
						break;
					}
					
				}
				
			}
			
		
	}
	static void setPerda(int dados) {
		
		if(dados == 2 || dados == 3 || dados == 12 ) {
			System.out.println("Perdeu");
		}
	}
	static void setGanha(int dados) {
		
		if (dados == 7 || dados == 11) {
			System.out.println("Ganhou");
		}
	}
}
