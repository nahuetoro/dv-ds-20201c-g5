package ar.edu.davinci.dvds20201cg5.servicio;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import ar.edu.davinci.dvds20201cg5.modelo.Cliente;

public interface ClienteServicio {
	
	public List<Cliente> listarClientes();
	
	public Page<Cliente> listar(Pageable pageable);
	
	public Cliente buscarClientePorId(Long clienteId);

	public List<Cliente> buscarClienterPorApellido(String apellido);
	
	public Cliente grabarCliente(Cliente cliente);

	public void borrarCliente(Long clienteId);

}
