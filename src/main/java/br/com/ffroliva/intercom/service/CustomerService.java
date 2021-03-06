package br.com.ffroliva.intercom.service;

import br.com.ffroliva.intercom.dto.CustomerDto;
import br.com.ffroliva.intercom.model.Customer;
import br.com.ffroliva.intercom.model.enums.DistanceUnitEnum;

import java.util.List;

/**
 * Interface with methods related to the entity Customer.
 * @author Flavio Oliva <a href="mailto:ffroliva@gmail.com">ffroliva@gmail.com</a>
 */
public interface CustomerService {

    /**
     * Fetch all the customers.
     *
     * @return a list of customers.
     */
    public List<Customer> findCustomers();

    /**
     * Fetch all the customers within a given distance and unit.
     *
     * @param customers list of customers to be filtered.
     * @param distance  maximum range of the customer to be fetched
     * @param unit      Enum of the unit chosen unit.
     * @return a list of customer's dto filtered by the given distance and it's unit.
     */
    public List<CustomerDto> findCustomerWithinDistance(List<Customer> customers,
                                                        double distance,
                                                        DistanceUnitEnum unit);
}
