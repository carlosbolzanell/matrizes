
public class Aeroporto {
	int numeroVoo;
	String aviao;
	float preco;
	
	public Aeroporto(int numeroVoo, String aviao, float preco) {
		super();
		this.numeroVoo = numeroVoo;
		this.aviao = aviao;
		this.preco = preco;
	}
	
	public int getNumeroVoo() {
		return numeroVoo;
	}
	public void setNumeroVoo(int numeroVoo) {
		this.numeroVoo = numeroVoo;
	}
	public String getAviao() {
		return aviao;
	}
	public void setAviao(String aviao) {
		this.aviao = aviao;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}

}
