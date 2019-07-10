package bean;

public class Categoria {
	
	public Categoria(int id,boolean cliente,boolean funcionario) {
		this.id=id;
		this.cliente=cliente;
		this.funcionario=funcionario;
	}
	public Categoria(boolean cliente,boolean funcionario) {
		
		this.cliente=cliente;
		this.funcionario=funcionario;
	}

	
	private int id;
	private boolean cliente;
	private boolean funcionario;
	
	//get and set
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public boolean isCliente() {
		return cliente;
	}
	public void setCliente(boolean cliente) {
		this.cliente = cliente;
	}
	public boolean isFuncionario() {
		return funcionario;
	}
	public void setFuncionario(boolean funcionario) {
		this.funcionario = funcionario;
	}
	
}
