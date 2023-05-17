package funcao3;

public class ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=0;
		
		for (int numero = 1000; numero<10000; numero++) {
			if(setNumero(numero) == true) {
				System.out.println(numero);
			}
			
		}
		

	}
	static boolean setNumero(int numero) {
		int primeirosDigitos, segundosDigitos, resultado, numeroFinal;
		
		primeirosDigitos = numero/100;
		segundosDigitos = numero%100;
		resultado = primeirosDigitos + segundosDigitos;
		numeroFinal = resultado*resultado;
		
		if (numeroFinal == numero) {
			return true;
		}
		return false;
		
	}

}
