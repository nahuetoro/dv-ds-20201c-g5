package ar.edu.davinci.dvds20201cg5.repositorio;

import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import ar.edu.davinci.dvds20201cg5.modelo.OrdenItem;

@Repository("ordenItemRepositorio")
public interface OrdenItemRepositorio extends JpaRepository<OrdenItem, Long>{

    //public List<Orden> searchByName(@Param("nombre") String name) throws DataAccessException;

}
