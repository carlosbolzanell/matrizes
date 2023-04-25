package procedimento;
import java.util.Scanner;

public class ex3 {
	static int hojeDia = 19, hojeMes=4, hojeAno=2023, x=0, conversaoDia=0;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int lingua;
		
		System.out.println("Quantos dias a mais?");
		x = sc.nextInt();	
		System.out.println("What language?");
		System.out.println("1-Portgues");
		System.out.println("2-English");
		System.out.println("3-Russian");
		System.out.println("4-French");
		System.out.println("5-German");
		System.out.println("6-Spanish");
		lingua = sc.nextInt();
		
		conversao();
		System.out.println(hojeDia+"/"+hojeMes+"/"+hojeAno);
		
		switch(lingua) {
		case 1:
			conversaoPortugues();
			break;
		case 2:
			Ingles();
			break;
		case 3: 
			russo();
			break;
		case 4:
			frances();
			break;
		case 5: 
			alemao();
			break;
		case 6: 
			espanhol();
			break;
		}

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
	static void conversaoPortugues() {
		
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
			System.out.println("Terça-feira");
		}
	}
	static void Ingles() {
		
		conversaoDia = x%7; 
		
		switch(conversaoDia) {
		case 0:
			System.out.println("Wednesday");
			break;
		case 1:
			System.out.println("Thursday");
			break;
		case 2: 
			System.out.println("Friday");
			break;
		case 3:
			System.out.println("Saturday");
			break;
		case 4:
			System.out.println("Sunday");
			break;
		case 5: 
			System.out.println("Monday");
			break;
		case 6: 
			System.out.println("Tuesday");
		}
	}
	static void russo() {
conversaoDia = x%7; 
		
		switch(conversaoDia) {
		case 0:
			System.out.println("Среда");
			break;
		case 1:
			System.out.println("Четверг");
			break;
		case 2: 
			System.out.println("Пятница");
			break;
		case 3:
			System.out.println("Суббота");
			break;
		case 4:
			System.out.println("Воскресенье");
			break;
		case 5: 
			System.out.println("Понедельник");
			break;
		case 6: 
			System.out.println("Вторник");
		}
	}
	static void frances() {
		conversaoDia = x%7; 
		
		switch(conversaoDia) {
		case 0:
			System.out.println("Mercredi");
			break;
		case 1:
			System.out.println("Jeudi");
			break;
		case 2: 
			System.out.println("Vendredi");
			break;
		case 3:
			System.out.println("Samedi");
			break;
		case 4:
			System.out.println("Dimanche");
			break;
		case 5: 
			System.out.println("Lundi");
			break;
		case 6: 
			System.out.println("Mardi");
		}
	}
	static void alemao() {
		conversaoDia = x%7; 
		
		switch(conversaoDia) {
		case 0:
			System.out.println("Mittwoch");
			break;
		case 1:
			System.out.println("Donnerstag");
			break;
		case 2: 
			System.out.println("Freitag");
			break;
		case 3:
			System.out.println("Samstag");
			break;
		case 4:
			System.out.println("Sonntag");
			break;
		case 5: 
			System.out.println("Montag");
			break;
		case 6: 
			System.out.println("Dienstag");
		}
	}
	static void espanhol(){
		conversaoDia = x%7; 
		
		switch(conversaoDia) {
		case 0:
			System.out.println("miércoles");
			break;
		case 1:
			System.out.println("jueves");
			break;
		case 2: 
			System.out.println("viernes");
			break;
		case 3:
			System.out.println("Sábado");
			break;
		case 4:
			System.out.println("Domingo");
			break;
		case 5: 
			System.out.println("Lunes");
			break;
		case 6: 
			System.out.println("martes");
		}
	}
}

