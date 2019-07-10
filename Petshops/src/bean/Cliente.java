package bean;

public class Cliente {

	public Cliente(int id,String nome,String email,String telefone,int idUsuario,int endereco) {
		this.id=id;
		this.nome=nome;
		this.email=email;
		this.telefone=telefone;
		
		this.idUsuario=idUsuario;
		
		this.endereco=endereco;
		
	}
	public Cliente(String nome,String email,String telefone,int idUsuario,int endereco) {
		
		this.nome=nome;
		this.email=email;
		this.telefone=telefone;
		this.endereco=endereco;
		this.idUsuario=idUsuario;
		
		
	}
	public Cliente() {
		
	}
	
	private int id;
	private  String nome;
	private String email;
	private String telefone;
	
	private int endereco;
	private int idUsuario;
	
	
	//get and set
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	

	public int getEndereco() {
		return endereco;
	}
	public void setEndereco(int endereco) {
		this.endereco = endereco;
	}
	public int getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	
	
}
