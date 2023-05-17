package provaFunction;
import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Qual o tamanho da lista?");
		int tamanho = sc.nextInt();
		
		int[] lista = new int[tamanho];
		
		for(int cont = 0; cont<lista.length; cont++) {
			System.out.println("Qual o numero "+(cont+1)+ " da lista?");
			lista[cont] = sc.nextInt();
		}
		
		System.out.println("O numero que mais se repete é o: "+setRepetidos(lista));

	}
	static int setRepetidos(int[] lista) {
		
		int numero=0, maiorRepetido=0;
		
		for(int cont= 0; cont<lista.length; cont++) {
			int repetido = 0;
			for(int cont2=0; cont2<lista.length; cont2++) {
				if(lista[cont2] == lista[cont]) {
					repetido++;
					if (repetido>maiorRepetido) {
						maiorRepetido = repetido;
						numero = lista[cont2];
					}
				}
			}
		}
		return numero;
	}

}
