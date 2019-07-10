package bean;

public class Servico {

	private int id;
	private String servico;
	private double preco;
	
	
	public Servico(int id, String servico,double preco) {
		
		this.id = id;
		this.servico = servico;
		this.preco=preco;
	}
	public Servico( String servico,double preco) {
	
		
		this.servico = servico;
		this.preco=preco;
	}
	public Servico() {
		
	}
	//get and set
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getServico() {
		return servico;
	}
	public void setServico(String servico) {
		this.servico = servico;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
}
