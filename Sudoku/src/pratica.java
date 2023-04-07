import java.util.Scanner;
public class pratica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int jogadores;
		String nomes;
		
		System.out.println("                              ***REGRAS***                                   ");
		System.out.println("Não pode repetir os mesmos números nas mesmas linhas, colunas e casinhas(3x3)");
		
		System.out.println("\nQuantos jogadores vão jogar?");
		jogadores = sc.nextInt();
		
		for(int jogadas=0; jogadas<jogadores; jogadas++) {
			System.out.println("Qual o seu nome?");
			nomes = sc.next();
		}
		int [][] sudoku = new int [9][9];
		System.out.println("=========SUDOKU==========");
		for(int linha=0; linha<sudoku.length; linha++) {
			for(int coluna=0; coluna<sudoku[0].length; coluna++) {
				sudoku[linha][coluna] = 0;
				if(coluna==0 || coluna==3 || coluna==6) {
					System.out.print("| "+sudoku[linha][coluna]+" ");
				}else {
					System.out.print(sudoku[linha][coluna]+" ");
				}
				
			}
			System.out.print("|\n");
			if(linha==2 || linha==5 || linha==8) {
				System.out.print("-------------------------");
			System.out.print("\n");
	
		}
		
	}
		for(int contador=0; contador<81; contador++) {
			
			int escolha, linhas, colunas;
			System.out.println("Qual numero?");
			escolha = sc.nextInt();
			System.out.println("Qual linha?");
			linhas = sc.nextInt();
			System.out.println("Qual coluna?");
			colunas = sc.nextInt();
			
			System.out.println("=========SUDOKU==========");
			for(int linha=0; linha<sudoku.length; linha++) {
				for(int coluna=0; coluna<sudoku[0].length; coluna++) {
					
					sudoku[linhas][colunas]	=escolha;
					
					if(coluna==0 || coluna==3 || coluna==6) {
						System.out.print("| "+sudoku[linha][coluna]+" ");
					}else {
						System.out.print(sudoku[linha][coluna]+" ");
					}
				
					
				}
				System.out.print("|\n");
				if(linha==2 || linha==5 || linha==8) {
					System.out.print("-------------------------");
				System.out.print("\n");


					}
				

				}
			}
		for(int linha=0; linha<sudoku.length; linha++) {
			for(int coluna=0; coluna<sudoku[0].length; coluna++) {
				if(sudoku[linha][coluna] == sudoku[linha][0] || sudoku[linha][coluna] == sudoku[linha][1] || sudoku[linha][coluna] == sudoku[linha][2] || sudoku[linha][coluna] == sudoku[linha][3] || sudoku[linha][coluna] == sudoku[linha][4] || sudoku[linha][coluna] == sudoku[linha][5] || sudoku[linha][coluna] == sudoku[linha][6] || sudoku[linha][coluna] == sudoku[linha][7] || sudoku[linha][coluna] == sudoku[linha][8]) {
				System.out.println("Sudoku errado!!");
			}else if(sudoku[linha][coluna] == sudoku[0][coluna] || sudoku[linha][coluna] == sudoku[1][coluna] || sudoku[linha][coluna] == sudoku[2][coluna]);
			}
		}		
	}
}


