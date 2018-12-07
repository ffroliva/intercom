package br.com.ffroliva.intercom.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

/**
 * Classe representing the customer's data model.
 * @author Flavio Oliva <a href="ffroliva@gmail.com">ffroliva@gmail.com</>
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Builder
public class Customer implements Comparable<Customer>, GeoLocation {

	@JsonProperty("user_id")
    private Integer id;
    private String name;
    private double latitude;
    private double longitude;

    @Override
    public int compareTo(Customer o) {
        if(this.id < o.getId()){
            return -1;
        } else if(this.id > o.getId()) {
            return 1;
        }
        return 0;
    }
}