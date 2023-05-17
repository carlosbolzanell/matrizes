package atividadeDupla;
import java.util.Scanner;

public class JogoDaVelha {
	
	static String[][] jogoVelha = new String [3][3];
	static boolean continuar = true;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		
		int ln=0, cl=0, contJogadas=0;
		
		tabuleiro();
		
		while (continuar == true){
			boolean adicionado = false;
			
			do {
					
				System.out.println("\n\nJogador 1");
				
				System.out.println("Qual linha?");
				ln = sc.nextInt() -1;
				System.out.println("Qual coluna?");
				cl = sc.nextInt() -1;
				
				adicionado = jogadasX(ln, cl);
				contJogadas++;
			
			}while (!adicionado);
			
			verificacoes();
			
			
			
			if (continuar == false) {
				break;
			}
			
			do {
				System.out.println("\n\nJogador 2");
				
				System.out.println("Qual linha?");
				ln = sc.nextInt() -1;
				System.out.println("Qual coluna?");
				cl = sc.nextInt() -1;
				
				adicionado = jogadasO(ln, cl);
				contJogadas++;
			
			}while (!adicionado);
			
			verificacoes();

		}
		
		

	}
	static void tabuleiro() {
		
		for(int linha=0; linha<jogoVelha.length; linha++) {
			for(int coluna=0; coluna<jogoVelha[0].length; coluna++) {
				jogoVelha[linha][coluna] = "   ";
				System.out.print(jogoVelha[linha][coluna]);
				
				if(coluna == 0 || coluna == 1) {
					System.out.print(" | ");
				}
			}
			if(linha == 0 || linha == 1) {
				System.out.println("\n----------------");
			}
		}
	}
	static boolean verificPosicao(int ln, int cl) {
		if(ln <= 2 && cl <= 2 && ln>=0 && cl >=0 && jogoVelha[ln][cl] == "   ") {
			return true;
		}
		return false;
	}
	static boolean jogadasX(int ln, int cl) {
		boolean adicionado = verificPosicao(ln, cl);
		
		
		for(int linha=0; linha<jogoVelha.length; linha++) {
			for(int coluna=0; coluna<jogoVelha[0].length; coluna++) {
				if(verificPosicao(ln, cl) == true) {
					jogoVelha[ln][cl] = " X ";
				}
				System.out.print(jogoVelha[linha][coluna]);
				
				if(coluna == 0 || coluna == 1) {
					System.out.print(" | ");
				}
			}
			if(linha == 0 || linha == 1) {
				System.out.println("\n----------------");
			}
		}
		return adicionado;
		
	}
	static boolean jogadasO(int ln, int cl) {
		boolean adicionado = verificPosicao(ln, cl);
		
		for(int linha=0; linha<jogoVelha.length; linha++) {
			for(int coluna=0; coluna<jogoVelha[0].length; coluna++) {
				if(verificPosicao(ln, cl) == true) {
					jogoVelha[ln][cl] = " O ";
				}
				System.out.print(jogoVelha[linha][coluna]);
				
				if(coluna == 0 || coluna == 1) {
					System.out.print(" | ");
				}
			}
			if(linha == 0 || linha == 1) {
				System.out.println("\n----------------");
			}
		}
		return adicionado;
	}
	static void verificacoes(){
		
		verificLinha();
		verificColuna();
		verificDiagonal1();
		verificDiagonal2();
		verificEmpate();
		
	}
	static void verificVencedor(int contX ,int contO) {
		
		if (contX >= 3) {
			System.out.println("\n\nJogador 1 ganhou");
			continuar = false;
		}else if(contO >= 3) {
			System.out.println("\n\nJogador 2 ganhou");
			continuar = false;
		
		}
	}
	static void verificEmpate() {
		int contJogadas=0;
		
		for(int ln =0; ln<3; ln++) {
			for(int cl=0; cl<3; cl++) {
				if(jogoVelha[ln][cl].equals(" X ") || (jogoVelha[ln][cl].equals(" O "))) {
					contJogadas++;
				}
			}
		}
		if (contJogadas == 9) {
			System.out.println("\n\nDeu velha");
			continuar = false;
		}
	}
	
	static void verificLinha() {
		
		for (int linha =0; linha<3; linha++) {
			
			int contX = 0;
			int contO = 0;
			
			for(int coluna =0; coluna<3; coluna++) {
				if(jogoVelha[linha][coluna].equals(" X ")) {
					contX++;
				}else if(jogoVelha[linha][coluna].equals(" O ")) {
					contO++;
				}
			}
			verificVencedor(contX, contO);
		}
	}
		

	static void verificColuna() {
		
		for (int coluna = 0; coluna < 3; coluna++) {
			int contX = 0, contO =0;
			
			for(int linha = 0; linha < 3; linha++) {
				if(jogoVelha[linha][coluna] == " X ") {
					contX++;
				}else if(jogoVelha[linha][coluna] == " O "){
					contO++;
				}
			}
			verificVencedor (contX, contO);
		}
	}
	static void verificDiagonal1() {
		
		int contX=0, contO = 0;
		
		for(int linha=0; linha<3; linha++) {
			for(int coluna=0; coluna<3; coluna++) {
				if (linha == coluna) {
					if(jogoVelha[linha][coluna] == " X ") {
						contX++;
					}else if(jogoVelha[linha][coluna] == " O ") {
						contO++;
					}
				}
			}
			verificVencedor (contX, contO);
		}
	}
	static void verificDiagonal2() {
		int contX=0, contO = 0;
		
		for (int linha =0; linha<3; linha++) {
			for(int coluna =0; coluna<3; coluna++) {
				if (coluna+1 == jogoVelha.length - linha) {
					if (jogoVelha[linha][coluna] == " X ") {
						contX++;
					}else if(jogoVelha[linha][coluna] == " O ") {
						contO++;
					}
				}
			}
			verificVencedor (contX, contO);
		}
	}
		


}
