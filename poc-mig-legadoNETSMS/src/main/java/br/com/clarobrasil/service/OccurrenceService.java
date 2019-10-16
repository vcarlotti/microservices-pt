package br.com.clarobrasil.service;

import br.com.clarobrasil.model.Occurrence;

public interface OccurrenceService {

	public String retrieveWelcomeMessage();

	public Occurrence retrieveOccurrencesForId(final Long occurrenceId);
}
