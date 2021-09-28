package com.ec.g2g.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ec.g2g.entidad.Cliente;
import com.ec.g2g.entidad.Factura;

/**
 * Spring Data JPA repository for the Products entity.
 */
@SuppressWarnings("unused")
@Repository
public interface FacturaRepository extends CrudRepository<Factura, Long> {
	/*consulta por numero de factura u cliente*/
	Optional<Factura> findByFacNumeroAndIdCliente(String cliCedula, Cliente cliente);

}
