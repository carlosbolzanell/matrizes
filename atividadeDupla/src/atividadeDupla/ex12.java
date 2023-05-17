package atividadeDupla;
import java.util.Scanner;

public class ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		int numero;
		
		System.out.println("Qual numero?");
		numero = sc.nextInt();
		
		setMatriz(numero);

	}
	static void setMatriz(int numero) {
		String[][] desenho;

		desenho = new String[numero + 2][numero * 4 + 5];

		for (int ln = 0; ln < desenho.length; ln++) {
			for (int col = 0; col < desenho[0].length; col++) {
				if (ln == 0 || ln == desenho.length - 1) {
					if (col == 0 || col == desenho[0].length - 1) {
						desenho[ln][col] = "*";
					} else {
						desenho[ln][col] = "=";
					}
				} else if (col == 0 || col == ((desenho[0].length - 1) / 2) || col == desenho[0].length - 1) {
					desenho[ln][col] = "*";
				}
			}
		}

		for (int ln = 1; ln < desenho.length - 1; ln++) {
			int contador = ln;
			for (int col = 1; col < (desenho[0].length - 1) / 2; col++) {
				if (col % 2 == 0 && contador > 0) {
					desenho[ln][col] = "" + (col / 2);
					contador--;
				} else {
					desenho[ln][col] = " ";
				}
			}
		}

		for (int ln = desenho.length - 2; ln > 0; ln--) {
			int contador = desenho.length - 1 - ln;
			for (int col = desenho[0].length - 2; col > (desenho[0].length - 1) / 2; col--) {
				if (col % 2 == 0 && contador > 0) {
					desenho[ln][col] = "" + ((desenho[0].length - 1 - col) / 2);
					contador--;
				} else {
					desenho[ln][col] = " ";
				}
			}
		}

		for (int ln = 0; ln < desenho.length; ln++) {
			for (int col = 0; col < desenho[0].length; col++) {
				System.out.print(desenho[ln][col]);
			}
			System.out.println();
		}

		
	}
	
}