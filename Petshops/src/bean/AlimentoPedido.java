package bean;

public class AlimentoPedido {

	
	private int id;
	private int idAlimento;
	private int idCliente;
	
	public AlimentoPedido(int id, int idAlimento, int idCliente) {
		this.id = id;
		this.idAlimento = idAlimento;
		this.idCliente = idCliente;
	}
	public AlimentoPedido( int idAlimento, int idCliente) {
		
		this.idAlimento = idAlimento;
		this.idCliente = idCliente;
	}
	public AlimentoPedido() {
		
	}
	//get and set
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdAlimento() {
		return idAlimento;
	}
	public void setIdAlimento(int idAlimento) {
		this.idAlimento = idAlimento;
	}
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
}
