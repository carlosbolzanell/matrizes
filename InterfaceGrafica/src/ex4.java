import javax.swing.JOptionPane;

public class ex4 {

	public static void main(String[] args) {
		
		Float nota = Float.parseFloat(JOptionPane.showInputDialog("Informe a nota: "));
		
		if(nota >=0 && nota <=10) {
			JOptionPane.showMessageDialog(null, "Nota: "+classNota(nota),"Informação",JOptionPane.INFORMATION_MESSAGE);
		}else {
			JOptionPane.showMessageDialog(null, "Nota Inválida!!","Informação",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	static char classNota(float nota) {
		
		if(nota >= 9.0) {
			return 'A';
		}else if(nota >= 8.0) {
			return 'B';
		}else if(nota >= 7.0) {
			return 'C';
		}else if (nota >= 6.0) {
			return 'D';
		}else if(nota >= 0.0){
			return 'E';
		}
		return 0;
	}

}
