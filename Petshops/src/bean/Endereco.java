package bean;

public class Endereco {

	public Endereco(int id,String rua,String bairro,String numero, String cidade,String cep,String estado) {
		this.id=id;
		this.rua=rua;
		this.bairro=bairro;
		this.numero=numero;
		this.cidade=cidade;
		this.cep=cep;
		this.estado=estado;
	}
	public Endereco(String rua,String bairro,String numero, String cidade,String cep,String estado) {
		
		this.rua=rua;
		this.bairro=bairro;
		this.numero=numero;
		this.cidade=cidade;
		this.cep=cep;
		this.estado=estado;
	}
	public Endereco() {
		
	}
	
	private int id;
	private String rua;
	private String bairro;
	private String numero;
	private  String cidade;
	private String cep;
	private String estado;
	
	//get and set
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
}
