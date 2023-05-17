package funcao2;
import java.util.Scanner;

public class exe12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		String nome;
		
		System.out.println("Qual o seu nome?");
		nome = sc.nextLine();
		
		
		System.out.println(obterSobrenome(nome));

	}
	static String obterSobrenome(String nome) {
		String[] sobrenome = nome.split(" ");
		String resultado = sobrenome[sobrenome.length-1];
		return resultado;
	}

}
