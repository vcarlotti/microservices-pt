package br.com.clarobrasil.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.clarobrasil.model.Customer;
import br.com.clarobrasil.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	private CustomerService service;

	@RequestMapping("/welcome/customers")
	public String welcome() {
		return service.retrieveWelcomeMessage();
	}

	@GetMapping("/customers")
	public List<Customer> retrieveCustomers() {
		return service.retrieveCustomers();
	}

	@GetMapping("/customers/{customerId}")
	public Customer retrieveCustomersForId(@PathVariable Integer customerId) {
		return service.retrieveCustomersForId(customerId);
	}
}
