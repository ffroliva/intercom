package br.com.ffroliva.intercom;

import br.com.ffroliva.intercom.service.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Applicantion's entry point.
 *
 * @author Flavio Oliva <a href="mailto:ffroliva@gmail.com">ffroliva@gmail.com</a>
 */
@SpringBootApplication
@Slf4j
public class IntercomApplication {

    @Autowired
    CustomerService customerService;

    public static void main(String[] args) {
        SpringApplication.run(IntercomApplication.class, args);
    }
}
