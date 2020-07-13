package ar.edu.davinci.dvds20201cg5.servicio;


import java.util.List;
import java.util.Optional;

import org.apache.commons.collections4.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import ar.edu.davinci.dvds20201cg5.modelo.Cliente;
import ar.edu.davinci.dvds20201cg5.repositorio.ClienteRepositorio;

@Service
public class ClienteServicioImpl implements ClienteServicio {

	private final Logger LOGGER = LoggerFactory.getLogger(ClienteServicioImpl.class);
	 
	
	private final ClienteRepositorio clienteRepositorio;

	@Autowired
	public ClienteServicioImpl(final ClienteRepositorio clienteRepositorio) {
		this.clienteRepositorio = clienteRepositorio;
	}

	@Override
	public List<Cliente> listarClientes() {
		return clienteRepositorio.findAll();
	}

	@Override
	public Page<Cliente> listar(Pageable pageable) {
		LOGGER.info("Pagegable: offset: " + pageable.getOffset() + " - pageSize:" + pageable.getPageSize());
		return clienteRepositorio.findAll(pageable);
	}
	
	@Override
	public Cliente buscarClientePorId(Long clienteId) {

		Optional<Cliente> cliente = clienteRepositorio.findById(clienteId);
		if (cliente.isPresent()) {
			return cliente.get();
		}
		return null;
	}
	
	@Override
	public List<Cliente> buscarClienterPorApellido(String apellido) {
		LOGGER.info("buscarClienterPorApellido: apellido: " + apellido);
		List<Cliente> clientes = clienteRepositorio.searchByLastName(apellido);
		if (CollectionUtils.isNotEmpty(clientes)) {
			LOGGER.info("clientes.size: " + clientes.size());
			return clientes;
		} else {
			LOGGER.info("clientes empty");
			return (List<Cliente>) CollectionUtils.EMPTY_COLLECTION;
		}
	}

	@Override
	public Cliente grabarCliente(Cliente cliente) {
		return clienteRepositorio.save(cliente);
	}


	
	@Override
	public void borrarCliente(Long clienteId) {
		clienteRepositorio.deleteById(clienteId);
	}

}
