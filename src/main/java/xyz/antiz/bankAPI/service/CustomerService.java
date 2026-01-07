package xyz.antiz.bankAPI.service;

import xyz.antiz.bankAPI.model.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerService {
public Customer createCustomer(Customer customer);
public List<Customer> getAllCustomers();
public Optional<Customer> getCustomerById(Long id);
public Optional<Customer> updateCustomer(Customer customer, Long id);

}
