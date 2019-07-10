package bean;

public class Usuario {

	private int id;
	private int idCategoria;
	private String email;
	private String senha;

	// construtor
	public Usuario(String email, String senha, int idCategoria) {

		this.email=email;
		this.senha=senha;
		this.idCategoria=idCategoria;
		
	}

	public Usuario(int id, String email, String senha, int idCategoria) {

		this.id=id;
		this.email=email;
		this.senha=senha;
		this.idCategoria=idCategoria;
	}

	public Usuario(String email, String senha) {

		this.email=email;
		this.senha=senha;
		
		
	}
	// get and set
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
