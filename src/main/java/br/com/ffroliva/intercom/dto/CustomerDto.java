package br.com.ffroliva.intercom.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CustomerDto {
    private Integer id;
    private String name;
}
