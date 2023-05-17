package atividadeDupla;
import java.util.Scanner;

public class ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Escreva a data (DD/MM/AAAA)");
		String data = sc.next();
		String [] meses = data.split("/");
		
		System.out.println(meses[0]+ " de " +setData(data)+ " de "+meses[2]);
		
	}
	static String setData(String data) {
		
		String[] mes = data.split("/");
		
		int mes1 = Integer.parseInt(mes[1]);
		
		String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
		
		return meses[mes1-1];
	}

}
