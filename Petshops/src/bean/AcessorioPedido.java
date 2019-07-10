package bean;

public class AcessorioPedido {

	
	private int id;
	private int idAcessorio;
	private int idCliente;
	
	public AcessorioPedido(int id, int idAcessorio, int idCliente) {
		this.id = id;
		this.idAcessorio = idAcessorio;
		this.idCliente = idCliente;
	}
	public AcessorioPedido( int idAcessorio, int idCliente) {		
		this.idAcessorio = idAcessorio;
		this.idCliente = idCliente;
	}
	public AcessorioPedido() {
		
	}
	//get and set
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdAcessorio() {
		return idAcessorio;
	}
	public void setIdAcessorio(int idAcessorio) {
		this.idAcessorio = idAcessorio;
	}
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	
}
