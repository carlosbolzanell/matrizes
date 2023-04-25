package funcao;
import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int numero;
		System.out.println("Qual o número?");
		numero = sc.nextInt();
		
		funcao(numero);
		
		

	}
	static void funcao(int numero){
		
		int [] tabuada = {1,2,3,4,5,6,7,8,9,10};
		int [] tabuadaFeita = new int [10];
		
		System.out.println("Tabuada");
		for(int contador=0; contador < tabuada.length; contador++) {
			tabuadaFeita [contador] = numero*tabuada[contador];
			System.out.println(numero +"x"+(contador+1)+ " = "+tabuadaFeita[contador]);
		}
	}

}
