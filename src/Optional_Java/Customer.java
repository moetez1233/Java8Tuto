package Optional_Java;

import java.util.List;

public class Customer {
	private int id;
	private String nom;
	private String email;
	private List<String> data;
	public Customer() {
		super();
	}
	public Customer(int id, String nom, String email, List<String> data) {
		super();
		this.id = id;
		this.nom = nom;
		this.email = email;
		this.data = data;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<String> getData() {
		return data;
	}
	public void setData(List<String> data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", nom=" + nom + ", email=" + email + ", data=" + data + "]";
	}
	
	

}
