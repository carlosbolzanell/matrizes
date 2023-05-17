package funcao3;
import java.util.Scanner;

public class exe10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		 double peso, altura;
		 
		 System.out.println("Peso (kg)");
		 peso = sc.nextDouble();
		 System.out.println("Altura (metros)");
		 altura = sc.nextDouble();
		 
		 System.out.println(setImc(peso, altura));
		 			
	}
	static String setImc(double peso, double altura) {
		
		String interpretacao;
		
		double imc;
		
		imc = peso/(altura*altura);
		
		if(imc < 20) {
			interpretacao = "Magro";
		}else if(imc <25) {
			interpretacao = "Normal";
		}else if(imc <30) {
			interpretacao = "Acima do peso";
		}else if(imc <34) {
			interpretacao = "Obeso";
		}else {
			interpretacao = "Muito Obeso";
		}
		return interpretacao;
		
	}

}
