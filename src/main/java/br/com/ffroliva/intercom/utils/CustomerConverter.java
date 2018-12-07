package br.com.ffroliva.intercom.utils;

import br.com.ffroliva.intercom.dto.CustomerDto;
import br.com.ffroliva.intercom.model.Customer;

public class CustomerConverter {
    
    public static Customer dtoToEntity(CustomerDto customerDto) {
        return Customer.builder()
                .id(customerDto.getId())
                .name(customerDto.getName())
                .build();
    }
    public static CustomerDto entityToDto(Customer customer) {
        return CustomerDto.builder()
                .id(customer.getId())
                .name(customer.getName())
                .build();
    }
}
