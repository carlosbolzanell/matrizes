package funcao3;

public class ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean resposta;
		for(int numero=1; numero<500; numero++) {
			resposta = primos100(numero);
			 if( resposta == true){
				 System.out.println(numero);
			 }
			
		}

	}
	static boolean primos100(int numero) {
		
		int soma=0;
		
		for(int i=1; i<numero; i++) {
			if(numero % i == 0) {
				soma += i;
			}
		}
		if(soma == numero) {
			return true;
		}
		return false;
	}



}
