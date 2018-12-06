package br.com.ffroliva.intercom.repository;

import br.com.ffroliva.intercom.model.Customer;

import java.util.List;

public interface CustomerRepository {

    List<Customer> findCustomers();
}