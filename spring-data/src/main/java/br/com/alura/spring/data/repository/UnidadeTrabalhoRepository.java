package br.com.alura.spring.data.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import br.com.alura.spring.data.model.UnidadeTrabalho;

public interface UnidadeTrabalhoRepository extends CrudRepository<UnidadeTrabalho, Long>{

	Optional<UnidadeTrabalho> findById(Integer unidadeId);

	void deleteById(int id);

}
