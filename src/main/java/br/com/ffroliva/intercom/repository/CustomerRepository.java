package br.com.ffroliva.intercom.repository;

import java.util.List;
import br.com.ffroliva.intercom.model.Customer;

public interface CustomerRepository {

    List<Customer> findCustomers();
}