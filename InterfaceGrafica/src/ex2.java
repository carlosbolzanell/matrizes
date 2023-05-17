import java.awt.GridBagLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ex2 {
	static int saldo;

	public static void main(String[] args) {
		
		int conta = Integer.parseInt(JOptionPane.showInputDialog("      Conta Bancária      \n"
				+ "Saldo: "+saldoInicial()+"\n"
						+ "1 - Sacar\n"
						+ "2 - Depositar"));	
		
		switch(conta) {
		case 1:
			sacar();
			mostrarSaldo();
			break;
		case 2: 
			depositar();
			mostrarSaldo();
		}
	}
	static int saldoInicial() {
		
		saldo = Integer.parseInt(JOptionPane.showInputDialog("Informe o saldo: "));
		return saldo;
	}
	static void sacar() {
		int saque = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor do saque: "));
		if(saque <= saldo) {
			saldo -= saque;
		}else {
			JOptionPane.showMessageDialog(null,"Saque Indisponivél!! ","Resultado",JOptionPane.INFORMATION_MESSAGE);
			mostrarSaldo();
		}
		
		
		
		
	}
	static void depositar(){
		
		int deposito = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor do deposito: "));
		saldo += deposito;
		
	}
	static void mostrarSaldo() {
		int contaAtual = Integer.parseInt(JOptionPane.showInputDialog("      Conta Bancária      \n"
				+ "Saldo: "+saldo+"\n"
						+ "1 - Sacar\n"
						+ "2 - Depositar"));	
		
		switch(contaAtual) {
		case 1:
			sacar();
			mostrarSaldo();
			break;
		case 2: 
			depositar();
			mostrarSaldo();
		}
	}

}
