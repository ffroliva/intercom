package br.com.ffroliva.intercom.dto;

import br.com.ffroliva.intercom.model.enums.DistanceUnitEnum;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

/**
 * CustomerDto used in the view.
 * @author Flavio Oliva <a href="mailto:ffroliva@gmail.com">ffroliva@gmail.com</a>
 */
@Data
@Builder
public class CustomerDto {
    @JsonProperty("user_id")
    private Integer id;
    private String name;
    private double distance;
    @JsonProperty("distance_unit")
    private String unit;
}
