package bean;

public class SaudePedido {

	private int id;
	private int idSaude;
	private int idcliente;
	
	
	public SaudePedido(int id, int idSaude, int idcliente) {
		this.id = id;
		this.idSaude = idSaude;
		this.idcliente = idcliente;
	}
	public SaudePedido( int idSaude, int idcliente) {
		
		this.idSaude = idSaude;
		this.idcliente = idcliente;
	}
	public SaudePedido() {
		
	}
	//get and set
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdSaude() {
		return idSaude;
	}
	public void setIdSaude(int idSaude) {
		this.idSaude = idSaude;
	}
	public int getIdcliente() {
		return idcliente;
	}
	public void setIdcliente(int idcliente) {
		this.idcliente = idcliente;
	}
	
}
