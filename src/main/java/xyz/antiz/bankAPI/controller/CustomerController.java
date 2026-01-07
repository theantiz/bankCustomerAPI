package xyz.antiz.bankAPI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import xyz.antiz.bankAPI.model.Customer;
import xyz.antiz.bankAPI.service.CustomerService;

import java.util.List;

@RequestMapping("/api/customer")
@Controller
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/test")
    public String testController() {
        return "TestController";
    }

    @GetMapping()
    public ResponseEntity<List<Customer>> getAllCustomers() {
        return ResponseEntity.ok().body(customerService.getAllCustomers());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Customer> GetCustomerById(@PathVariable("id") Long id) {
        return customerService.getCustomerById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Customer> deleteCustomer(@PathVariable("id") Long id) {
        try {
            customerService.deleteCustomer(id);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping()
    public ResponseEntity<Customer> CreateCustomer(@RequestBody Customer customer) {
        return ResponseEntity.ok(customerService.createCustomer(customer));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Customer> UpdateCustomer(@RequestBody Customer customer, @PathVariable Long id) {
        try {
            return ResponseEntity.ok(customerService.updateCustomer(customer, id));
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

}
