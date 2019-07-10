package bean;

public class Pedido {

	
	
	private int id;
	private int idAlimentoPedido;
	private int idAcessorioPedido;
	private int idSaudePedido;
	private int idhigienePedido;
	private int idServico;
	private int idAgendamento;
	
	
	public Pedido(int id, int idAlimentoPedido, int idAcessorioPedido, int idSaudePedido, int idhigienePedido,
			int idServico, int idAgendamento) {
		this.id = id;
		this.idAlimentoPedido = idAlimentoPedido;
		this.idAcessorioPedido = idAcessorioPedido;
		this.idSaudePedido = idSaudePedido;
		this.idhigienePedido = idhigienePedido;
		this.idServico = idServico;
		this.idAgendamento = idAgendamento;
	}
	public Pedido( int idAlimentoPedido, int idAcessorioPedido, int idSaudePedido, int idhigienePedido,
			int idServico, int idAgendamento) {
		
		this.idAlimentoPedido = idAlimentoPedido;
		this.idAcessorioPedido = idAcessorioPedido;
		this.idSaudePedido = idSaudePedido;
		this.idhigienePedido = idhigienePedido;
		this.idServico = idServico;
		this.idAgendamento = idAgendamento;
	}
	public Pedido() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdAlimentoPedido() {
		return idAlimentoPedido;
	}
	public void setIdAlimentoPedido(int idAlimentoPedido) {
		this.idAlimentoPedido = idAlimentoPedido;
	}
	public int getIdAcessorioPedido() {
		return idAcessorioPedido;
	}
	public void setIdAcessorioPedido(int idAcessorioPedido) {
		this.idAcessorioPedido = idAcessorioPedido;
	}
	public int getIdSaudePedido() {
		return idSaudePedido;
	}
	public void setIdSaudePedido(int idSaudePedido) {
		this.idSaudePedido = idSaudePedido;
	}
	public int getIdhigienePedido() {
		return idhigienePedido;
	}
	public void setIdhigienePedido(int idhigienePedido) {
		this.idhigienePedido = idhigienePedido;
	}
	public int getIdServico() {
		return idServico;
	}
	public void setIdServico(int idServico) {
		this.idServico = idServico;
	}
	public int getIdAgendamento() {
		return idAgendamento;
	}
	public void setIdAgendamento(int idAgendamento) {
		this.idAgendamento = idAgendamento;
	}
	
}
