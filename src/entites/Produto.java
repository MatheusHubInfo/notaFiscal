package entites;

public class Produto {

	private String produto;
	private double pre�o;
	private int quantidade;
	
	public Produto() {
	}
	
	public Produto(double pre�o, int quantidade, String produto) {
		this.pre�o = pre�o;
		this.quantidade = quantidade;
		this.produto = produto;
	}

	public double getPre�o() {
		return pre�o;
	}
	public void setPre�o(double pre�o) {
		this.pre�o = pre�o;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public String getProduto() {
		return produto;
	}
	public void setProduto(String produto) {
		this.produto = produto;
	}
		
}
