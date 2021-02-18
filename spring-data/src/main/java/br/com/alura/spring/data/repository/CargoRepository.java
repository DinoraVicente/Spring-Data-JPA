package br.com.alura.spring.data.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.alura.spring.data.model.Cargo;

@Repository
public interface CargoRepository extends CrudRepository<Cargo, Long>{

	Optional<Cargo> findById(Integer cargoId);
}