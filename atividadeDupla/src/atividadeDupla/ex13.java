package atividadeDupla;
import java.util.Scanner;

public class ex13 {

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

		if (numero % 2 == 0) {
			desenho = new String[numero / 2 + 1][numero * 2 - 1];

			for (int ln = 0; ln < desenho.length; ln++) {
				for (int col = 0; col < desenho[0].length; col++) {
					if (col % 2 == 0 && ln != desenho.length - 1) {
						desenho[ln][col] = "" + (ln * 2 + 2);
					} else {
						desenho[ln][col] = " ";
					}
				}
			}

			for (int ln = 0; ln < desenho.length - 2; ln++) {
				int contador = ((desenho[0].length - 1) / 2) - (ln * 2 + 1);
				for (int col = 0; col < (desenho[0].length - 1) / 2; col++) {
					if (contador > 0) {
						desenho[ln][col] = " ";
						contador--;
					}
				}
			}

			for (int ln = 0; ln < desenho.length - 2; ln++) {
				int contador = ((desenho[0].length - 1) / 2) - (ln * 2 + 1);
				for (int col = desenho[0].length - 1; col > (desenho[0].length + 1) / 2; col--) {
					if (contador > 0) {
						desenho[ln][col] = " ";
						contador--;
					}
				}
			}
		} else {
			desenho = new String[((numero + 1) / 2) + 1][numero * 2 - 1];

			for (int ln = 0; ln < desenho.length; ln++) {
				for (int col = 0; col < desenho[0].length; col++) {
					if (col % 2 == 0 && ln != desenho.length - 1) {
						desenho[ln][col] = "" + (ln * 2 + 1);
					} else {
						desenho[ln][col] = " ";
					}
				}
			}

			for (int ln = 0; ln < desenho.length - 2; ln++) {
				int contador = ((desenho[0].length - 1) / 2) - (ln * 2);
				for (int col = 0; col < (desenho[0].length - 1) / 2; col++) {
					if (contador > 0) {
						desenho[ln][col] = " ";
						contador--;
					}
				}
			}

			for (int ln = 0; ln < desenho.length - 2; ln++) {
				int contador = ((desenho[0].length - 1) / 2) - (ln * 2);
				for (int col = desenho[0].length - 1; col > (desenho[0].length + 1) / 2; col--) {
					if (contador > 0) {
						desenho[ln][col] = " ";
						contador--;
					}
				}
			}
		}
		
		for (int col = 0; col < desenho[0].length; col++) {
			desenho[desenho.length - 1][col] = "=";
		}

		for (int ln = 0; ln < desenho.length; ln++) {
			for (int col = 0; col < desenho[0].length; col++) {
				System.out.print(desenho[ln][col]);
			}
			System.out.println();
		}
	}
}