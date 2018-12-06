package br.com.ffroliva.intercom.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ffroliva.intercom.model.Customer;
import br.com.ffroliva.intercom.model.DistanceUnitEnum;
import br.com.ffroliva.intercom.repository.CustomerRepository;

import static br.com.ffroliva.intercom.util.Constants.*;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private DistanceService distanceService;
	
	public List<Customer> findCustomerWithinDistance(List<Customer> customers, double distance, DistanceUnitEnum unit) {
		return customers
		.stream()
		.filter(c -> distanceService
				.calculateDistance(
						DUBLIN_OFFICE_LATITUDE, 
						DUBLIN_OFFICE_LONGITUDE, 
						c.getLatitude(), 
						c.getLongitude(), 
						unit) <= distance)
		.collect(Collectors.toList());
	}
	
	public List<Customer> findCustomers(){
		return customerRepository.findCustomers();
	}

}
