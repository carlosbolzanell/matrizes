package atividadeDupla;
import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int prestacao = 0, cont=0; 
		double valorTotal=0;
		
		while (true) {
		
		System.out.println("Prestação");
		prestacao = sc.nextInt();
		
		if (prestacao <=0) {
			break;
		}
		
		System.out.println("Valor da prestação");
		double valor = sc.nextDouble();
		
		System.out.println("Dias em atraso");
		int dias = sc.nextInt();
		
		System.out.println("Total a pagar: "+valorPagamento(valor, dias));
		
		valorTotal += valorPagamento(valor, dias);
		cont++;
		
		}
		
		System.out.println("Quantidades de prestações: "+cont);
		System.out.println("Valor total: "+valorTotal);

	}
	static double valorPagamento(double valor, int dias) {
		
		double pagamentoFinal;
		double totalPagar, totalPagar1;
		
		if(dias == 0) {
			pagamentoFinal = valor;
		}else {
				pagamentoFinal = valor*1.03;
			
			for (int i = 1; i <= dias; i++) {
				pagamentoFinal *= 1.001; 
			}
		}
		
		return pagamentoFinal;
		
	}

}
