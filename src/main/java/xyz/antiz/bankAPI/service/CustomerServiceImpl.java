package xyz.antiz.bankAPI.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.antiz.bankAPI.model.Customer;
import xyz.antiz.bankAPI.repository.CustomerRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;


    @Override
    public Customer createCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public Optional<Customer> getCustomerById(Long id) {
        return customerRepository.findById(id);
    }

    @Override
    public Customer updateCustomer(Customer upcustomer, Long id) {
        return customerRepository.findById(id).map(existing -> {
            existing.setFirstName(upcustomer.getFirstName());
            existing.setLastName(upcustomer.getLastName());
            existing.setEmail(upcustomer.getEmail());
            existing.setPhoneNumber(upcustomer.getPhoneNumber());
            return customerRepository.save(existing);

        }).orElseThrow(() -> new RuntimeException("customer data not found "));
    }

    @Override
    public void deleteCustomer(Long id) {
        if (customerRepository.findById(id).isPresent()) {
            customerRepository.deleteById(id);
        }else
    throw new RuntimeException("customer data not found ");
    }


}