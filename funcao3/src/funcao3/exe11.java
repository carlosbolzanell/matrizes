package funcao3;
import java.util.Scanner;

public class exe11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		String texto;
		int cifra;
		
		System.out.println("Digite o texto a ser decodificado");
		texto = sc.next();
		
		System.out.println("Digite o numero de casas");
		cifra = sc.nextInt();
		
		setCifra(texto, cifra);

	}
	static String setCifra(String texto, int cifra) {
		
		texto = texto.toLowerCase();
		
		char [] alfabetoMin = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		String [] alfabetoMai = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
		char [] palavra = new char [texto.length()];
		String nome = null;
		
		for(int i=0; i<texto.length(); i++) {
			
			for(int j=0; j<alfabetoMin.length; j++) {
				
				if(texto.charAt(i) == alfabetoMin[j]) {
					
					if(j+cifra > 25) {
						palavra[i] = alfabetoMin[j - 26 + cifra];
					}else {
						palavra[i] = alfabetoMin[j + cifra];
					}
					
					System.out.print(palavra[i]);
				}
			}
			
		}
		return nome;
		
		
	}

}
