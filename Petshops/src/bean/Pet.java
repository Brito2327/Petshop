package bean;

public class Pet {
	private int id;
	private String nome;
	private String raca;
	private String peso;
	private String idade;
	private String sexo;
	private String foto;
	private String observacao;

	

	public Pet(int id, String nome, String raca, String peso, String idade, String sexo, String foto,
			String observacao) {
		this.id = id;
		this.nome = nome;
		this.raca = raca;
		this.peso = peso;
		this.idade = idade;
		this.sexo = sexo;
		this.foto = foto;
		this.observacao = observacao;
	}
	public Pet( String nome, String raca, String peso, String idade, String sexo, String foto,
			String observacao) {
		
		this.nome = nome;
		this.raca = raca;
		this.peso = peso;
		this.idade = idade;
		this.sexo = sexo;
		this.foto = foto;
		this.observacao = observacao;
	}
	public Pet() {
		
	}

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

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public String getPeso() {
		return peso;
	}

	public void setPeso(String peso) {
		this.peso = peso;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

}
