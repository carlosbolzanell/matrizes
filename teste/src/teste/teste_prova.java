package teste;

import java.util.Scanner;
import java.util.Random;
public class teste_prova 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		int jogadores, cont=0, cont1=0;
		
		
		System.out.println("SUDOKU");
		
		System.out.println("\nQuantos jogadores vão jogar?");
		jogadores = sc.nextInt();
		
		String [] nomes = new String[jogadores];
		int [][] sudoku = new int [9][9];
//		int[][] n = {{0,3,2,5,7,9,4,6,8},{4,9,8,2,6,1,3,7,5},{7,5,6,3,8,4,2,1,9},{6,4,3,1,5,8,7,9,2},{5,2,1,7,9,3,8,4,6},{9,8,7,4,2,6,5,3,1},{2,1,4,9,3,5,6,8,7},{3,6,5,8,1,7,9,2,4},{8,7,9,6,4,2,1,5,3}};
		int[][] n1 = {{1,3,2,5,7,9,4,6,8},{4,9,8,2,6,1,3,7,0},{7,5,6,3,8,4,2,1,9},{6,4,3,1,5,8,7,9,2},{5,2,1,7,9,3,8,4,6},{9,8,7,4,2,6,5,3,1},{2,1,4,9,3,5,6,8,7},{3,6,5,8,1,7,9,2,4},{8,7,9,6,4,2,1,3,0}};
//		
		for(int jogadas=0; jogadas<jogadores; jogadas++) 
		{
			System.out.println("Qual o nome do jogador "+(jogadas+1)+"?");
			nomes[jogadas] = sc.next();
		}
		
		
		for(int contador1=0; contador1 < jogadores; contador1++) 
		{
			
			System.out.println("Sudoku de "+nomes[contador1]);
		
			for(int linha=0; linha<sudoku.length; linha++) 
			{
				for(int coluna=0; coluna<sudoku[0].length; coluna++) 
				{

					sudoku[linha][coluna] = n1[linha][coluna];
				
					if(coluna==0 || coluna==3 || coluna==6) 
					{
						System.out.print("| "+sudoku[linha][coluna]+" ");
					}else 
					{
						System.out.print(sudoku[linha][coluna]+" ");
					}
				
				}
					System.out.print("|\n");
					if(linha==2 || linha==5 || linha==8) 
					{
						System.out.print("-------------------------");
						System.out.print("\n");
	
					}	
		
			}
				for(int contador=0; contador<1; contador++)
				{
			
					int escolha, linhas, colunas;
			
					System.out.println("Qual numero?");
					escolha = sc.nextInt();
					System.out.println("Qual linha?");
					linhas = sc.nextInt();
					System.out.println("Qual coluna?");
					colunas = sc.nextInt();
			
					if(escolha<1 || escolha>9) 
					{
						System.out.println("Jogada inválida");
						System.exit(0);
					}
					
					for(int linha=0; linha<9; linha++) 
					{
						if (escolha == sudoku[linha][colunas]) 
						{
							cont++;
						}
					}
					
					for(int coluna=0; coluna<9; coluna++) 
					{
						if (escolha == sudoku[linhas][coluna])
						{
							cont++;
						}
					}
			
					for(int linha=0; linha<3; linha++) 
					{
						for(int coluna=0; coluna<3; coluna++) 
						{
					
							for(int subLinha =0; subLinha<3; subLinha++) 
							{
								for(int subColuna =0; subColuna<3; subColuna++) 
								{
									if(escolha == sudoku[linhas][colunas]) 
									{
										cont++;
									}
								}
							}
						}
					}
			
					System.out.println("Sudoku de: "+nomes[contador1]);
			
			
					for(int linha=0; linha<sudoku.length; linha++) 
					{
						for(int coluna=0; coluna<sudoku[0].length; coluna++) 
						{
					
					
							sudoku[linhas][colunas]	= escolha;
					
					
							if(coluna==0 || coluna==3 || coluna==6) 
							{
								System.out.print("| "+sudoku[linha][coluna]+" ");
							}else 
							{
								System.out.print(sudoku[linha][coluna]+" ");
							}
				
					
						}
						System.out.print("|\n");
						if(linha==2 || linha==5 || linha==8)
						{
							System.out.print("-------------------------");
							System.out.print("\n");


						}
					}
				}
				for(int linha=0; linha<9; linha++) 
				{
					for(int coluna=0; coluna<9; coluna++) 
					{
						if(sudoku[linha][coluna] == 0) 
						{
							cont++;
						}
					}
				}
				System.out.println("Sudoku de "+nomes[contador1]);
			
			
				if(cont != 0) 
				{
					System.out.println("Não");
				}else 
				{
					System.out.println("Sim");
				}
				
				for(int linha=0; linha<sudoku.length; linha++) 
				{
					for(int coluna=0; coluna<sudoku[0].length; coluna++) 
					{
						if(coluna==0 || coluna==3 || coluna==6) 
						{
							System.out.print("| "+sudoku[linha][coluna]+" ");
						}else 
						{
							System.out.print(sudoku[linha][coluna]+" ");
						}
							
					}
					
					System.out.print("|\n");
						if(linha==2 || linha==5 || linha==8)
						{
							System.out.print("-------------------------");
							System.out.print("\n");
				
						}
				}
		}
	}
		
}			





