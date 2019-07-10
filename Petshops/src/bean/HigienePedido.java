package bean;

public class HigienePedido {

	
	private int id;
	private int idHigiene;
	private int idCliente;

	public HigienePedido(int id, int idHigiene, int idCliente) {
		this.id = id;
		this.idHigiene = idHigiene;
		this.idCliente = idCliente;
	}
	public HigienePedido( int idHigiene, int idCliente) {
		this.idHigiene = idHigiene;
		this.idCliente = idCliente;
	}
	public HigienePedido() {
	
	}
	//	get and set;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdHigiene() {
		return idHigiene;
	}
	public void setIdHigiene(int idHigiene) {
		this.idHigiene = idHigiene;
	}
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	
}
