package model;

public class Userposjava {
	
	private long id;
	private String nome;
	private String email;
	
	//Construtores
	public void userposjava() {
		
	}
	
	public void userposjava(long id, String nome, String email) {
		this.id = id;
		this.nome = nome;
		this.email = email;
	}
	
	//Setters e getters
	public long getId() {
		return id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getEmail() {
		return email;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	public void setNome(String Nome) {
		this.nome = nome;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	//Métodos
	
	
}
