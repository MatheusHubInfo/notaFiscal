package entites;

import java.util.Date;

public class Cliente {

	private String name;
	private String email;
	private Date data;

	public Cliente() {
	}

	public Cliente(String name, double preço, String email, String produto, int quantidade, String PROCESSING) {
		this.name = name;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String toString() {
		return "Name : " + name + ", Email : " + email;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
	
}
