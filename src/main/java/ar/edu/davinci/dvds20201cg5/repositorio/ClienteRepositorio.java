package ar.edu.davinci.dvds20201cg5.repositorio;

import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import ar.edu.davinci.dvds20201cg5.modelo.Cliente;

@Repository("clienteRepository")
public interface ClienteRepositorio extends JpaRepository<Cliente, Long>{
	
	public List<Cliente> searchByLastName(@Param("apellido") String lastName) throws DataAccessException;

    //public Cliente findById(int id) throws DataAccessException;
}
