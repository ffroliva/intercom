package br.com.ffroliva.intercom.controller;


import br.com.ffroliva.intercom.dto.CustomerDto;
import br.com.ffroliva.intercom.model.Customer;
import br.com.ffroliva.intercom.model.enums.DistanceUnitEnum;
import br.com.ffroliva.intercom.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Controller that controls de APIs related to customers
 * @author Flavio Oliva <a href="mailto:ffroliva@gmail.com">ffroliva@gmail.com</a>
 */
@RestController
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @RequestMapping("/customers")
    public List<Customer> findCustomers() {
        return customerService.findCustomers();
    }

    @RequestMapping("/customers/within-distance/{distance}")
    public List<CustomerDto> findCustomersWithinDistance(@PathVariable(value = "distance") String distance) {
        List<Customer> customers = customerService.findCustomers();
        return customerService.findCustomerWithinDistance(
                customers,
                Double.valueOf(distance),
                DistanceUnitEnum.KILOMETERS);
    }

}
