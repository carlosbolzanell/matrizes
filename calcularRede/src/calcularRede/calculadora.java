
package calcularRede;
import javax.swing.JOptionPane;

public class calculadora {

	public static void main(String[] args) {
		String ip = JOptionPane.showInputDialog("Informe o IP: ");
		String preMascara = JOptionPane.showInputDialog("Informe a máscara: ");
		
		String mascara = getMascara(preMascara);
		
		JOptionPane.showMessageDialog(null, "Mascara: "+mascara,"Informação",JOptionPane.INFORMATION_MESSAGE);
		
		String[] binario1 = new String [8];
		
		int ip1 = getBinarioMasc(mascara, binario1);
		
		System.out.print("\n");
		
		getBinarioIp(ip, ip1, binario1);

	}
	static String getMascara(String preMascara) {
		
		int pMascara = Integer.parseInt(preMascara);
		String mascara;
		Integer conta =0;
		int cont = 128;
		
		if(pMascara == 8) {
			return "255.0.0.0";
		}else if(pMascara == 16) {
			return "255.255.0.0";
		}else if(pMascara == 24) {
			return "255.255.255.0";
		}else if(pMascara == 30) {
			return "255.255.255.252";
		}
		
		if(pMascara < 8) {
			for(int i = 0; i<pMascara; i++) {
				conta += cont;
				cont /=2;
			}
			mascara = conta+".0.0.0";
			return mascara;
			
		}else if(pMascara < 16) {
			int resto = pMascara - 8;
			
			for(int i = 0; i<resto; i++) {
				conta += cont;
				cont /=2;
			}
			mascara = "255."+conta+".0.0";
			return mascara;
			
		}else if(pMascara < 24) {
			int resto = pMascara - 16;
			
			for(int i = 0; i<resto; i++) {
				conta += cont;
				cont /=2;
			}
			mascara = "255.255."+conta+".0";
			return mascara;
			
		}else if(pMascara < 31) {
			int resto = pMascara - 24;
			
			for(int i = 0; i<resto; i++) {
				conta += cont;
				cont /=2;
			}
			mascara = "255.255.255."+conta;
			return mascara;
		}
		return null;
		
	
		
	}
	static int getBinarioMasc(String mascara, String[] binario1) {
		
		String[] casa = mascara.split("\\.");
		String[] binario = new String[8];
		
		for(int i=0; i<4; i++) {
			int masc = Integer.parseInt(casa[i]);
			if(masc > 0 && masc < 255) {
				int cont = 128;
				for(int j=0; j<8; j++) {
					if(masc - cont >= 0) {
						binario[j] = "1";
						binario1[j] = "1";
						masc -= cont;
						cont /= 2;
					}else {
						binario[j] = "0";
						binario1[j] = "0";
						masc -= cont;
						cont /= 2;
					}
					System.out.print(binario[j]);
				}
				return i;
			}
		}
		return 0;
		
	}
	static void getBinarioIp(String ip, int ip1, String[] binario1) {
		
		String[] casa = ip.split("\\.");
		String[] binario = new String[8];
		
		int masc = Integer.parseInt(casa[ip1]);
		int cont = 128;
		for(int j=0; j<8; j++) {
			if(masc - cont >= 0) {
				binario[j] = "1";
				masc -= cont;
				cont /= 2;
			}else {
				binario[j] = "0";
				cont /= 2;
			}
				System.out.print(binario[j]);
			}
		
		String[] boolean1 = new String[8]; 
		
		System.out.print("\n");
		
		for(int i=0; i<8; i++) {
			if(binario[i].equals("1") && binario[i] == binario1[i]) {
				boolean1[i] = "1";
			}else {
				boolean1[i] = "0";
			}
			System.out.print(boolean1[i]);
		}
		
		int decBoolean=0;
		int cont1 = 128;
		
		for(int i=0; i<8; i++) {
			if(boolean1[i].equals("1")) {
				decBoolean += cont1;
				cont1 /= 2;
			}else {
				cont1 /= 2;
			}
		}
		System.out.print("\n");
		System.out.print(decBoolean);
	}
	
}
