package atividadeDupla;
import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		while(true) {
		
		System.out.println("Horario");
		String horario = sc.next();
		String[] split = horario.split(":");
		Integer timer = Integer.parseInt(split[0]);
		
		if(timer > 12) {
			System.out.println(setHorario(horario)+" PM");
		}else if (timer == 00){
			System.out.println(12 + ":"+ split[1]+ " AM");
		}else if(timer == 12) {
			System.out.println(12 + ":"+ split[1]+ " PM");
		}else {
			System.out.println(setHorario(horario)+" AM");
		}
	}
		

	}
	static String setHorario(String horario) {
		
		String[] split = horario.split(":");
		Integer horas = Integer.parseInt(split[0]);
		
		if(horas >= 12) {
			horas -= 12;
		}
		return horas.toString()+ ":" + split[1];
	
		
		
	}

}
