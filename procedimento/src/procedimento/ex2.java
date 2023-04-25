package procedimento;
import java.util.Scanner;

public class ex2 {
	static int hojeDia = 19, hojeMes=4, hojeAno=2023, x=0, conversaoDia=0;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Quantos dias a mais?");
		x = sc.nextInt();
		
		conversao();
		System.out.println("será "+hojeDia+"/"+hojeMes+"/"+hojeAno);
		
		conversaoSemana();
		System.out.println();

	}
	static void conversao() {
		hojeDia += x;
		
		while(hojeDia>30) {
			hojeDia -=30;
			hojeMes++;
			
		}
		
		while(hojeMes>12) {
			hojeMes -=12;
			hojeAno++;
		}

	}
	static void conversaoSemana() {
		
		conversaoDia = x%7; 
		
		switch(conversaoDia) {
		case 0:
			System.out.println("Quarta-Feira");
			break;
		case 1:
			System.out.println("Quinta-Feira");
			break;
		case 2: 
			System.out.println("Sexta-Feira");
			break;
		case 3:
			System.out.println("Sábado");
			break;
		case 4:
			System.out.println("Domingo");
			break;
		case 5: 
			System.out.println("Segunda-Feira");
			break;
		case 6: 
			System.out.println("Terça-Feira");
		}
	}
}
