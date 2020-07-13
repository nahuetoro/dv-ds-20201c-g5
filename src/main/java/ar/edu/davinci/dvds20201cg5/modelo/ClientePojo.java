package ar.edu.davinci.dvds20201cg5.modelo;

public class ClientePojo {
	
	private Long id;
	private String name;
	private String lastName;
	private String email;
	private String password;
	

	// Constructor por default
	public ClientePojo() {
	}

	// Constructor por parámetros
	public ClientePojo(Long id, String name, String lastName, String email, String password) {
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
	}

	// Getters & Setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	// To String
	@Override
	public String toString() {
		return "ClientePojo [id=" + id + ", name=" + name + ", lastName=" + lastName + ", email=" + email
				+ ", password=" + password + "]";
	}

	// Hash Code
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		return result;
	}

	// Equals
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ClientePojo other = (ClientePojo) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		return true;
	}

}
