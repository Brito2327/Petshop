package bean;

public class Acessorio {

	private int Id;
	private String acessorio;
	private double preco;
	
	
	public Acessorio(int id,String acessorio,double preco) {
		this.acessorio=acessorio;
		this.Id=id;
		this.preco=preco;
	}
	public Acessorio(String acessorio,double preco) {
		this.acessorio=acessorio;
		this.preco=preco;
		
	}
	public Acessorio() {
		
	}
	//get and set
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getAcessorio() {
		return acessorio;
	}
	public void setAcessorio(String acessorio) {
		this.acessorio = acessorio;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
}
