package atividadeDupla;
import java.util.Scanner;

public class ex11 {
	public static void main (String[]args) {
		Scanner sc = new Scanner(System.in);
		
		int numero, aux = 0;
		System.out.println("Numero");
		numero = sc.nextInt();
		
		setMatriz(numero, aux);
	
	}
	static void setMatriz(int numero, int aux) {
		String[][] desenho;
		desenho = new String[numero * 2 + 1][numero * 4 + 1];

		for (int ln = 0; ln < desenho.length; ln++) {
			for (int col = 0; col < desenho[0].length; col++) {
				if (ln == (desenho.length - 1) / 2 || col == (desenho[0].length - 1) / 2) {
					desenho[ln][col] = "*";
				}
			}
		}

		
		for (int ln = 0; ln < desenho.length / 2; ln++) {
			int contador = ln + 1;
			for (int col = (desenho[0].length - 2) / 2; col >= 0; col--) {
				if (col % 2 == 0 && contador > 0) {
					desenho[ln][col] = "" + (ln + 1);
					contador--;
				} else {
					desenho[ln][col] = " ";
				}
			}
		}

		
		for (int ln = 0; ln < desenho.length / 2; ln++) {
			int contador = ln + 1;
			for (int col = (desenho[0].length + 1) / 2; col < desenho[0].length; col++) {
				if (col % 2 == 0 && contador > 0) {
					desenho[ln][col] = "" + (ln + 1);
					contador--;
				} else {
					desenho[ln][col] = " ";
				}
			}
		}

		
		for (int ln = desenho.length - 1; ln > (desenho.length - 1) / 2; ln--) {
			int contador = (desenho.length - ln);
			for (int col = (desenho[0].length - 2) / 2; col >= 0; col--) {
				if (col % 2 == 0 && contador > 0) {
					desenho[ln][col] = "" + (desenho.length - ln);
					contador--;
				} else {
					desenho[ln][col] = " ";
				}
			}
		}

		for (int ln = desenho.length - 1; ln > (desenho.length - 1) / 2; ln--) {
			int contador = (desenho.length - ln);
			for (int col = (desenho[0].length + 1) / 2; col < desenho[0].length; col++) {
				if (col % 2 == 0 && contador > 0) {
					desenho[ln][col] = "" + (desenho.length - ln);
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