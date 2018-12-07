package br.com.ffroliva.intercom.dto;

import lombok.Builder;
import lombok.Data;

/**
 * CustomerDto used in the view.
 * @author Flavio Oliva <a href="mailto:ffroliva@gmail.com">ffroliva@gmail.com</a>
 */
@Data
@Builder
public class CustomerDto {
    private Integer id;
    private String name;
}
