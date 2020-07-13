package ar.edu.davinci.dvds20201cg5.modelo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.davinci.dvds20201cg5.modelo.ClienteLombok;

import static org.hamcrest.MatcherAssert.assertThat;


import static org.hamcrest.CoreMatchers.*;


public class ClienteLombokTest {

	ClienteLombok cliente;
	ClienteLombok clienteConValor;
	ClienteLombok clienteBuilder;

	@BeforeEach
	private void setUp(){
		cliente = new ClienteLombok();
		clienteConValor = new ClienteLombok(1L, "Nombre", "Apellido", "pp@pp.com", "1234");
		clienteBuilder = ClienteLombok.builder()
				.id(2L)
				.name("Nombre")
				.lastName("Apellido")
				.email("ee@ee.com")
				.password("3333")
				.build();
	}
	
	@Test
	public void testClienteVacio() {
		System.out.println(cliente);
		assertThat(cliente, not(nullValue()));
		assertThat(cliente.getId(), is(nullValue()));
	}

	@Test
	public void testClienteConValor() {
		System.out.println(clienteConValor);
		assertThat(clienteConValor, not(nullValue()));
		assertThat(clienteConValor.getId(), not(nullValue()));
		assertThat(clienteConValor.getId(), equalTo(1L));
		assertThat(clienteConValor.getEmail(), equalTo("pp@pp.com"));
	}

	@Test
	public void testClienteBuilder() {
		System.out.println(clienteBuilder);
		assertThat(clienteBuilder, not(nullValue()));
		assertThat(clienteBuilder.getId(), not(nullValue()));
		assertThat(clienteBuilder.getId(), equalTo(2L));
		assertThat(clienteBuilder.getEmail(), equalTo("ee@ee.com"));
		

	}
}
