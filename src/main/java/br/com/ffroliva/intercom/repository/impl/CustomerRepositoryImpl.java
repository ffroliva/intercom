package br.com.ffroliva.intercom.repository.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.ffroliva.intercom.model.Customer;
import br.com.ffroliva.intercom.repository.CustomerRepository;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Repository
public class CustomerRepositoryImpl implements CustomerRepository {
	private static final ObjectMapper MAPPER = new ObjectMapper();
	
	@Override
    public List<Customer> findCustomers(){
		List<Customer> customers = new ArrayList<>();
		ClassLoader classloader = Thread.currentThread().getContextClassLoader();
		URL url = classloader.getResource("customers.txt");
		Path path;
		try {
			path = Paths.get(url.toURI());
			List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
			for (String line : lines) {
				customers.add(convertJsonFileToCustomers(line));
			}
			return customers;
		} catch (URISyntaxException | IOException e) {
			e.printStackTrace();
		}
		return null;

		

    }
		
	private static Customer convertJsonFileToCustomers(String line) {
		try {
			return MAPPER.readValue(line, Customer.class);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

}