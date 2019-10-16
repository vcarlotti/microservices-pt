package br.com.clarobrasil;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.clarobrasil.service.OccurrenceService;

@SpringBootApplication
public class ApplicationPOCMigNETSMS {

	OccurrenceService occurrenceService;

	public static void main(String[] args) {
		SpringApplication.run(ApplicationPOCMigNETSMS.class, args);
	}
}
