package provaFunction;
import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual a primeira nota do aluno?");
		double nota1 = sc.nextDouble();
		
		System.out.println("Qual a segunda nota do aluno?");
		double nota2 = sc.nextDouble();
		
		System.out.println("Qual a terceira nota do aluno?");
		double nota3 = sc.nextDouble();
		
		System.out.println("Qual a média?\nA-Media Aritimética\nP-Media Ponderada\nH-Média Harmônica");
		String letra = sc.next();
		
		if(letra.equals("a") || letra.equals("A")) {
			System.out.println("Media Aritimética: "+mediaAritimetica(nota1, nota2, nota3));
		}else if(letra.equals("p") || letra.equals("P")) {
			System.out.println("Media Ponderada: "+mediaPonderada(nota1, nota2, nota3));
		}else if(letra.equals("h") || letra.equals("H") ) {
			System.out.println("Media Harmônica: "+mediaHarmonica(nota1, nota2, nota3));
		}
		
	}
	static double mediaAritimetica(double nota1, double nota2, double nota3){
		double mediaA;
		
		mediaA = (nota1+nota2+nota3)/3;
		return mediaA;
	}
	
	
	static double mediaPonderada(double nota1, double nota2, double nota3) {
		
		double mediaP;
		
		mediaP = ((nota1*5)+(nota2*3)+(nota3*2))/10;
		return mediaP;
	}
	
	
	static double mediaHarmonica(double nota1, double nota2, double nota3) {
		double mediaH;
		
		mediaH = 3/((1/nota1)+(1/nota2)+(1/nota3));
		return mediaH;
	}
	
	

}
