import javax.swing.JOptionPane;
import java.util.Scanner;
import java.util.ArrayList;

public class main {

	public static void main(String[] args) {

		Aeroporto voo1 = new Aeroporto(1, "707", 190);
		int cont1 = 200;
		Aeroporto voo2 = new Aeroporto(2, "727", 130);
		int cont2 = 170;
		Aeroporto voo3 = new Aeroporto(3, "707", 230);
		int cont3 = 200;
		Aeroporto voo4 = new Aeroporto(4, "737", 150);
		int cont4 = 120;
		Aeroporto voo5 = new Aeroporto(5, "727", 210);
		int cont5 = 170;
		Aeroporto voo6 = new Aeroporto(6, "727", 120);
		int cont6 = 170;
		Aeroporto voo7 = new Aeroporto(7, "737", 140);
		int cont7 = 120;
		Aeroporto voo8 = new Aeroporto(8, "707", 200);
		int cont8 = 200;
		Aeroporto voo9 = new Aeroporto(9, "737", 250);
		int cont9 = 120;
		Aeroporto voo10 = new Aeroporto(10, "707", 90);
		int cont10 = 200;

		boolean continuar = true;

		while (continuar) {
			String escolha = JOptionPane.showInputDialog("Deseja reservar um voo?\n1 - Sim\n2 - Não ");
			if (escolha.equals("1")) {
				JOptionPane.showInputDialog("Digite sua identidade: ");
				String numVoo = JOptionPane.showInputDialog("Digite o numero do voo: ");
				if (numVoo.equals("1")) {
					cont1--;
					if (cont1 <= -1) {
						JOptionPane.showMessageDialog(null, "VOÔ LOTADO!!", "Informação",
								JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(null, "Reserva concluida!"+
					"\nNúmero do voo: "+voo1.getNumeroVoo()+
					"\nPreço:"+voo1.getPreco(), "Informação",
								JOptionPane.INFORMATION_MESSAGE);
					}
				} else if (numVoo.equals("2")) {
					cont2--;
					if (cont2 <= -1) {
						JOptionPane.showMessageDialog(null, "VOÔ LOTADO!!", "Informação",
								JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(null, "Reserva concluida!"+
					"\nNúmero do voo: "+voo2.getNumeroVoo()+
					"\nPreço:"+voo2.getPreco(), "Informação",
								JOptionPane.INFORMATION_MESSAGE);
					}
				} else if (numVoo.equals("3")) {
					cont3--;
					if (cont3 <= -1) {
						JOptionPane.showMessageDialog(null, "VOÔ LOTADO!!", "Informação",
								JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(null, "Reserva concluida!"+
					"\nNúmero do voo: "+voo3.getNumeroVoo()+
					"\nPreço:"+voo3.getPreco(), "Informação",
								JOptionPane.INFORMATION_MESSAGE);
					}
				} else if (numVoo.equals("4")) {
					cont4--;
					if (cont4 <= -1) {
						JOptionPane.showMessageDialog(null, "VOÔ LOTADO!!", "Informação",
								JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(null, "Reserva concluida!"+
					"\nNúmero do voo: "+voo4.getNumeroVoo()+
					"\nPreço:"+voo4.getPreco(), "Informação",
								JOptionPane.INFORMATION_MESSAGE);
					}
				} else if (numVoo.equals("5")) {
					cont5--;
					if (cont5 <= -1) {
						JOptionPane.showMessageDialog(null, "VOÔ LOTADO!!", "Informação",
								JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(null, "Reserva concluida!"+
					"\nNúmero do voo: "+voo5.getNumeroVoo()+
					"\nPreço:"+voo5.getPreco(), "Informação",
								JOptionPane.INFORMATION_MESSAGE);
					}
				} else if (numVoo.equals("6")) {
					cont6--;
					if (cont6 <= -1) {
						JOptionPane.showMessageDialog(null, "VOÔ LOTADO!!", "Informação",
								JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(null, "Reserva concluida!"+
					"\nNúmero do voo: "+voo6.getNumeroVoo()+
					"\nPreço:"+voo6.getPreco(), "Informação",
								JOptionPane.INFORMATION_MESSAGE);
					}
				} else if (numVoo.equals("7")) {
					cont7--;
					if (cont7 <= -1) {
						JOptionPane.showMessageDialog(null, "VOÔ LOTADO!!", "Informação",
								JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(null, "Reserva concluida!"+
					"\nNúmero do voo: "+voo7.getNumeroVoo()+
					"\nPreço:"+voo7.getPreco(), "Informação",
								JOptionPane.INFORMATION_MESSAGE);
					}
				} else if (numVoo.equals("8")) {
					cont8--;
					if (cont8 <= -1) {
						JOptionPane.showMessageDialog(null, "VOÔ LOTADO!!", "Informação",
								JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(null, "Reserva concluida!"+
					"\nNúmero do voo: "+voo8.getNumeroVoo()+
					"\nPreço:"+voo8.getPreco(), "Informação",
								JOptionPane.INFORMATION_MESSAGE);
					}
				} else if (numVoo.equals("9")) {
					cont9--;
					if (cont9 <= -1) {
						JOptionPane.showMessageDialog(null, "VOÔ LOTADO!!", "Informação",
								JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(null, "Reserva concluida!"+
					"\nNúmero do voo: "+voo9.getNumeroVoo()+
					"\nPreço:"+voo9.getPreco(), "Informação",
								JOptionPane.INFORMATION_MESSAGE);
					}
				} else if (numVoo.equals("10")) {
					cont10--;
					if (cont10 <= -1) {
						JOptionPane.showMessageDialog(null, "VOÔ LOTADO!!", "Informação",
								JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(null, "Reserva concluida!"+
					"\nNúmero do voo: "+voo10.getNumeroVoo()+
					"\nPreço:"+voo10.getPreco(), "Informação",
								JOptionPane.INFORMATION_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(null, "Voô inexistente", "Informação",
							JOptionPane.INFORMATION_MESSAGE);

				}
			} else {
				continuar = false;
			}
		}

		if (cont1 > 200 * 0.6) {
			JOptionPane.showMessageDialog(null, "Voô 1: Prejuizo", "Informação", JOptionPane.INFORMATION_MESSAGE);
		} else if (cont1 < 200 * 0.6) {
			JOptionPane.showMessageDialog(null, "Voô 1: Lucro", "Informação", JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, "Voô 1: Pagou", "Informação", JOptionPane.INFORMATION_MESSAGE);
		}

		if (cont2 > 170 * 0.6) {
			JOptionPane.showMessageDialog(null, "Voô 2: Prejuizo", "Informação", JOptionPane.INFORMATION_MESSAGE);
		} else if (cont2 < 170 * 0.6) {
			JOptionPane.showMessageDialog(null, "Voô 2: Lucro", "Informação", JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, "Voô 2: Pagou", "Informação", JOptionPane.INFORMATION_MESSAGE);
		}

		if (cont3 > 200 * 0.6) {
			JOptionPane.showMessageDialog(null, "Voô 3: Prejuizo", "Informação", JOptionPane.INFORMATION_MESSAGE);
		} else if (cont3 < 200 * 0.6) {
			JOptionPane.showMessageDialog(null, "Voô 3: Lucro", "Informação", JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, "Voô 3: Pagou", "Informação", JOptionPane.INFORMATION_MESSAGE);
		}

		if (cont4 > 120 * 0.6) {
			JOptionPane.showMessageDialog(null, "Voô 4: Prejuizo", "Informação", JOptionPane.INFORMATION_MESSAGE);
		} else if (cont4 < 120 * 0.6) {
			JOptionPane.showMessageDialog(null, "Voô 4: Lucro", "Informação", JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, "Voô 4: Pagou", "Informação", JOptionPane.INFORMATION_MESSAGE);
		}

		if (cont5 > 170 * 0.6) {
			JOptionPane.showMessageDialog(null, "Voô 5: Prejuizo", "Informação", JOptionPane.INFORMATION_MESSAGE);
		} else if (cont5 < 170 * 0.6) {
			JOptionPane.showMessageDialog(null, "Voô 5: Lucro", "Informação", JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, "Voô 5: Pagou", "Informação", JOptionPane.INFORMATION_MESSAGE);
		}

		if (cont6 > 170 * 0.6) {
			JOptionPane.showMessageDialog(null, "Voô 6: Prejuizo", "Informação", JOptionPane.INFORMATION_MESSAGE);
		} else if (cont6 < 170 * 0.6) {
			JOptionPane.showMessageDialog(null, "Voô 6: Lucro", "Informação", JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, "Voô 6: Pagou", "Informação", JOptionPane.INFORMATION_MESSAGE);
		}

		if (cont7 > 120 * 0.6) {
			JOptionPane.showMessageDialog(null, "Voô 7: Prejuizo", "Informação", JOptionPane.INFORMATION_MESSAGE);
		} else if (cont7 < 120 * 0.6) {
			JOptionPane.showMessageDialog(null, "Voô 7: Lucro", "Informação", JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, "Voô 7: Pagou", "Informação", JOptionPane.INFORMATION_MESSAGE);
		}

		if (cont8 > 200 * 0.6) {
			JOptionPane.showMessageDialog(null, "Voô 8: Prejuizo", "Informação", JOptionPane.INFORMATION_MESSAGE);
		} else if (cont8 < 200 * 0.6) {
			JOptionPane.showMessageDialog(null, "Voô 8: Lucro", "Informação", JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, "Voô 8: Pagou", "Informação", JOptionPane.INFORMATION_MESSAGE);
		}

		if (cont9 > 120 * 0.6) {
			JOptionPane.showMessageDialog(null, "Voô 9: Prejuizo", "Informação", JOptionPane.INFORMATION_MESSAGE);
		} else if (cont9 < 120 * 0.6) {
			JOptionPane.showMessageDialog(null, "Voô 9: Lucro", "Informação", JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, "Voô 9: Pagou", "Informação", JOptionPane.INFORMATION_MESSAGE);
		}

		if (cont10 > 200 * 0.6) {
			JOptionPane.showMessageDialog(null, "Voô 10: Prejuizo", "Informação", JOptionPane.INFORMATION_MESSAGE);
		} else if (cont10 < 200 * 0.6) {
			JOptionPane.showMessageDialog(null, "Voô 10: Lucro", "Informação", JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, "Voô 10: Pagou", "Informação", JOptionPane.INFORMATION_MESSAGE);
		}

	}

}
