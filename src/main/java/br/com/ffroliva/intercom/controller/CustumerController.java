package br.com.ffroliva.intercom.controller;


import br.com.ffroliva.intercom.model.Customer;
import br.com.ffroliva.intercom.model.DistanceUnitEnum;
import br.com.ffroliva.intercom.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustumerController {

    @Autowired
    CustomerService customerService;

    @RequestMapping("/customers")
    public List<Customer> findCustomers() {
        return customerService.findCustomers();
    }

    @RequestMapping("/customers/within-distance/{distance}")
    public List<Customer> findCustomerWithinDistance(@PathVariable(value="distance") String distance) {
        List<Customer> custumers = customerService.findCustomers();
        return customerService.findCustomerWithinDistance(custumers, Double.valueOf(distance), DistanceUnitEnum.KILOMETERS);
    }

}
