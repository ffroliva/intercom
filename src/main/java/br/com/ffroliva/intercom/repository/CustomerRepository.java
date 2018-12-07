package br.com.ffroliva.intercom.repository;

import br.com.ffroliva.intercom.model.Customer;

import java.util.List;

/**
 * Interface with methods related to the customer entity.
 */
public interface CustomerRepository {

    /**
     * Fetch all the customers.
     * @return list of customers.
     */
    List<Customer> findCustomers();
}