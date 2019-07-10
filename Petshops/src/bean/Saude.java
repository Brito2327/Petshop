package bean;

public class Saude {

	private int id;
	private String tipo;
	private double preco;
	
	
	public Saude(int id, String tipo,double preco) {
		this.id = id;
		this.tipo = tipo;
		this.preco=preco;
	}
	public Saude( String tipo,double preco) {
		
		this.tipo = tipo;
		this.preco=preco;
	}
	public Saude() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
}
