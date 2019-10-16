package br.com.clarobrasil.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.clarobrasil.model.Occurrence;
import br.com.clarobrasil.repository.OccurrenceRepository;
import br.com.clarobrasil.service.OccurrenceService;

@Component
public class OccurrenceServiceImpl implements OccurrenceService {

	private static final Logger log = LoggerFactory.getLogger(OccurrenceServiceImpl.class);

	@Autowired
	private OccurrenceRepository repository;

	public String retrieveWelcomeMessage() {
		return "Welcome Occurrences.";
	}

	public Occurrence retrieveOccurrencesForId(final Long occurrenceId) {
		Occurrence occurrence = repository.findById(occurrenceId);
		log.info("Occurrence " + occurrenceId);
		return occurrence;
	}
}
