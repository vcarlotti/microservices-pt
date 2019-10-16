package br.com.clarobrasil.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import br.com.clarobrasil.model.Customer;

@Component
public class CustomerService {

	public String retrieveWelcomeMessage() {
		return "Welcome Customer.";
	}

	public List<Customer> retrieveCustomers() {
		final List<Customer> customers = new ArrayList<Customer>();
		Customer customer = new Customer();
		customer.setId(1);
		customer.setDescription("Customer " + customer.getId());
		customers.add(customer);

		customer = new Customer();
		customer.setId(2);
		customer.setDescription("Customer " + customer.getId());
		customers.add(customer);

		return customers;

	}
	
	
	public Customer retrieveCustomersForId(final Integer customerId) {
		final List<Customer> customers = new ArrayList<Customer>();
		Customer customer = new Customer();
		customer.setId(1);
		customer.setDescription("Customer " + customer.getId());
		customers.add(customer);

		customer = new Customer();
		customer.setId(2);
		customer.setDescription("Customer " + customer.getId());
		customers.add(customer);

		return customers.get(customerId - 1);

	}
}
