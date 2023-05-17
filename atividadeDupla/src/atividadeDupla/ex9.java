package atividadeDupla;
import java.util.Scanner;

public class ex9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		int numero, aux = 0;
		
		System.out.println("Digite um valor para n");
		numero = sc.nextInt();
		
		setMatriz(numero, aux);
		
	}
	static void setMatriz(int numero, int aux) {
		
		String[][] desenho;


		desenho = new String[numero + 3][numero * 4 + 5];

		for (int ln = 0; ln < desenho.length; ln++) {
			for (int col = 0; col < desenho[0].length; col++) {
				if (ln == 0 || ln == desenho.length - 1) {
					if (col == 0 || col == desenho[0].length - 1) {
						desenho[ln][col] = "*";
					} else if (ln == 0) {
						desenho[ln][col] = "=";
					} else {
						desenho[ln][col] = "-";
					}
				} else if (col == 0 || col == desenho[0].length - 1) {
					desenho[ln][col] = "*";
				} else if (col == (desenho[0].length - 1) / 2) {
					desenho[ln][col] = "*";
				} else if (ln == desenho.length - 2) {
					desenho[ln][col] = " ";
				}
			}
		}

		for (int ln = desenho.length - 3; ln > 0; ln--) {
			int contador = ((desenho.length - 2) - ln);
			for (int col = (desenho[0].length - 2) / 2; col > 0; col--) {
				if (col % 2 == 0 && contador > 0) {
					desenho[ln][col] = "" + ((desenho.length - 2) - ln);
					contador--;
				} else {
					desenho[ln][col] = " ";
				}
			}
		}

		for (int ln = desenho.length - 3; ln > 0; ln--) {
			int contador = ((desenho.length - 2) - ln);
			for (int col = (desenho[0].length + 1) / 2; col < desenho[0].length - 1; col++) {
				if (col % 2 == 0 && contador > 0) {
					desenho[ln][col] = "" + ((desenho.length - 2) - ln);
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