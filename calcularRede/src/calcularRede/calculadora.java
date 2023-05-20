
package calcularRede;
import javax.swing.JOptionPane;

public class calculadora {

	public static void main(String[] args) {
		String ip = JOptionPane.showInputDialog("Informe o IP: ");
		String preMascara = JOptionPane.showInputDialog("Informe a máscara: ");
		
		String mascara = getMascara(preMascara);
		
		String[] binario1 = new String [8];
		
		int ip1 = getBinarioMasc(mascara, binario1);
		
		int rede = getBinarioIp(ip, ip1, binario1);
		
		String redeFinal = getRede(ip, ip1, rede);
		
		String broadcast = getBroadcast(redeFinal, binario1, ip, ip1);
		
		JOptionPane.showMessageDialog(null, "Informações: "+"\nRede: "+redeFinal+"\nBroadcast: "+broadcast,"Informação",JOptionPane.INFORMATION_MESSAGE);
		

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
					
				}
				
				return i;
			}else if(masc == 0) {
				for(int j=0; j<8; j++) {
					binario1[j] = "1";
					
				}
				return i-1;
			}
		}
		return 3;
		
	}
	static int getBinarioIp(String ip, int ip1, String[] binario1) {
		
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
				
			}
		
		String[] boolean1 = new String[8]; 
		
		System.out.print("\n");
		
		for(int i=0; i<8; i++) {
			if(binario[i].equals("1") && binario[i] == binario1[i]) {
				boolean1[i] = "1";
			}else {
				boolean1[i] = "0";
			}
			
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
		return decBoolean;
	}
	static String getRede(String ip, int ip1, Integer rede) {
		
		String[] rede1 = ip.split("\\.");
		
		String rede2 = rede.toString();
		
		rede1[ip1] = rede2;
		String rede3 = "";
		
		if(ip1 == 0) {
			rede3 = rede2+".0.0.0"; 
		}else if(ip1 == 1) {
			rede3 = rede1[0]+"."+rede2+".0.0"; 
		}else if(ip1 == 2) {
			rede3 = rede1[0]+"."+rede1[1]+"."+rede2+".0";
		}else {
			rede3 = rede1[0]+"."+rede1[1]+"."+rede1[2]+"."+rede2;
		}
		return rede3;
	}
	static String getBroadcast(String redeFinal, String[] binario1, String ip, int ip1) {
		
		String[] rede1 = ip.split("\\.");
		String redeFinal1 = redeFinal.split("\\.")[ip1];
		
		int cont1 = 256;
		
		for(int i=0; i<8; i++) {
			if(binario1[i].equals("1")) {
				cont1 /= 2;
			}
		}
		int rede = Integer.parseInt(redeFinal1);

		int rede2 = rede + cont1-1;
		
		String broadcast = "";
		
		if(ip1 == 0) {
			broadcast = rede2+".255.255.255"; 
		}else if(ip1 == 1) {
			broadcast = rede1[0]+"."+rede2+".255.255"; 
		}else if(ip1 == 2) {
			broadcast = rede1[0]+"."+rede1[1]+"."+rede2+".255";
		}else {
			broadcast = rede1[0]+"."+rede1[1]+"."+rede1[2]+"."+rede2;
		}
		return broadcast;
		
	}
}