import java.awt.GridBagLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class ex1 {

	public static void main(String[] args) {
		
		int pInicial = Integer.parseInt(JOptionPane.showInputDialog("Informe a posição inicial: "));
		int pFinal = Integer.parseInt(JOptionPane.showInputDialog("Informe a posição final: "));
		int passos = Integer.parseInt(JOptionPane.showInputDialog("Informe o tamanho dos passos: "));


		JOptionPane.showMessageDialog(null,"Total de passos: "+atravessaRua(pInicial, pFinal, passos),"Passos",JOptionPane.INFORMATION_MESSAGE); 
	}
	static int atravessaRua(int pInicial, int pFinal, int passos) {
		int passosDados=0;
		
		for(int total = pInicial; total<=pFinal; total+= passos) {
			passosDados++;
		}
		
		return passosDados;
	}

}
