package br.com.ffroliva.intercom.service.impl;

import br.com.ffroliva.intercom.dto.CustomerDto;
import br.com.ffroliva.intercom.model.Customer;
import br.com.ffroliva.intercom.model.enums.DistanceUnitEnum;
import br.com.ffroliva.intercom.repository.CustomerRepository;
import br.com.ffroliva.intercom.service.CustomerService;
import br.com.ffroliva.intercom.utils.CustomerConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

import static br.com.ffroliva.intercom.utils.Constants.DUBLIN_OFFICE_LATITUDE;
import static br.com.ffroliva.intercom.utils.Constants.DUBLIN_OFFICE_LONGITUDE;

/**
 * Services related to Customer entity.
 */
@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private DistanceServiceImpl distanceService;

	/**
	 * @see br.com.ffroliva.intercom.service.DistanceService#calculateDistance
	 */
	public List<CustomerDto> findCustomerWithinDistance(List<Customer> customers,
														double distance,
														DistanceUnitEnum unit) {
		return customers
		.stream()
		.filter(c -> isCustumerWithinDistanceRangeClosed(c,unit,distance))
		.sorted()
		.map(CustomerConverter::entityToDto)
		.collect(Collectors.toList());
	}


	public List<Customer> findCustomers(){
		return customerRepository
				.findCustomers()
				.stream()
				.sorted()
				.collect(Collectors.toList());
	}

	/**
	 * Check if a customer's geo location is within the give distance range.
	 * @param customer whose geo location is desired to be compared
	 * @param unit used to calculate the distance
	 * @param distance to be compared with
	 * @return true if the customer's geo location is smaller or equal then the distance compared
	 */
	private boolean isCustumerWithinDistanceRangeClosed(Customer customer, DistanceUnitEnum unit, double distance){
		double customerDistance = distanceService
				.calculateDistance(
						DUBLIN_OFFICE_LATITUDE,
						DUBLIN_OFFICE_LONGITUDE,
						customer,
						unit);
		return customerDistance <= distance;
	}

}
