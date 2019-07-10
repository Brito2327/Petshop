package bean;

public class Agendamento {

	
	private int id;
	private String data;
	private String hora;
	private boolean buscar;
	
	public Agendamento(int id, String data, String hora, boolean buscar) {
		this.id = id;
		this.data = data;
		this.hora = hora;
		this.buscar = buscar;
	}
	public Agendamento(String data, String hora, boolean buscar) {
		
		this.data = data;
		this.hora = hora;
		this.buscar = buscar;
	}
	public Agendamento() {
		
	}
	//get and set
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public boolean isBuscar() {
		return buscar;
	}
	public void setBuscar(boolean buscar) {
		this.buscar = buscar;
	} 
	
	
}
