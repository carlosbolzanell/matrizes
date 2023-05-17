import javax.swing.JOptionPane;

public class testeFatura {

	public static void main(String[] args) {
		
		fatura produto1 = new fatura("1","Teclado", 2, 100.0);
		fatura produto2 = new fatura("2","Mouse", 2, 45.0);
		fatura produto3 = new fatura("3","Monitor", 1, 400.0);
		fatura produto4 = new fatura("4","Cabo HDMI", 2, 20.0);
		fatura produto5 = new fatura("5", "Headset", 1, 80.0);
		
		JOptionPane.showMessageDialog(null, "Numero: "+produto1.getNumero()+"\n"
				+"Descrição: "+produto1.getDescricao()+
				"\nQuantidade:"+produto1.getQuantidade()+
				"\nPreço:"+produto1.getPreco()+
				"\nFatura do Produto: "+produto1.getQuantidade()*produto1.getPreco(),"Informação",JOptionPane.INFORMATION_MESSAGE);
		
		JOptionPane.showMessageDialog(null, "Numero: "+produto2.getNumero()+"\n"
				+"Descrição: "+produto2.getDescricao()+
				"\nQuantidade: "+produto2.getQuantidade()+
				"\nPreço: "+produto2.getPreco()+
				"\nFatura do Produto: "+produto2.getQuantidade()*produto2.getPreco(),"Informação",JOptionPane.INFORMATION_MESSAGE);
		
		JOptionPane.showMessageDialog(null, "Numero: "+produto3.getNumero()+"\n"
				+"Descrição: "+produto3.getDescricao()+
				"\nQuantidade:"+produto3.getQuantidade()+
				"\nPreço:"+produto3.getPreco()+
				"\nFatura do Produto: "+produto3.getQuantidade()*produto3.getPreco(),"Informação",JOptionPane.INFORMATION_MESSAGE);
		
		JOptionPane.showMessageDialog(null, "Numero: "+produto4.getNumero()+"\n"
				+"Descrição: "+produto4.getDescricao()+
				"\nQuantidade:"+produto4.getQuantidade()+
				"\nPreço:"+produto4.getPreco()+
				"\nFatura do Produto: "+produto4.getQuantidade()*produto4.getPreco(),"Informação",JOptionPane.INFORMATION_MESSAGE);
		
		JOptionPane.showMessageDialog(null, "Numero: "+produto5.getNumero()+"\n"
				+"Descrição: "+produto5.getDescricao()+
				"\nQuantidade:"+produto5.getQuantidade()+
				"\nPreço:"+produto5.getPreco()+
				"\nFatura do Produto: "+produto5.getQuantidade()*produto5.getPreco(),"Informação",JOptionPane.INFORMATION_MESSAGE);
		
		//JOptionPane.showMessageDialog(null, "Fatura Total: "+nomeCompleto,"Informação",JOptionPane.INFORMATION_MESSAGE);
		
	}

}
