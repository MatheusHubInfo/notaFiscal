package entites;

public class Produto {

	private String produto;
	private double preço;
	private int quantidade;
	
	public Produto() {
	}
	
	public Produto(double preço, int quantidade, String produto) {
		this.preço = preço;
		this.quantidade = quantidade;
		this.produto = produto;
	}

	public double getPreço() {
		return preço;
	}
	public void setPreço(double preço) {
		this.preço = preço;
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
