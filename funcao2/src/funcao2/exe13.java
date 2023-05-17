package funcao2;
import java.util.Scanner;

public class exe13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		String sequencia;
		
		System.out.println("Qual a sequencia?");
		sequencia = sc.next();
		
		if(binario(sequencia) == true){
			System.out.println("Binário");
		}else {
			System.out.println("Não binário");
		}

	}
	static boolean binario(String sequencia) {
		
		for (int i=0; i<sequencia.length(); i++) {
			char c = sequencia.charAt(i);
			if (c!='0' && c!='1') {
				return false;

			}
		}
		return true;
	}

}
