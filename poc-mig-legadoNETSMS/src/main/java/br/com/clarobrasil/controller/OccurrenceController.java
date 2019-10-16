package br.com.clarobrasil.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.clarobrasil.model.Occurrence;
import br.com.clarobrasil.service.OccurrenceService;

@RestController
public class OccurrenceController {

	@Autowired
	private OccurrenceService service;

	@RequestMapping("/welcome/occurrences")
	public String welcome() {
		return service.retrieveWelcomeMessage();
	}

	@GetMapping("/occurrences/{occurrencesId}")
	public Occurrence retrieveOccurrencesForId(@PathVariable Long occurrencesId) {
		return service.retrieveOccurrencesForId(occurrencesId);
	}
}
