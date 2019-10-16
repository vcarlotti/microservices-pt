package br.com.clarobrasil.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.clarobrasil.model.Occurrence;

public interface OccurrenceRepository extends CrudRepository<Occurrence, Long> {

	public Occurrence findById(final Long occurrenceId);

}