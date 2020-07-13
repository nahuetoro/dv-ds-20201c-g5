package ar.edu.davinci.dvds20201cg5.modelo;

public class ClientePojoBuilder {
	
	private Long id;
	private String name;
	private String lastName;
	private String email;
	private String password;
	
	public ClientePojoBuilder withId(Long id) {
		this.id = id;
		return this;
	}
	
	public ClientePojoBuilder withName(String name) {
		this.name = name;
		return this;
	}
	
	public ClientePojoBuilder withLastName(String lastName) {
		this.lastName = lastName;
		return this;
	}
	
	public ClientePojoBuilder withEmail(String email) {
		this.email = email;
		return this;
	}

	public ClientePojoBuilder withPassword(String password) {
		this.password = password;
		return this;
	}
	
	public ClientePojo build() {
		ClientePojo clientePojo = new ClientePojo();
		clientePojo.setId(id);
		clientePojo.setName(name);
		clientePojo.setLastName(lastName);
		clientePojo.setEmail(email);
		clientePojo.setPassword(password);
		return clientePojo;
	}
}
