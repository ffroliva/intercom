package br.com.ffroliva.intercom;

import br.com.ffroliva.intercom.dto.CustomerDto;
import br.com.ffroliva.intercom.model.Customer;
import br.com.ffroliva.intercom.model.enums.DistanceUnitEnum;
import br.com.ffroliva.intercom.service.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
@Slf4j
public class IntercomApplication implements CommandLineRunner {
	
	@Autowired
	CustomerService customerService;

	public static void main(String[] args) {
		SpringApplication.run(IntercomApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<Customer> customers = customerService.findCustomers();
		List<CustomerDto> customersWithinDistance = customerService
				.findCustomerWithinDistance(
						customers, 
						100, 
						DistanceUnitEnum.KILOMETERS);
		//log.info(customers.toString());
		//log.info(customersWithinDistance.toString());
		System.out.println(customers.toString());
		System.out.println(customersWithinDistance.toString());
	}
}
